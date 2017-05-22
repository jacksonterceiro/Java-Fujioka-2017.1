package br.unipe.java.seguradora1;

public class Dados {
	
//	static Scanner leitor = new Scanner(System.in);
//	
//	public static void FechaLeitor(){
//		leitor.close();
//	}
//
//	
//	private int nextInt(){
////		try{
////			int valor = leitor.nextInt();
////			leitor.nextLine();
////		}
////		catch(Exception e){
////			System.out.printf("Digite um numero INTEIRO --*");
////		}
//		int valor = leitor.nextInt();
//		leitor.nextLine();
//		return valor;
//	}
//	
//	private Float nextFloat(){
//		Float valor = leitor.nextFloat();
//		leitor.nextLine();
//		return valor;
//	}
//	
//	private String nextLine(){
//		String valor = leitor.nextLine();
//		return valor;
//	}
//	
//	private char nextChar(){
//		String valor = leitor.nextLine();
//		valor = valor.toUpperCase();
//		return valor.charAt(0);
//	}
//	
//	private char nextCharLimited(char[] args){
//		boolean confirma = false;
//		char letra = ' ';
//		
//		while(true){
//			letra = nextChar();
//		
//			for (char arg : args) {
//				
//				if (arg == letra){
//					confirma = true;
//				}
//			
//			}
//			
//			if(!confirma){
//				System.out.print("Entrada invalida, digite novamente: ");	
//			} else
//				break;
//			
//		}
//		return letra;
//	}
	
	public int Menu(){
		int opcao = 0;
		//cadastrar contrato;
		System.out.print("\t\tSeguradora\n\n\n[1] Cadastrar Cliente\n[2] Visualizar Dados Cliente\n[3] Sair\n\n");
		System.out.printf("Opção:");
		opcao = InputDados.nextInt();
		
		return opcao;
	}
	
	public int MenuFisicaJuridica(){
		int esperado[] = {};
		int opcao = 0;
		clearScreen();
		
		System.out.print("\t\tSeguradora\n\n\n[1] Pessoa Fisica\n[2] Pessoa Juridica\n\n");
		System.out.printf("Opção:");
		esperado = new int[2];
		esperado[0] = 1;
		esperado[1] = 2;
		opcao = InputDados.nextIntLimited(esperado);
		
		return opcao;
	}
	
	public static Cliente adicionaTipoCliente(Cliente cliente, char tipo){
		cliente.setTipo(tipo);
		return cliente;
	}
	
	public static void clearScreen() {  
		for (int i = 0; i < 50; ++i) 
			System.out.println();  
	} 
	
	public Cliente SolicitaDadosCliente(Cliente cliente){
		String nome = "";
		clearScreen();
		
		System.out.print("\t\tSeguradora\n\n\nDigite seu nome: ");
		nome = InputDados.nextLine();
		
		cliente.setNome(nome);
		return cliente;
	}
	
	public Residencial SolicitaDadosResidencial(Residencial residencial){
		char esperado[] = {};
		clearScreen();
		
		System.out.print("\t\tSeguradora\n\n\nValor do Imovel: ");
		residencial.setValorImovel(InputDados.nextFloat());
		
		System.out.print("Endereco: ");
		residencial.setEndereco(InputDados.nextLine());
		
		System.out.print("Zona (U - Urbana | R - Rural): ");
		esperado = new char[2];
		esperado[0] = 'U';
		esperado[1] = 'R';
		residencial.setZona(InputDados.nextCharLimited(esperado));
		
		System.out.print("Residencia (A - Apartamento | C - Casa): ");
		esperado = new char[2];
		esperado[0] = 'A';
		esperado[1] = 'C';
		residencial.setResidencia(InputDados.nextCharLimited(esperado));

		  
		return residencial;
		
	}
	
	public Empresarial SolicitaDadosEmpresarial(Empresarial empresarial){
		char esperado[] = {};
		clearScreen();
		
		System.out.print("\t\tSeguradora\n\n\nValor do Imovel: ");
		empresarial.setValorImovel(InputDados.nextFloat());
		
		System.out.println("Numero de Funcionarios: ");
		empresarial.setNumFuncionarios(InputDados.nextInt());
		
		System.out.print("Visitas Diarias: ");
		empresarial.setVisitasDiarias(InputDados.nextInt());
		
		System.out.print("Ramo (C - Comercio | I - Industria | A - Agropecuaria): ");
		esperado = new char[3];
		esperado[0] = 'C';
		esperado[1] = 'I';
		esperado[2] = 'A';
		empresarial.setRamo(InputDados.nextCharLimited(esperado));
		  

		return empresarial;
		
	}
	
	public Cliente AdicionaContratoResidencial(Cliente cliente, Residencial residencial){
		cliente.setResidencial(residencial);
		return cliente; //eu preciso retornar assim ou eu posso colocar do tipo void
	}
	
	public Cliente AdicionaContratoEmpresarial(Cliente cliente, Empresarial empresarial){
		cliente.setEmpresarial(empresarial);
		return cliente; //eu preciso retornar assim ou eu posso colocar do tipo void
	}
	
	public void imprimeDadosClienteResidencial(Cliente cliente, Residencial contrato){
		clearScreen();
		System.out.printf("\t\tDados Cliente\n\n\n");
		System.out.printf("Nome: %s\n", cliente.getNome());
		System.out.printf("Tipo: Pessoa Fisica");
		
		imprimeDadosResidencial(contrato);
	}
	
	public void imprimeDadosClienteEmpresarial(Cliente cliente, Empresarial contrato){
		clearScreen();
		System.out.printf("\t\tDados Cliente\n\n");
		System.out.printf("Nome: %s\n", cliente.getNome());
		System.out.printf("Tipo: Pessoa Juridica");
		
		imprimeDadosEmpresarial(contrato);
	}
	
	public void imprimeDadosResidencial(Residencial contrato){
		System.out.printf("\n\n\t\tDados Residencial\n\n");
		System.out.printf("Endereço: %s\n", contrato.getEndereco());
		System.out.printf("Valor do Imovel: %.2f\n", contrato.getValorImovel());
		if (contrato.getZona() == 'U')
			System.out.printf("Zona: Urbana\n");
		else 
			System.out.printf("Zona: Rural\n");
		if (contrato.getResidencia() == 'A')
			System.out.printf("Residencia: Apartamento\n");
		else
			System.out.printf("Residencia: Casa\n");
	}
	
	public void imprimeDadosEmpresarial(Empresarial contrato){
		System.out.printf("\n\n\t\tDados Empresarial\n\n\n");
		System.out.printf("Valor do Imovel: %.2f\n", contrato.getValorImovel());
		System.out.printf("Numero de Funcionarios: %d\n", contrato.getNumFuncionarios());
		System.out.printf("Visitas Diarias: %d\n", contrato.getVisitasDiarias());
		if (contrato.getRamo() == 'A')
			System.out.printf("Ramo: Agropecuaria\n");
		else if (contrato.getRamo() == 'C')
			System.out.printf("Ramo: Comercio\n");
		else
			System.out.printf("Ramo: Industria\n");
	}
}
