package ExerciciosVetoresCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioCollectionSet {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
	        Set<Integer> numeros = new HashSet<>();

	        System.out.println("Digite 10 números inteiros:");

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            int valor = leia.nextInt();
	            numeros.add(valor); 
	        }

	        System.out.println("\nListar dados do Set:");
	        Iterator<Integer> iterator = numeros.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        leia.close();
	}
}
