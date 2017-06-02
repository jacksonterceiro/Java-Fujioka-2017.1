package br.unipe.java.seguradora1;

public class Cliente {
	
	private char tipo; //F - Pessoa Fisica | J - Pessoa Juridica
	private String nome;
	private Residencial residencial;
	private Empresarial empresarial;

	
	public Cliente(){}
	
	public Cliente(char tipo, String nome, Residencial residencial) {
		this.tipo = tipo;
		this.nome = nome;
		this.residencial = residencial;
	}
	
	public Cliente(char tipo, String nome, Empresarial empresarial) {
		this.tipo = tipo;
		this.nome = nome;
		this.empresarial = empresarial;
	}
	
	
	
	
	
	public char getTipo() {
		return tipo;
	}
	
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	//TODO: Colocar tratamento de erro aqui; So entra passa se for letras sem numeros.
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Residencial getResidencial() {
		return residencial;
	}

	public void setResidencial(Residencial residencial) {
		this.residencial = residencial;
	}

	public Empresarial getEmpresarial() {
		return empresarial;
	}

	public void setEmpresarial(Empresarial empresarial) {
		this.empresarial = empresarial;
	}
	
	
	
	
	

}
