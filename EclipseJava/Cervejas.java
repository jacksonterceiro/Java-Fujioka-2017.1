package br.unipe.java.unidade1;

import java.util.Scanner;

public class Cervejas {

	public static void main(String[] args) {
		int cervejas;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe a quantidade de cervejas: ");
		
		cervejas = leitor.nextInt();
		
		for(; cervejas != 0; cervejas--){
			System.out.printf("%d cervejas na freezer.\n", cervejas);
			System.out.printf("Pego uma garrafa, passo pra frente.\n");
			System.out.printf("Agora são %d cervejas na freezer\n\n", (cervejas-1));
		}
		
		leitor.close();
	}

}
