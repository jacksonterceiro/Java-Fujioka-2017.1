package br.unipe.java.seguradora1;

public class MenuUsuario {
	/**
	 * Seguradora
	 * [1] Cadastrar Cliente
	 * [2] Visualizar Dados Cliente
	 * [3] Remover Cliente
	 * [4] Sair
	 * @return
	 */
	public static int Menu() {
		int opcao = 0;
		// cadastrar contrato;
		System.out.print("\t\tSeguradora\n\n\n[1] Cadastrar Cliente\n[2] Visualizar Dados Cliente\n[3] Remover Cliente\n[4] Sair\n\n");
		System.out.printf("Opção: ");
		opcao = InputDados.nextInt();

		return opcao;
	}

	/**
	 * Seguradora
	 * [1] Pessoa Fisica
	 * [2] Pessoa Juridica
	 * @return
	 */
	public static int MenuFisicaJuridica() {
		int opcao = 0;
		Imprimir.clearScreen();

		System.out.print("\t\tSeguradora\n\n\n[1] Pessoa Fisica\n[2] Pessoa Juridica\n\n");
		System.out.printf("Opção:");
		int[] esperado = new int[2];
		esperado[0] = 1;
		esperado[1] = 2;
		opcao = InputDados.nextIntLimited(esperado);

		return opcao;
	}
}
