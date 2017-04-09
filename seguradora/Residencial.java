package br.unipe.java.seguradora;

public class Residencial {
	private Cliente cliente;
	private String endereco;
	private Float valorImovel;
	private char zona;
	private char tipoResidencia;
	private Float valorSeguro;
	
	
	public void calculo(){
		setValorSeguro((getValorImovel() * 2.0f) + getValorSeguro());
	
		if(getZona() == 'U'){
			setValorSeguro((getValorImovel() * 1.0f) + getValorSeguro());
		}
		if(getZona() == 'S' || getZona() == 'C'){
			setValorSeguro((getValorImovel() * 0.5f) + getValorSeguro());
		}
		
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Float getValorSeguro() {
		return valorSeguro;
	}


	public void setValorSeguro(Float valorSeguro) {
		this.valorSeguro = valorSeguro;
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
	/*
	 * U - Urbana
	 * S - Suburbana
	 * R - Rural
	 */
	public char getZona() {
		return zona;
	}
	/*
	 * U - Urbana
	 * S - Suburbana
	 * R - Rural
	 */
	public void setZona(char zona) {
		this.zona = zona;
	}
	/*
	 * C - Casa
	 * A - Apartamento
	 */
	public char getTipoResidencia() {
		return tipoResidencia;
	}
	/*
	 * C - Casa
	 * A - Apartamento
	 */
	public void setTipoResidencia(char tipoResidencia) {
		this.tipoResidencia = tipoResidencia;
	}
	
	
}
