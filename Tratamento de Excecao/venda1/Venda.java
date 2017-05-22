package br.unipe.java.venda1;

public class Venda {
	
	private Produto produto;
	private Vendedor vendedor;
	private Float desconto;
	private int quantidadeItens;
	private Float valor;
	
	
	
	public void calcularValor(Produto produto){
		setValor(getQuantidadeItens() * produto.getValorVenda());	
	}
	
	
	public void calcularComissao(Vendedor vendedor, Produto produto, Float comissao){
		
		if(produto.isPromocao()){
			vendedor.setComissao((comissao * getValor()) /2);
		}else{
			vendedor.setComissao(comissao * getValor());
		}
		
	}
	
	
	public boolean efetuarDesconto(Float desconto, Produto produto) {
		
		Float valor = getValor();//Valor final da venda
		Float valorCusto = produto.getValorCusto();
		
		if((valorCusto * getQuantidadeItens()) < (valor - (desconto * valor))){
			setDesconto(desconto * valor);
			setValor(valor - (desconto * valor));
			System.out.println("\n\n\n'DESCONTO REALIZADO'");
			return true;
		}else{
			System.out.println("\n\n\n'DESCONTO ABAIXO DO CUSTO DO PRODUTO!!!!!'");
			setDesconto(desconto * valor);
			setValor(valor - (desconto * valor));
			return false;
		}
		
	}
	
	public void imprimir(Vendedor vendedor, Produto produto){
		System.out.printf("Codigo: %s - Nome: %s - Comissão: %.2f\n", vendedor.getCodigo(), vendedor.getNome(), vendedor.getComissao());
		System.out.printf("Quantidade de Itens: %d\n", getQuantidadeItens());
		System.out.printf("\n------- Produto -------\n\nCodigo: %s - Descrição: %s\n", produto.getCodigo(), produto.getDescricao());
		System.out.printf("Valor: %.2f\n", produto.getValorVenda());
		System.out.printf("Promoção: %b\n", produto.isPromocao());
		if(produto.isPromocao()){
			System.out.printf("Desconto: %.2f\n", getDesconto());	
		}
		System.out.printf("Valor Total da Venda: %.2f", getValor());
		
	}
	
	
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		try{
			this.produto = produto;
		} catch(Exception e){
			System.out.println("Erro setProduto");
		}
	}
	
	public Vendedor getVendedor() {
		return vendedor;
	}
	
	public void setVendedor(Vendedor vendedor) {
		try{
			this.vendedor = vendedor;
		} catch(Exception e){
			System.out.println("Erro setVendedor");
		}
	}
	
	public Float getDesconto() {
		return desconto;
	}
	
	public void setDesconto(Float desconto) {
		try{
			this.desconto = desconto;
		} catch(Exception e){
			System.out.println("Erro setDesconto");
		}
	}
	
	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	
	public void setQuantidadeItens(int quantidadeItens) {
		try{
			this.quantidadeItens = quantidadeItens;
		} catch(Exception e){
			System.out.println("Erro setQuantidadeItens");
		}
	}
	
	public Float getValor() {
		return valor;
	}
	
	public void setValor(Float valor) {
		try{
			this.valor = valor;
		} catch(Exception e){
			System.out.println("Erro setValor");
		}
	}
	


}
