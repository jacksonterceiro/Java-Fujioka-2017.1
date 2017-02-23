package br.unipe.java.lista;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int num = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite qualquer numero: ");
		num = leitor.nextInt();
		
		num = num%2;
		if(num == 0){
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		
		leitor.close();
		

	}

}
