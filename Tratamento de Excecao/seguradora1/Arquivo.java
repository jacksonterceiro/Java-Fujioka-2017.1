package br.unipe.java.seguradora1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 								Residencial - Fisica
 * Pessoa (Tipo): Fisica ou Juridica (Empresarial ou Residencial);
 * Nome: Nome;
 * ValorImovel: Valor do Imovel;
 * Endereço: Endereço;
 * Zona: Urbana ou Rural;
 * Residencia: Apartamento ou Casa;
 * 
 * PayLoad Residencial(Fisica): PessoaøNomeøValorImoveløEndereçoøZonaøResidencia@
 * 
 * 								Empresarial - Juridica
 * Pessoa (Tipo): Fisica ou Juridica (Empresarial ou Residencial);
 * Nome: Nome;
 * ValorImovel: Valor do Imovel;
 * NumFunc: Numero de Funcionarios;
 * VisitasDiarias: Visitas Diarias;
 * Ramo: Comercio, Industria ou Agropecuaria;
 *
 * PayLoad Empresarial(Juridica): PessoaøNomeøValorImoveløNumFuncøVisitasDiariasøRamo@
 * 
 */

public class Arquivo {
	
	public static void addArquivo(String texto){
		try {
			boolean logExiste = false;
			File file =  new File("log.txt");
			logExiste = file.exists();
			
			FileWriter fw = new FileWriter("log.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			if (logExiste)
				bw.append("\n" + texto);
			else
				bw.write(texto);
			
			
			bw.close();
			
			}
			catch (IOException e){
				e.printStackTrace();
				System.out.println("Impossivel gravar no arquivo");
			}
	}
	
	public static boolean logExiste() throws InterruptedException{
		File file =  new File("log.txt");
		if(!file.exists()){
			System.out.println("Nenhum contrato cadastrado.");
			Thread.sleep(3000);
			return false;
		}
		return true;
	}
	
	public static ArrayList<String> lerArquivo() {
		String payLoad = "";
		ArrayList<String> lista = new ArrayList<String>();
		
			try{
				FileReader fr = new FileReader("log.txt");
				BufferedReader br = new BufferedReader(fr);
				
				while(true){
					payLoad = br.readLine();
					
					if (payLoad == null){
						break;
					}
					
					lista.add(payLoad); //Adiciona no mapa.
					
				}
				
				//System.out.println(s);
				br.close();
			}
			catch (IOException e){
				e.printStackTrace();
				System.out.println("Impossivel ler no arquivo");
			}
			
			return lista;
	}

}



/*
package br.unipe.java.arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravarTexto {

		
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
*/
