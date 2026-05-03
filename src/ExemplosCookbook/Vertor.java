package ExemplosCookbook;

public class Vertor {

	public static void main(String[] args) {
		/*
		 * Sintaxe Vetor
		 * 
		 * Com dados: tipo_de_dado nome_do_vetor[] = {v1, v2, v3,..., vn};
		 * tipo_de_dado[] nome_do_vetor = {v1, v2, v3,..., vn};
		 * 
		 * Sem dados: tipo_de_dado nome_do_vetor[] = new tipo_de_dado[tamanho];
		 * tipo_de_dado[] nome_do_vetor = new tipo_de_dado[tamanho];
		 * 
		 * Tipos: int, double, float, char, String
		 * 
		 * Nome: Uma letra maiúscula no começo de cada palavra, exceto a primeira
		 * (Camel-Case)
		 * 
		 * Acessar vetor: nome_do_vetor[indice];
		 */

		int vetorInteiros[] = { 10, 15, 35, 70, 140 };
		String vetorStrings[] = { "Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "Corgi" };
		float vetorReal[] = new float[5]; // Cria o vetor com 5 posições

		// Vetor Inteiros
		System.out.println("1º elemento: " + vetorInteiros[0]);
		System.out.println("2º elemento: " + vetorInteiros[1]);
		System.out.println("3º elemento: " + vetorInteiros[2]);
		System.out.println("4º elemento: " + vetorInteiros[3]);
		System.out.println("5º elemento: " + vetorInteiros[4]);

		// Vetor Strings
		System.out.println("1º elemento: " + vetorStrings[0]);
		System.out.println("2º elemento: " + vetorStrings[1]);
		System.out.println("3º elemento: " + vetorStrings[2]);
		System.out.println("4º elemento: " + vetorStrings[3]);
		System.out.println("5º elemento: " + vetorStrings[4]);
	}

}
