package br.unipe.java.seguradora1;

public class Cliente {
	
	private char tipo;
	private String nome;
	private Residencial residencial;
	private Empresarial empresarial;

	public char getTipo() {
		return tipo;
	}

	//TODO: Colocar tratamento de erro aqui; So entra passa se for um char.
	/**
	* F - Pessoa Fisica
	* J - Pessoa Juridica
	*/
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
