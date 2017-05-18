package br.unipe.java.arquivo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


/**
 *@date 17 de mai de 2017
 *@author  Neto
 *@time	20:49:53
 */

/**
 * @author Neto
 *
 */
public class GravarObjeto {
	
	public static void main(String[] args){
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe seu Id: ");
		int id = Integer.parseInt(leitor.nextLine());
		
		System.out.println("Informe seu nome: ");
		String nome = leitor.nextLine();
		
		Contato c1 = new Contato();
		
		c1.setId(id);
		c1.setName(nome);
		
		try {
			
			FileOutputStream fos = new FileOutputStream(nome+".ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(c1);
			
			oos.close();
			fos.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		leitor.close();
		
	}

}
