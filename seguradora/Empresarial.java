package br.unipe.java.seguradora;

public class Empresarial {
	private Cliente cliente;
	private Float valorImovel;
	private int numFuncionarios;
	private int numVisitasDiarias;
	private char ramo;
	private Float valorSeguro;
	
	public void calculo(){
		setValorSeguro((getValorImovel() * 4.0f) + getValorSeguro());
		
		for(int count = 0; count <= getNumFuncionarios(); count+=10){
			setValorSeguro((getValorImovel() * 0.2f) + getValorSeguro());
		}
		for(int count = 0; count <= getNumVisitasDiarias(); count+=200){
			setValorSeguro((getValorImovel() * 0.3f) + getValorSeguro());
		}
		if(getRamo() == 'I'){
			setValorSeguro((getValorImovel() * 1.0f) + getValorSeguro());
		}
		if(getRamo() == 'C'){
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


	public Float getValorImovel() {
		return valorImovel;
	}
	public void setValorImovel(Float valorImovel) {
		this.valorImovel = valorImovel;
	}
	public int getNumFuncionarios() {
		return numFuncionarios;
	}
	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	public int getNumVisitasDiarias() {
		return numVisitasDiarias;
	}
	public void setNumVisitasDiarias(int numVisitasDiarias) {
		this.numVisitasDiarias = numVisitasDiarias;
	}
	/*
	 * C - Comércio
	 * I - Industria
	 * A - Agropecuaria 
	 */
	public char getRamo() {
		return ramo;
	}
	/*
	 * C - Comércio
	 * I - Industria
	 * A - Agropecuaria
	 */
	public void setRamo(char ramo) {
		this.ramo = ramo;
	}

}
