/*TODO: TESTES:
* Endereço com espaço;
* NextCharLimited - verificar se oq o usuario digitou esta de acordo com os args
*
*/
package br.unipe.java.seguradora1;

public class Principal {

	public static void main(String[] args) {
		int op = 0;
		Cliente cliente1 = new Cliente();
		Dados menu = new Dados();
		
		
		while(true){
		
			Dados.clearScreen();
			op = menu.Menu();
			
			
			switch(op){
				case 1:	
					
					cliente1 = menu.SolicitaDadosCliente(cliente1);
				
					while(true){
				
						int opTipoCliente = menu.MenuFisicaJuridica();
						
						if(opTipoCliente == 1){
							//solicita dados RESIDENCIAL
							Residencial contrato1 = new Residencial();
							contrato1 = menu.SolicitaDadosResidencial(contrato1);
							break;
							
						} else if(opTipoCliente == 2){
							//solicita dados EMPRESARIAL
							Empresarial contrato1 = new Empresarial();
							contrato1 = menu.SolicitaDadosEmpresarial(contrato1);
							break;
							
						}else{
							System.out.println("Opcao Invalida!!");
						}
					
					}
					
				break;
				
			case 2:
				
				System.out.println("Nao implementado");
				break;
						
			default: System.out.println("Opção invalida!!");
						
			}
		}
		
		
		
		

	}

}
