package br.unipe.java.seguradora1;

import java.util.ArrayList;

public class PayLoad {
	
	/**
	 * Recebe Cliente e monta payLoad com os dados contidos em Cliente;
	 * @param cliente
	 * @return
	 * @throws InterruptedException
	 */
	public static String montaPayLoad(Cliente cliente) throws InterruptedException{
		String PayLoad = "";
		
		switch(cliente.getTipo()){
			case 'F':
				
				Residencial residencial = cliente.getResidencial();
				PayLoad = cliente.getTipo() + "ø" 
						+ cliente.getNome() + "ø" 
						+ residencial.getValorImovel() + "ø" 
						+ residencial.getEndereco() + "ø" 
						+ residencial.getZona() + "ø"
						+ residencial.getResidencia() + "@";
				
				break;
				
			case 'J':
				
					Empresarial empresarial = cliente.getEmpresarial();
					PayLoad = cliente.getTipo() + "ø" 
							+ cliente.getNome() + "ø" 
							+ empresarial.getValorImovel() + "ø"
							+ empresarial.getNumFuncionarios() + "ø"
							+ empresarial.getVisitasDiarias() + "ø"
							+ empresarial.getRamo() + "@";
				break;
				
			default:
				System.out.println("Err mont log");
				Thread.sleep(5000);
				break;
		}
		
		
		return PayLoad;
	}
	
	/**
	 * Converte um arrayList de protocolos em um arrayList da classe Cliente;
	 * @param lista
	 * @return
	 */
	public static ArrayList<Cliente> montaArrayDeCliente(ArrayList<String> lista){
		/*String frase = "nome;teste;10";
		String array[] = new String[3];
		array = frase.split(";");*/
		
		//CRIAR UM ARRAY DE CLIENTE PARA ADICIONAR
		
		String array[] = new String[6];
		ArrayList<Cliente> arrayCliente = new ArrayList<Cliente>();
		
		for(String payLoad : lista){
			//System.out.println(payLoad);
			
			array = payLoad.split("ø");
			
			//System.out.println(array[0]);

			if(array[0].equals("F")){
				
				Residencial residencial = new Residencial(array[3], Float.parseFloat(array[2]), array[4].charAt(0), array[5].charAt(0));
				Cliente cliente = new Cliente(array[0].charAt(0), array[1], residencial);				
				arrayCliente.add(cliente);
				
			} else if(array[0].equals("J")){
				
				Empresarial empresarial = new Empresarial(Float.parseFloat(array[2]), Integer.parseInt(array[3]), Integer.parseInt(array[4]), array[5].charAt(0));
				Cliente cliente = new Cliente(array[0].charAt(0), array[1], empresarial);
				arrayCliente.add(cliente);
			}
			
			//TODO: adicionar no array de cliente e por no retorno;
			
			
		}
		
		return arrayCliente;
	}

}
