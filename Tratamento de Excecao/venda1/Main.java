package br.unipe.java.venda;

public class Main {

	public static void main(String[] args) {
		Produto iphone = new Produto("0001", "Smart Phone desenvolvido pela apple super caro.", 3999.00f, 2999.00f, false);
		Vendedor gordinho = new Vendedor("Gordinho", "Ali do lado", "0145");
		Venda venda = new Venda();
		
		venda.setProduto(iphone);
		venda.setVendedor(gordinho);
		venda.setQuantidadeItens(2);
		venda.calcularValor(iphone);
		venda.calcularComissao(gordinho, iphone, gordinho.getPorcentagemComissao());
		
		System.out.printf("Valor da Comissão: %.2f\n", gordinho.getComissao());
		venda.imprimir(gordinho, iphone);
		
		System.out.print("\n\n\n----------------- Continuação 1 -----------------\n\n\n");
		Produto samsung = new Produto("0002", "Smart Phone com sistema OpenSource e barato.", 100.00f, 80.00f, true);
		Vendedor galego = new Vendedor("Galego", "Ali do outro lado", "0146");
		Venda venda2 = new Venda();
		
		venda2.setProduto(samsung);
		venda2.setVendedor(galego);
		venda2.setQuantidadeItens(3);
		venda2.calcularValor(samsung);
		venda2.efetuarDesconto(0.10f, samsung);
		venda2.calcularComissao(galego, samsung, galego.getPorcentagemComissao());
		
		System.out.printf("\n\n\nValor da Comissão: %.2f\n", galego.getComissao());
		venda2.imprimir(galego, samsung);
		
		
		System.out.print("\n\n\n----------------- Continuação 2 -----------------\n\n\n");
		
		Venda venda3 = new Venda();
		venda3.setProduto(samsung);
		venda3.setVendedor(galego);
		venda3.setQuantidadeItens(2);
		venda3.calcularValor(samsung);
		venda3.efetuarDesconto(0.30f, samsung);
		venda3.calcularComissao(galego, samsung, galego.getPorcentagemComissao());
		
		System.out.printf("\nValor da Comissão: %.2f\n", galego.getComissao());
		venda3.imprimir(galego, samsung);
		
		
	}

}
