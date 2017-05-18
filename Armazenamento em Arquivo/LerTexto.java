package br.unipe.java.arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerTexto {

	public static void main(String[] args) {
		try{
			FileReader fr = new FileReader("arquivo.txt");
			BufferedReader br = new BufferedReader(fr);
			String s = br.readLine();
			System.out.println(s);
			br.close();
		}
		catch (IOException e){
			e.printStackTrace();
			System.out.println("Impossivel ler no arquivo");
		}


	}

}
