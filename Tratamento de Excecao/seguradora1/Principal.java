//Nitai Charan
/*TODO: TESTES:
Vai cair na prova -> java lang
* Endereço com espaço; OK
* NextCharLimited - verificar se oq o usuario digitou esta de acordo com os args; OK
* Fazer o next int limited para pessoal fisica e juridica; OK
* Tratar a entrada null <enter> do nextChar; OK
* NullPointerException; // Não Existe
* 
* FALTA:
* Colocar um strlen para ver se a entrada é maior que 0 - String - nome; OK
* Deixar iniciais do nome do cliente sempre em maiusculo; OK
* Tratar a entrada do valor do imovel com ponto - FLOAT; OK
* Tratar a entrada do valor do imovel com letra; OK
* verificar se o arquivo está vazio - se sim nao pule linha na hora de adicionar (Class verificaArquivoVazio). OK
* Adicionar tronw exception e tratar metodos static tudo fora da função.
* 
*/
package br.unipe.java.seguradora1;

import java.util.ArrayList;

public class Principal {
	 static final String ARQUIVO_LOG = "log.txt";

	public static void main(String[] args) throws InterruptedException {
		int op = 0;
		Cliente cliente = new Cliente(); //Instacia cliente definida
		
		while(true){
		
			Imprimir.clearScreen();
			op = MenuUsuario.Menu();
			
			
			switch(op){
				case 1:	
					String payLoad = "";
					
					cliente = Dados.solicitaDadosCliente(cliente);
				
					while(true){
				
						int opTipoCliente = MenuUsuario.MenuFisicaJuridica();
						
						if(opTipoCliente == 1){
							//solicita dados RESIDENCIAL
							Residencial contrato = new Residencial(); //Instancia residencial definido
							cliente = Dados.adicionaCharTipoCliente(cliente, 'F');
							contrato = Dados.solicitaDadosResidencial(contrato);
							cliente = Dados.adicionaClassResidencialCliente(cliente, contrato);
							//Criar um metodo para adicionar Residencial dentro de cliente;
							Imprimir.imprimeDadosClienteContrato(cliente); 
							InputDados.PressToContinue();
							//Thread.sleep(3000);
							break;
							
						} else if(opTipoCliente == 2){
							//solicita dados EMPRESARIAL
							Empresarial contrato = new Empresarial(); //Instancia empresarial definido
							cliente = Dados.adicionaCharTipoCliente(cliente, 'J');
							contrato = Dados.solicitaDadosEmpresarial(contrato);
							cliente = Dados.adicionaClassEmpresarialCliente(cliente, contrato);
							//Criar um metodo para adicionar Empresarial dentro de cliente;
							Imprimir.imprimeDadosClienteContrato(cliente);
							InputDados.PressToContinue();
							//Thread.sleep(3000);
							break;
							
						}else{
							System.out.println("Opcao Invalida!!");
						}
					
					}
					
					//Armazena dados em arquivo.
					payLoad = PayLoad.montaPayLoad(cliente);
					Arquivo.addArquivo(payLoad, ARQUIVO_LOG);
					
				break;
				
			case 2:
				
				//Guardar no arquivo os dados do cliente.
				//quando selecionado esse case, listar uma lista de nomes de clientes cadastrado.
				if(Arquivo.logExiste(ARQUIVO_LOG)){
					Cliente clienteExibir = new Cliente();
					ArrayList<String> lista = new ArrayList<String>();
					lista = Arquivo.lerArquivo(ARQUIVO_LOG);
					
					ArrayList<Cliente> arrayCliente = new ArrayList<Cliente>();
					arrayCliente = PayLoad.montaArrayDeCliente(lista);
					clienteExibir = Imprimir.menuOpcaoImprimeAllCliente(arrayCliente);
					Imprimir.imprimeDadosClienteContrato(clienteExibir);
					InputDados.PressToContinue();
					//Thread.sleep(5000);
					
				}

				break;
				
			case 3:
				
				//Guardar no arquivo os dados do cliente.
				//quando selecionado esse case, listar uma lista de nomes de clientes cadastrado.
				if(Arquivo.logExiste(ARQUIVO_LOG)){
					Cliente clienteEscolhido = new Cliente();
					ArrayList<String> lista = new ArrayList<String>();
					lista = Arquivo.lerArquivo(ARQUIVO_LOG);
					
					ArrayList<Cliente> arrayCliente = new ArrayList<Cliente>();
					arrayCliente = PayLoad.montaArrayDeCliente(lista);
					clienteEscolhido = Imprimir.menuOpcaoImprimeAllCliente(arrayCliente);
					
					//Solicita confirmacao; Se confirmado, remove;
					if(Remocao.confirmaRemocao(clienteEscolhido)){
						arrayCliente = Remocao.removeClienteArray(arrayCliente, clienteEscolhido);

						Arquivo.salvaArrayListArquivo(arrayCliente, ARQUIVO_LOG);
					}
					
				}
				
				break;
				
			case 4: 
				//Sai da aplicação;
				InputDados.FechaLeitor();
				System.exit(0);
						
			default: System.out.println("Opção invalida!!");
					 Thread.sleep(1000);
						
			}
		}
		

	}

}
