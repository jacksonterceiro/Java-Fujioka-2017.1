/*TODO: TESTES:
* Endereço com espaço;
* NextCharLimited - verificar se oq o usuario digitou esta de acordo com os args
* Fazer o next int limited para pessoal fisica e juridica
* Tratar a entrada null <enter> do nextChar
* NullPointerException
* 
* FALTA:
* Deixar iniciais do nome do cliente sempre em maiusculo;
* Tratar a entrada do valor do imovel com ponto - FLOAT;
* Tratar a entrada do valor do imovel com letra;
* verificar se o arquivo está vazio - se sim nao pule linha na hora de adicionar (Class verificaArquivoVazio).
* Adicionar tronw exception e tratar metodos static tudo fora da função.
* 
*/
package br.unipe.java.seguradora1;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		int op = 0;
		Cliente cliente = new Cliente();
		Dados menu = new Dados();
		
		while(true){
		
			Dados.clearScreen();
			op = menu.Menu();
			
			
			switch(op){
				case 1:	
					String payLoad = "";
					
					cliente = menu.solicitaDadosCliente(cliente);
				
					while(true){
				
						int opTipoCliente = menu.MenuFisicaJuridica();
						
						if(opTipoCliente == 1){
							//solicita dados RESIDENCIAL
							Residencial contrato = new Residencial();
							cliente = Dados.adicionaCharTipoCliente(cliente, 'F');
							contrato = menu.solicitaDadosResidencial(contrato);
							cliente = Dados.adicionaClassResidencialCliente(cliente, contrato);
							//Criar um metodo para adicionar Residencial dentro de cliente;
							Dados.imprimeDadosClienteContrato(cliente); 
							Thread.sleep(3000);
							break;
							
						} else if(opTipoCliente == 2){
							//solicita dados EMPRESARIAL
							Empresarial contrato = new Empresarial();
							cliente = Dados.adicionaCharTipoCliente(cliente, 'J');
							contrato = menu.solicitaDadosEmpresarial(contrato);
							cliente = Dados.adicionaClassEmpresarialCliente(cliente, contrato);
							//Criar um metodo para adicionar Empresarial dentro de cliente;
							Dados.imprimeDadosClienteContrato(cliente); 
							Thread.sleep(3000);
							break;
							
						}else{
							System.out.println("Opcao Invalida!!");
						}
					
					}
					
					//Armazena dados em arquivo.
					payLoad = PayLoad.montaPayLoad(cliente);
					Arquivo.addArquivo(payLoad);
					
				break;
				
			case 2:
				
				//Guardar no arquivo os dados do cliente.
				//quando selecionado esse case, listar uma lista de nomes de clientes cadastrado.
				if(Arquivo.logExiste()){
					ArrayList<String> lista = new ArrayList<String>();
					lista = Arquivo.lerArquivo();
					
					ArrayList<Cliente> arrayCliente = new ArrayList<Cliente>();
					arrayCliente = PayLoad.montaArrayDeCliente(lista);
					Dados.processaArrayClienteUsuario(arrayCliente);
					
				}

				break;
				
			case 3: 
				InputDados.FechaLeitor();
				System.exit(0);
						
			default: System.out.println("Opção invalida!!");
						
			}
		}
		

	}

}
