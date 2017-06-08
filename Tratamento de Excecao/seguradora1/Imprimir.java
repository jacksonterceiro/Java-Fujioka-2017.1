package br.unipe.java.seguradora1;

import java.util.ArrayList;

public class Imprimir {
	/**
	 * Limpa tela;
	 */
	public static void clearScreen() {
		for (int i = 0; i < 50; ++i)
			System.out.println();
	}
	
	/**
	 * Imprime todos os nomes dos contratos contidos no arrayList;
	 * @param array
	 * @return
	 */
	public static Cliente menuOpcaoImprimeAllCliente(ArrayList<Cliente> array){
		int count = 1;
		int op = 0;
		Cliente cliente = new Cliente();
		clearScreen();
		System.out.printf("\t\t\nCliente Cadastrados\n\n\n");
		for (Cliente cliente1 : array) {
			System.out.printf("[%d] %s\n", count, cliente1.getNome());
			count++;
		}
		
		System.out.print("Selecione um cliente cadastrado: ");
		op = InputDados.nextIntLimitedCompare(1, count -1);

		count = 1;
		for (Cliente cliente1 : array) {
			if (op == count) {
				cliente = cliente1;
				break;
			}
			count++;
		}
		
		return cliente;
	}
	
	/**
	 * 
	 * @param cliente
	 */
	public static void imprimeDadosCliente(Cliente cliente) {
		clearScreen();
		System.out.printf("\t\tDados Cliente\n\n\n");
		System.out.printf("Nome: %s\n", cliente.getNome());
		System.out.printf("Tipo: Pessoa Fisica");
	}

	/**
	 * 
	 * @param cliente
	 */
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

	/**
	 * 
	 * @param contrato
	 */
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

	/**
	 * 
	 * @param contrato
	 */
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
}
