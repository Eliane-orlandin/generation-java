package ExemplosCookbook;

import java.util.Scanner;

public class VetorVazio {

	public static void main(String[] args) {
		int vetorInteiros[] = new int[5];
		Scanner leia = new Scanner(System.in);

		for (int indice = 0; indice < 5; indice++) {
			System.out.println("Digite o " + (indice + 1) + "º Número: ");
			vetorInteiros[indice] = leia.nextInt();
		}

		System.out.println("\nOs números digitados foram: \n");

		for (int indice = 0; indice < 5; indice++) {
			System.out.println((indice + 1) + "º número: " + vetorInteiros[indice]);
		}
		leia.close();
	}

}
