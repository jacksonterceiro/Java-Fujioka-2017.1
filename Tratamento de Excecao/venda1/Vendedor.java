package br.unipe.java.venda1;

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
		try{
			this.porcentagemComissao = porcentagemComissao;
		} catch(Exception e){
			System.out.println("Erro setPorcentagemComissao");
		}
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		try{
			this.nome = nome;
		} catch(Exception e){
			System.out.println("Erro setNome");
		}
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		try{
			this.codigo = codigo;
		} catch(Exception e){
			System.out.println("Erro setCodigo");
		}
	}


	public Float getComissao() {
		return comissao;
	}


	public void setComissao(Float comissao) {
		try{
			this.comissao = comissao;
		} catch(Exception e){
			System.out.println("Erro setComissao");
		}
	}


	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		try{
			this.endereco = endereco;
		} catch(Exception e){
			System.out.println("Erro setEndereco");
		}
	}
	
	
	

}
