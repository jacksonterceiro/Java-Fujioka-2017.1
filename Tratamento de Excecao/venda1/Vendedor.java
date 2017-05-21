package br.unipe.java.venda;

public class Vendedor {
	private String nome;
	private String codigo;
	private Float comissao;
	private Float porcentagemComissao;
	private String endereco;
	
	
	public Vendedor(String nome, String endereco, String codigo){
		this.nome = nome;
		this.endereco = endereco;
		this.codigo = codigo;
		setPorcentagemComissao(0.10f);
	}


	public Float getPorcentagemComissao() {
		return porcentagemComissao;
	}


	public void setPorcentagemComissao(Float porcentagemComissao) {
		this.porcentagemComissao = porcentagemComissao;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public Float getComissao() {
		return comissao;
	}


	public void setComissao(Float comissao) {
		this.comissao = comissao;
	}


	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	

}
