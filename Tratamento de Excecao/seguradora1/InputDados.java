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
	
	public static int nextIntLimitedCompare(int menor, int maior){
		int inteiro = 0;
		
		while(true){
			inteiro = nextInt();
		
			if(inteiro >= menor && inteiro <= maior){
				break;
			}
			
			else
				System.out.print("Entrada invalida, digite um valor valido: ");	
			
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
		String valor = "";
		char response = ' ';
		
		while(true){
			valor = "";
			try{
				while(true){
					valor = leitor.nextLine();
					valor = valor.toUpperCase();
					if (valor.length() == 1){
						response = valor.charAt(0);
						break;
					}
					System.out.printf("Digite UM(1) CARACTERE --*: ");
				}
				
				break;
			}catch(Exception e){
				System.out.printf("Digite um CARACTERE --*: ");
				//leitor.nextLine();
			}
		}
		return response;
	}
	
	
	
/*	public static char nextChar(){
		String valor = leitor.nextLine();
		valor = valor.toUpperCase();
		return valor.charAt(0);
	}*/
	
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
