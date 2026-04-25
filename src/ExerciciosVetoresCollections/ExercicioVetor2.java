package ExerciciosVetoresCollections;

import java.util.Scanner;

public class ExercicioVetor2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
		int soma = 0;
		int vetorNumeros [] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			vetorNumeros[i] = leia.nextInt();
		}
		
		System.out.println("\nElementos nos índices ímpares: ");
		for (int i = 0; i < vetorNumeros.length; i++) {
            if (i % 2 == 1) {
                System.out.print(vetorNumeros[i] + " ");
            }
        }
		
		System.out.println("\n\nElementos pares no vetor: ");
		for (int i = 0; i < vetorNumeros.length; i++) {
			 if (vetorNumeros[i] % 2 == 0) {
				 System.out.print(vetorNumeros[i] + " ");
			 }
		 }
		
		for (int i = 0; i < vetorNumeros.length; i++) {
			soma += vetorNumeros[i];
		}
		
		float media = (float) soma / vetorNumeros.length;
		
		System.out.println("\n\nSoma de todos os elementos: " + soma);
		System.out.printf("Média dos elementos : %.2f", media);
		 
		leia.close();

	}
}
