package br.unipe.java.seguradora1;

import java.util.Scanner;

public class Dados {
	
	Scanner leitor = new Scanner(System.in);
	
	private int nextInt(){
		int valor = leitor.nextInt();
		leitor.nextLine();
		return valor;
	}
	
	private Float nextFloat(){
		Float valor = leitor.nextFloat();
		leitor.nextLine();
		return valor;
	}
	
	private String nextLine(){
		String valor = leitor.nextLine();
		return valor;
	}
	
	private char nextChar(){
		String valor = leitor.nextLine();
		return valor.charAt(0);
	}
	
	/*private char nextCharLimited(){
		
		
		return valor;
	}*/
	
	public int Menu(){
		int opcao = 0;
		
		System.out.print("\t\tSeguradora\n\n\n[1] Cadastrar Cliente\n[2] Cadastrar Contrato\n\n");
		System.out.printf("Opção:");
		opcao = nextInt();
		
		return opcao;
	}
	
	public int MenuFisicaJuridica(){
		clearScreen();
		int opcao = 0;
		
		System.out.print("\t\tSeguradora\n\n\n[1] Pessoa Fisica\n[2] Pessoa Juridica\n\n");
		System.out.printf("Opção:");
		opcao = nextInt();
		
		return opcao;
	}
	
	public void AdicionaCliente(Cliente cliente, char tipo, String nome){
		cliente.setTipo(tipo);
		cliente.setNome(nome);
	}
	
	public static void clearScreen() {  
		for (int i = 0; i < 50; ++i) 
			System.out.println();  
	} 
	
	public Cliente SolicitaDadosCliente(Cliente cliente){
		String nome = "";
		clearScreen();
		
		System.out.print("\t\tSeguradora\n\n\nDigite seu nome: ");
		nome = leitor.nextLine();
		
		cliente.setNome(nome);
		return cliente;
	}
	
	public Residencial SolicitaDadosResidencial(Residencial residencial){
		clearScreen();
		
		System.out.print("\t\tSeguradora\n\n\nValor do Imovel: ");
		residencial.setValorImovel(nextFloat());
		
		System.out.println("Endereco: ");
		residencial.setEndereco(nextLine());
		
		System.out.print("Zona (U - Urbana | R - Rural): ");
		residencial.setZona(nextChar());
		
		System.out.print("Residencia (A - Apartamento | C - Casa): ");
		residencial.setZona(nextChar());
		  
		return residencial;
		
	}
	
	public Empresarial SolicitaDadosEmpresarial(Empresarial empresarial){
		clearScreen();
		
		System.out.print("\t\tSeguradora\n\n\nValor do Imovel: ");
		empresarial.setValorImovel(nextFloat());
		
		System.out.println("Numero de Funcionarios: ");
		empresarial.setNumFuncionarios(nextInt());
		
		System.out.print("Visitas Diarias: ");
		empresarial.setVisitasDiarias(nextInt());
		
		System.out.print("Ramo (C - Comercio | I - Industria | A - Agropecuaria): ");
		empresarial.setRamo(nextChar());
		  

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
	
	public void FechaLeitor(){
		leitor.close();
	}

}
