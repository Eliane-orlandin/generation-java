package ExerciciosVetoresCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioCollectionSet2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        Set<Integer> numeros = new HashSet<>();

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

        if (numeros.contains(busca)) {
            System.out.println("\nNúmero " + busca + " encontrado!");
        } else {
            System.out.println("\nO número " + busca + " não foi encontrado!");
        }

        leia.close();
	}

}
