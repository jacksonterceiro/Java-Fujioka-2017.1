package br.unipe.java.lista;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args){
		
		float salario = 0;
		float porcentagemAumento = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite seu sálario atual: ");
		salario = leitor.nextFloat();
		
		System.out.print("Informe a porcentagem de aumento: ");
		porcentagemAumento = leitor.nextFloat();
		
		System.out.printf("Seu salario com o aumento: %f\nValor do aumento: %f", salario + (porcentagemAumento / 100), (salario + (porcentagemAumento / 100)) - salario);
		
		leitor.close();
	}
	

}
