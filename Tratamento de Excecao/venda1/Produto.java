package br.unipe.java.venda1;

public class Produto {
	private String codigo;
	private String descricao;
	private Float valorVenda;
	private Float valorCusto;
	private boolean promocao;
	
	public Produto(String codigo, String descricao, Float valorVenda, Float valorCusto, boolean promocao) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCusto = valorCusto;
		this.promocao = promocao;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		try{
			this.descricao = descricao;
		} catch(Exception e){
			System.out.println("Erro setDescricao");
		}
	}

	public Float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(Float valorVenda) {
		try{
			this.valorVenda = valorVenda;
		} catch(Exception e){
			System.out.println("Erro setValorVenda");
		}
	}

	public Float getValorCusto() {
		return valorCusto;
	}

	public void setValorCusto(Float valorCusto) {
		try{
			this.valorCusto = valorCusto;
		} catch(Exception e){
			System.out.println("Erro setValorCusto");
		}
	}

	public boolean isPromocao() {
		return promocao;
	}

	public void setPromocao(boolean promocao) {
		try{
			this.promocao = promocao;
		} catch(Exception e){
			System.out.println("Erro setValorCusto");
		}
	}
	
	
	

}
