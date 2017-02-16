public class Principal{

	public static void main(String[] args){
		AulaJava variavel = new AulaJava();
		variavel.imprimirNome("Rodrigo Fujioka");
		String nome = args[0];
		variavel.imprimirNome(nome);
	}
	
}

//String sempre é definida com letra maiuscula.