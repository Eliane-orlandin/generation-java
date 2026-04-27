package ExerciciosVetoresCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioCollectionList2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		ArrayList<Integer> numeros = new ArrayList<>();

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);


		System.out.print("Digite um número inteiro para buscar: ");
		int busca = leia.nextInt();

		boolean encontrado = false;
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i).equals(busca)) {
				System.out.println("\nO número " + busca + " foi encontrado na posição " + i + "!");
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("\nO número " + busca + " não foi encontrado!");
		}

		leia.close();
	}
}
