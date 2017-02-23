package br.unipe.java.exercicio2202;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Emprestimo emprestimo = new Emprestimo();
		
		emprestimo.idade = 15;
		emprestimo.mesesParaPagar = 10;
		emprestimo.nomeUsuario = "IRINEU";
		emprestimo.percentualJurosMes = 10;
		emprestimo.valorEmprestimo = 500;
		
		emprestimo.imprimir();
		
		emprestimo.calcularEmprestimo();
		
		leitor.close();

	}

}
