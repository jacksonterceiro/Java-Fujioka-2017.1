/*TODO: TESTES:
* Endereço com espaço;
* NextCharLimited - verificar se oq o usuario digitou esta de acordo com os args
* Fazer o next int limited para pessoal fisica e juridica
* verificar a entrada do valor do imovel com ponto
*/
package br.unipe.java.seguradora1;

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
					
					cliente = menu.SolicitaDadosCliente(cliente);
				
					while(true){
				
						int opTipoCliente = menu.MenuFisicaJuridica();
						
						if(opTipoCliente == 1){
							//solicita dados RESIDENCIAL
							Residencial contrato = new Residencial();
							cliente = Dados.adicionaTipoCliente(cliente, 'F');
							contrato = menu.SolicitaDadosResidencial(contrato);
							menu.imprimeDadosClienteResidencial(cliente, contrato); //RETIRAR
							Thread.sleep(3000);
							break;
							
						} else if(opTipoCliente == 2){
							//solicita dados EMPRESARIAL
							Empresarial contrato = new Empresarial();
							cliente = Dados.adicionaTipoCliente(cliente, 'J');
							contrato = menu.SolicitaDadosEmpresarial(contrato);
							menu.imprimeDadosClienteEmpresarial(cliente, contrato); //RETIRAR
							Thread.sleep(3000);
							break;
							
						}else{
							System.out.println("Opcao Invalida!!");
						}
					
					}
					
				break;
				
			case 2:
				
				//Guardar no arquivo os dados do cliente.
				//quando selecionado esse case, listar uma lista de nomes de clientes cadastrado.
					
				/*if (cliente.getTipo() == 'F')
					menu.imprimeDadosClienteResidencial(cliente, contrato);
				else
					menu.imprimeDadosClienteEmpresarial(cliente, contrato);
				break;*/
				
			case 3: 
				InputDados.FechaLeitor();
				System.exit(0);
						
			default: System.out.println("Opção invalida!!");
						
			}
		}
		

	}

}
