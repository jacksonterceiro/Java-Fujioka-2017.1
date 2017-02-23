package br.unipe.java.exercicio2202;

public class Emprestimo {
	public String nomeUsuario;
	public int idade;
	public float valorEmprestimo;
	public float percentualJurosMes;
	public int mesesParaPagar;
	
	public void imprimir(){
		System.out.println("Nome usuario: " + nomeUsuario);
		System.out.println("Idade: " + idade);
		System.out.println("valor Emprestimo: " + valorEmprestimo);
		System.out.println("Percentual de Juros por Mes: " + percentualJurosMes);
		System.out.println("Meses Para Pagar: " + mesesParaPagar);
	
	}
	
	public void calcularEmprestimo(){
		if ((idade >= 18) && (idade < 23)){
			valorEmprestimo += (valorEmprestimo / mesesParaPagar) * percentualJurosMes;
			
		} else if ((idade > 23) && (idade <= 33)){
			valorEmprestimo = (valorEmprestimo * 10) / 100;
			
		}
	}
}
