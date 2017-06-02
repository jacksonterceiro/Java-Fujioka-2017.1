package br.unipe.java.seguradora1;

import java.util.ArrayList;

public class Dados {

	// static Scanner leitor = new Scanner(System.in);
	//
	// public static void FechaLeitor(){
	// leitor.close();
	// }
	//
	//
	// private int nextInt(){
	//// try{
	//// int valor = leitor.nextInt();
	//// leitor.nextLine();
	//// }
	//// catch(Exception e){
	//// System.out.printf("Digite um numero INTEIRO --*");
	//// }
	// int valor = leitor.nextInt();
	// leitor.nextLine();
	// return valor;
	// }
	//
	// private Float nextFloat(){
	// Float valor = leitor.nextFloat();
	// leitor.nextLine();
	// return valor;
	// }
	//
	// private String nextLine(){
	// String valor = leitor.nextLine();
	// return valor;
	// }
	//
	// private char nextChar(){
	// String valor = leitor.nextLine();
	// valor = valor.toUpperCase();
	// return valor.charAt(0);
	// }
	//
	// private char nextCharLimited(char[] args){
	// boolean confirma = false;
	// char letra = ' ';
	//
	// while(true){
	// letra = nextChar();
	//
	// for (char arg : args) {
	//
	// if (arg == letra){
	// confirma = true;
	// }
	//
	// }
	//
	// if(!confirma){
	// System.out.print("Entrada invalida, digite novamente: ");
	// } else
	// break;
	//
	// }
	// return letra;
	// }

	public int Menu() {
		int opcao = 0;
		// cadastrar contrato;
		System.out.print("\t\tSeguradora\n\n\n[1] Cadastrar Cliente\n[2] Visualizar Dados Cliente\n[3] Sair\n\n");
		System.out.printf("Opção:");
		opcao = InputDados.nextInt();

		return opcao;
	}

	public int MenuFisicaJuridica() {
		int opcao = 0;
		clearScreen();

		System.out.print("\t\tSeguradora\n\n\n[1] Pessoa Fisica\n[2] Pessoa Juridica\n\n");
		System.out.printf("Opção:");
		int[] esperado = new int[2];
		esperado[0] = 1;
		esperado[1] = 2;
		opcao = InputDados.nextIntLimited(esperado);

		return opcao;
	}

	/**
	 * Adiciona o tipo do cliente na class Cliente. F - Pessoa Fisica | J -
	 * Pessoa Juridica
	 */
	public static Cliente adicionaCharTipoCliente(Cliente cliente, char tipo) {
		cliente.setTipo(tipo);
		return cliente;
	}

	/**
	 * Adiciona class Residencial em Cliente.
	 */
	public static Cliente adicionaClassResidencialCliente(Cliente cliente, Residencial residencial) {
		cliente.setResidencial(residencial);
		return cliente;
	}

	/**
	 * Adiciona class Empresarial em Cliente.
	 */
	public static Cliente adicionaClassEmpresarialCliente(Cliente cliente, Empresarial empresarial) {
		cliente.setEmpresarial(empresarial);
		return cliente;
	}

	public static void clearScreen() {
		for (int i = 0; i < 50; ++i)
			System.out.println();
	}

	public Cliente solicitaDadosCliente(Cliente cliente) {
		String nome = "";
		clearScreen();

		System.out.print("\t\tSeguradora\n\n\nDigite seu nome: ");
		nome = InputDados.nextLine();

		cliente.setNome(nome);
		return cliente;
	}

	public Residencial solicitaDadosResidencial(Residencial residencial) {
		clearScreen();

		System.out.print("\t\tSeguradora\n\n\nValor do Imovel: ");
		residencial.setValorImovel(InputDados.nextFloat());

		System.out.print("Endereco: ");
		residencial.setEndereco(InputDados.nextLine());

		System.out.print("Zona (U - Urbana | R - Rural): ");

		char[] esperado = new char[2];
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

	public Empresarial solicitaDadosEmpresarial(Empresarial empresarial) {
		clearScreen();

		System.out.print("\t\tSeguradora\n\n\nValor do Imovel: ");
		empresarial.setValorImovel(InputDados.nextFloat());

		System.out.println("Numero de Funcionarios: ");
		empresarial.setNumFuncionarios(InputDados.nextInt());

		System.out.print("Visitas Diarias: ");
		empresarial.setVisitasDiarias(InputDados.nextInt());

		System.out.print("Ramo (C - Comercio | I - Industria | A - Agropecuaria): ");
		char[] esperado = new char[3];
		esperado[0] = 'C';
		esperado[1] = 'I';
		esperado[2] = 'A';
		empresarial.setRamo(InputDados.nextCharLimited(esperado));

		return empresarial;

	}

	public Cliente AdicionaContratoResidencial(Cliente cliente, Residencial residencial) {
		cliente.setResidencial(residencial);
		return cliente; // eu preciso retornar assim ou eu posso colocar do tipo
						// void
	}

	public Cliente AdicionaContratoEmpresarial(Cliente cliente, Empresarial empresarial) {
		cliente.setEmpresarial(empresarial);
		return cliente; // eu preciso retornar assim ou eu posso colocar do tipo
						// void
	}

	public static void imprimeDadosCliente(Cliente cliente) {
		clearScreen();
		System.out.printf("\t\tDados Cliente\n\n\n");
		System.out.printf("Nome: %s\n", cliente.getNome());
		System.out.printf("Tipo: Pessoa Fisica");
	}

	public static void imprimeDadosClienteContrato(Cliente cliente) {
		clearScreen();
		System.out.printf("\t\tDados Cliente\n\n\n");
		System.out.printf("Nome: %s\n", cliente.getNome());
		System.out.printf("Tipo: Pessoa Fisica");
		
		if (cliente.getTipo() == 'F')
			imprimeDadosResidencial(cliente.getResidencial());
		else
			imprimeDadosEmpresarial(cliente.getEmpresarial());
	}

	/*public void imprimeDadosClienteResidencial(Cliente cliente) {
		clearScreen();
		System.out.printf("\t\tDados Cliente\n\n\n");
		System.out.printf("Nome: %s\n", cliente.getNome());
		System.out.printf("Tipo: Pessoa Fisica");

		imprimeDadosResidencial(cliente.getResidencial());
	}

	public void imprimeDadosClienteEmpresarial(Cliente cliente) {
		clearScreen();
		System.out.printf("\t\tDados Cliente\n\n");
		System.out.printf("Nome: %s\n", cliente.getNome());
		System.out.printf("Tipo: Pessoa Juridica");

		imprimeDadosEmpresarial(cliente.getEmpresarial());
	}*/

	public static void imprimeDadosResidencial(Residencial contrato) {
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

	public static void imprimeDadosEmpresarial(Empresarial contrato) {
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

	public static void processaArrayClienteUsuario(ArrayList<Cliente> array) {
		int count = 1;
		int op = 0;
		Cliente cliente = new Cliente();
		Dados.clearScreen();
		System.out.printf("\t\t\nCliente Cadastrados\n\n\n");
		for (Cliente cliente1 : array) {
			System.out.printf("[%d] %s\n", count, cliente1.getNome());
			count++;
		}

		System.out.print("Selecione um cliente cadastrado: ");
		op = InputDados.nextIntLimitedCompare(1, count);

		count = 1;
		for (Cliente cliente1 : array) {
			if (op == count) {
				cliente = cliente1;
				break;
			}
			count++;
		}

		Dados.imprimeDadosClienteContrato(cliente);

	}
}
