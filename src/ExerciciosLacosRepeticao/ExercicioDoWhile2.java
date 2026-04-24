package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class ExercicioDoWhile2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero;
		int soma = 0, contador = 0;
		float media;

		do {
			System.out.println("\nDigite um número inteiro: (0 para encerrar)");
			numero = leia.nextInt();

			if (numero != 0 && numero % 3 == 0) {
				soma += numero;
				contador++;
			}

		} while (numero != 0);
		
		media = (float) soma / contador;
		
		System.out.printf("A média de todos os números positivos é: %.1f", media);

		leia.close();
	}

}
