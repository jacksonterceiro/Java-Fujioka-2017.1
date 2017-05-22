package br.unipe.java.seguradora1;

public class Empresarial {
	
	private Float valorImovel;
	private int numFuncionarios;
	private int visitasDiarias;
	private char ramo; //C - Comercio; I - Industria; A - Agropecuaria
	
	private Float valorSeguro;
	
	public Empresarial(){
		//Isso é correto??
	}
	
	public Empresarial(Float valorImovel, int numFuncionarios, int visitasDiarias, char ramo){
		this.valorImovel = valorImovel;
		this.numFuncionarios = numFuncionarios;
		this.visitasDiarias = visitasDiarias;
		this.ramo = ramo; //I - Industria; C - Comercio;
	}
	
	public void calcularSeguro(){
		Float valorSeguro = 0f;
		
		valorSeguro = getValorImovel() * 0.04f;
				
		//A cada 10 funcionarios + 0.2%;
		for(int count = 0; count <= getNumFuncionarios(); count+=10){
			valorSeguro += getValorImovel() * 0.002f;
		}
		
		//A cada 200 visitas diarias + 0.3%;
		for(int count = 0; count <= getVisitasDiarias(); count+=200){
			valorSeguro += getValorImovel() * 0.003f;
		}
		
		valorSeguro += (getRamo() == 'I') ? getValorImovel() * 0.01f : getValorImovel() * 0.005f;
		
		setValorSeguro(valorSeguro);
		
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

	public int getVisitasDiarias() {
		return visitasDiarias;
	}

	public void setVisitasDiarias(int visitasDiarias) {
		this.visitasDiarias = visitasDiarias;
	}

	public char getRamo() {
		return ramo;
	}

	public void setRamo(char ramo) {
		this.ramo = ramo;
	}

	public Float getValorSeguro() {
		return valorSeguro;
	}

	public void setValorSeguro(Float valorSeguro) {
		this.valorSeguro = valorSeguro;
	}
	
	

}
