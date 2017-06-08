package br.unipe.java.seguradora1;

public class Dados {


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

	/**
	 * 
	 * @param cliente
	 * @return
	 */
	public static Cliente solicitaDadosCliente(Cliente cliente) {
		String nome = "";
		Imprimir.clearScreen();

		System.out.print("\t\tSeguradora\n\n\nDigite seu nome: ");
		nome = InputDados.nextLineFree();
		nome = nome.substring(0,1).toUpperCase().concat(nome.substring(1));

		cliente.setNome(nome);
		return cliente;
	}

	/**
	 * 
	 * @param residencial
	 * @return
	 */
	public static Residencial solicitaDadosResidencial(Residencial residencial) {
		Imprimir.clearScreen();

		System.out.print("\t\tSeguradora\n\n\nValor do Imovel: ");
		residencial.setValorImovel(InputDados.nextFloat());

		System.out.print("Endereco: ");
		residencial.setEndereco(InputDados.nextLineFree());

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

	/**
	 * 
	 * @param empresarial
	 * @return
	 */
	public static Empresarial solicitaDadosEmpresarial(Empresarial empresarial) {
		Imprimir.clearScreen();

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

	/**
	 * 
	 * @param cliente
	 * @param residencial
	 * @return
	 */
	public Cliente AdicionaContratoResidencial(Cliente cliente, Residencial residencial) {
		cliente.setResidencial(residencial);
		return cliente;
	}

	/**
	 * 
	 * @param cliente
	 * @param empresarial
	 * @return
	 */
	public Cliente AdicionaContratoEmpresarial(Cliente cliente, Empresarial empresarial) {
		cliente.setEmpresarial(empresarial);
		return cliente;
	}
}

