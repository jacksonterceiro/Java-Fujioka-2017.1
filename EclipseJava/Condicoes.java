package br.unipe.java.unidade1;

import java.util.Scanner;

public class Condicoes {

	public static void main(String[] args) {
		int z;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe um numero para ser testado: ");
		
		z = leitor.nextInt();
		
		if (z == 10) {
			System.out.println("z é igual a 10 :) ");
		} else {
			System.out.println("z não é igual a 10");
		}
		
		System.out.println("e isso é enrolação");
		leitor.close();

	}

}



