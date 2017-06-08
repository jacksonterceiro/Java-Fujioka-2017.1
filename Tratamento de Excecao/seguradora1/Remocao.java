package br.unipe.java.seguradora1;

import java.util.ArrayList;

public class Remocao {
	
	/**
	 * Remove um cliente do arrayList; 
	 * @param array
	 * @param cliente
	 * @return
	 */
	public static ArrayList<Cliente> removeClienteArray(ArrayList<Cliente> array, Cliente cliente){
		array.remove(cliente);
		return array;
	}
	
	/**
	 * Confirma remocao com o cliente;
	 * @param cliente
	 * @return
	 */
	public static boolean confirmaRemocao(Cliente cliente){
		System.out.printf("Deseja realmente remover o cliente %s <S/n>? ", cliente.getNome());
		
		char[] esperado = new char[2];
		esperado[0] = 'S';
		esperado[1] = 'N';
		
		if(InputDados.nextCharLimitedBool(esperado)){
			return true;
		}
		return false;
		
	}
}
