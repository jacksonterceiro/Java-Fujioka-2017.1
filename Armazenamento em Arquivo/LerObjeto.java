package br.unipe.java.arquivo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class LerObjeto {
	
	public static void main(String[] args){
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String nome1 = leitor.nextLine();
		
	try {
		
		FileInputStream fis = new FileInputStream(nome1+".ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Contato novo = (Contato) ois.readObject();
		
		int id = novo.getId();
		System.out.println(id);
		String nome = novo.getName();
		System.out.println(nome);
		ois.close();
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	leitor.close();
	
}
}