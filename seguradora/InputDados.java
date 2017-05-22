package br.unipe.java.seguradora1;

import java.util.Scanner;

public class InputDados {

static Scanner leitor = new Scanner(System.in);
	
	public static void FechaLeitor(){
		leitor.close();
	}

	
	public static int nextInt(){
		int valor;
		
		while(true){
			valor = 0;
			try{
				valor = leitor.nextInt();
				leitor.nextLine();
				break;
			}
			catch(Exception e){
				System.out.printf("Digite um numero INTEIRO --*: ");
				leitor.nextLine();
			}
		}
		return valor;
	}
	
	public static int nextIntLimited(int[] args){
		boolean confirma = false;
		int inteiro = 0;
		
		while(true){
			inteiro = nextInt();
		
			for (int arg : args) {
				
				if (arg == inteiro){
					confirma = true;
				}
			
			}
			
			if(!confirma){
				System.out.print("Entrada invalida, digite um valor valido: ");	
			} else
				break;
			
		}
		return inteiro;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static Float nextFloat(){
		Float valor = leitor.nextFloat();
		leitor.nextLine();
		return valor;
	}
	
	public static String nextLine(){
		String valor = leitor.nextLine();
		return valor;
	}
	
	public static char nextChar(){
		String valor = leitor.nextLine();
		valor = valor.toUpperCase();
		return valor.charAt(0);
	}
	
	public static char nextCharLimited(char[] args){
		boolean confirma = false;
		char letra = ' ';
		
		while(true){
			letra = nextChar();
		
			for (char arg : args) {
				
				if (arg == letra){
					confirma = true;
				}
			
			}
			
			if(!confirma){
				System.out.print("Entrada invalida, digite novamente: ");	
			} else
				break;
			
		}
		return letra;
	}
	
}
