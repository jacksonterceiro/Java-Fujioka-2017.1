package br.unipe.java.seguradora1;

public class Residencial {
	
	private String endereco;
	private Float valorImovel;
	private char zona; //U - Urbana; R - Rural
	private char residencia; //A - Apartamento; C - Casa
	
	private Float valorSeguro;
	
	public Residencial(){}
	
	public Residencial(String endereco, Float valorImovel, char zona, char residencia){
		this.endereco = endereco;
		this.valorImovel = valorImovel;
		this.zona = zona;
		this.residencia = residencia;
	}
	
	public void calcularSeguro(){
		Float valorSeguro = 0f;
		
		valorSeguro = getValorImovel() * 0.02f;
		valorSeguro += (getZona() == 'U') ? getValorImovel() * 0.01f : getValorImovel() * 0.005f;
		setValorSeguro(valorSeguro);
	}
	
	
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Float getValorImovel() {
		return valorImovel;
	}
	
	public void setValorImovel(Float valorImovel) {
		this.valorImovel = valorImovel;
	}
	
	public char getZona() {
		return zona;
	}
	
	public void setZona(char zona) {
		this.zona = zona;
	}
	
	public char getResidencia() {
		return residencia;
	}
	
	public void setResidencia(char residencia) {
		this.residencia = residencia;
	}

	public Float getValorSeguro() {
		return valorSeguro;
	}

	public void setValorSeguro(Float valorSeguro) {
		this.valorSeguro = valorSeguro;
	}
	
	
}
