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
	
	/**
	 * Cria ou nao um arquivo de log.
	 * Adiciona um texto na primeira linha do arquivo caso seja criado
	 * ou abaixo da ultima linha caso nao seja criado.
	 * @param texto
	 */
	public static void addArquivo(String texto, String nomeArquivo){
		try {
			boolean logExiste = false;
			File file =  new File(nomeArquivo);
			logExiste = file.exists();
			
			FileWriter fw = new FileWriter(nomeArquivo, true);
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
	
	/**
	 * Verifica se o arquivo com o nome 'log.txt' existe;
	 * @return
	 * @throws InterruptedException
	 */
	public static boolean logExiste(String nomeArquivo) throws InterruptedException{
		File file =  new File(nomeArquivo);
		if(!file.exists()){
			System.out.print("\nNenhum contrato cadastrado.");
			Thread.sleep(3000);
			return false;
		}
		return true;
	}
	
	/**
	 * Realiza uma leitura do arquivo 'log.txt' e retorna um arraList
	 * com os protocolos contidos no arquivo.
	 * @return
	 */
	public static ArrayList<String> lerArquivo(String nomeArquivo) {
		String payLoad = "";
		ArrayList<String> lista = new ArrayList<String>();
		
			try{
				FileReader fr = new FileReader(nomeArquivo);
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
	
	/**
	 * Recebe um arrayList e cria um novo arquivo com todos os protocolos;
	 * @param array
	 * @throws InterruptedException
	 */
	public static void salvaArrayListArquivo(ArrayList<Cliente> array, String nomeArquivo) throws InterruptedException{
		String payLoad = "";
		
		deletaArquivo(nomeArquivo);
		
		for (Cliente cliente1 : array) {
			//Armazena dados em arquivo.
			payLoad = PayLoad.montaPayLoad(cliente1);
			Arquivo.addArquivo(payLoad, nomeArquivo);
		}
		
		
	}
	
	/**
	 * Deleta um arquivo existente.
	 */
	public static void deletaArquivo(String nomeArquivo){
		boolean logExiste = false;
		
		File file =  new File(nomeArquivo);
		logExiste = file.exists();
		
		if(logExiste){
			file.delete();
		}
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
