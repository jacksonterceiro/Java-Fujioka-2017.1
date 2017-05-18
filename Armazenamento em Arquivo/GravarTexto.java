package br.unipe.java.arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravarTexto {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.setName("IRINEU");
		
		try {
			
		FileWriter fw = new FileWriter("arquivo.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(contato.getName());
		
		bw.close();
		
		}
		catch (IOException e){
			e.printStackTrace();
			System.out.println("Impossivel gravar no arquivo");
		}

	}

}
