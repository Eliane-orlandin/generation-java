package ExerciciosVetoresCollections;

import java.util.Scanner;

public class ExercicioVetor1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int vetorNumeros [] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int valorDigitado;
		
		while(true)  {
			System.out.println("Digite o número que você deseja encontrar: (ou para sair do programa -1)");
			valorDigitado = leia.nextInt();
				
				if (valorDigitado == -1) {
					System.out.println("Programa encerrado");
					break;
				} 
				
				boolean encontrado = false;
				
				for (int i = 0; i < vetorNumeros.length; i++) {
					if (vetorNumeros[i] == valorDigitado) {
						System.out.println("O número " + valorDigitado + " está localizado na posição: " + i);
						encontrado = true;
						break;
					}
				}
				
				if (!encontrado) {
					System.out.println("O número " + valorDigitado + " não foi encontrado!");
				}
		}
		leia.close();
	}

}
