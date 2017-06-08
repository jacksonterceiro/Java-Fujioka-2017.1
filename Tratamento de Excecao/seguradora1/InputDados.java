package br.unipe.java.seguradora1;

import java.util.Scanner;

public class InputDados {

static Scanner leitor = new Scanner(System.in);
	
	public static void FechaLeitor(){
		leitor.close();
	}

	/**
	 * Captura um inteiro;
	 * Possui tratamento que so aceita inteiros;
	 * @return
	 */
	public static int nextInt(){
		int valor;
		
		while(true){
			valor = 0;
			try{
				valor = leitor.nextInt();
				leitor.nextLine();
				break;
			}
			catch(Exception e){ //Tratar o Exception direito.
				System.out.printf("Digite um numero INTEIRO --*: ");
				leitor.nextLine();
			}
		}
		return valor;
	}
	
	/**
	 * Recebe um vetor de inteiro com os possiveis casos solicitado;
	 * So retorna se o valor digitado estiver de acordo com os caracteres do agrs;
	 * @param args
	 * @return
	 */
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
	
	/**
 	 * Recebe um valor menor e um maior que sera comparado,
 	 * caso o valor esteja entre os dois em intervalo fechado retorne o valor digitado;
	 * @param menor
	 * @param maior
	 * @return
	 */
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
	
	/**
	 * Captura um Float;
	 * Possui tratamento que so aceita Floats;
	 * @return
	 */
	public static Float nextFloat(){
		Float valor;
		
		while(true){
			valor = 0f;
			try{
				valor = leitor.nextFloat();
				leitor.nextLine();
				break;
				
			} catch(Exception e){
				System.out.printf("Digite um FLOAT com ou SEM virgula: ");
				leitor.nextLine();
			}
		}
		
		return valor;
	}
	
	/**
	 * Captura uma linha (String) digitada pelo usuario;
	 * @return
	 */
	public static String nextLine(){
		String valor = leitor.nextLine();
		return valor;
	}
	
	/**
	 * Chama o metodo nextLine() e verifica o tamanho da string capturada.
	 * @return
	 */
	public static String nextLineFree(){
		String valor = "";
		while(true){
			valor = nextLine();
			if (valor.length() == 0)
				System.out.printf("err - Digite um nome ou uma letra: ");
			else
				break;
			
		}
		return valor;
	}
	
	/**
	 * Captura uma String, pega o primeiro caractere, tranforma em maiusculo e retorna;
	 * @return
	 */
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
	
	/**
	 * Recebe um vetor de char com os possiveis casos solicitado;
	 * So retorna se o valor digitado estiver de acordo com os caracteres do agrs;
	 * @param args
	 * @return
	 */
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
	
	/**
	 * Recebe um vetor de char com os possiveis casos solicitado;
	 * Retorna true para valores == 'S' e false para 'N';
	 * @param args
	 * @return
	 */
	public static boolean nextCharLimitedBool(char[] args){
		char recebido = ' ';
		recebido = InputDados.nextCharLimited(args);
		
		if(recebido == 'S'){
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Pressione <enter> para continuar;
	 */
	public static void PressToContinue(){
		System.out.print("\nPressione <enter> para continuar...");
		nextLine();
	}
	
}
