package ExerciciosVetoresCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioCollectionList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		ArrayList <String> cores = new ArrayList<>();
		
		System.out.println("Digite cinco cores: (a cada cor digitada aperte o enter)");
		for (int i = 0; i < 5; i++) {
			cores.add(leia.nextLine());			
			}
		
		System.out.println("\nListar todas as cores: ");
		for (int i = 0; i < cores.size(); i++) {
			System.out.println(cores.get(i));
		}
		
		Collections.sort(cores);
		System.out.println("\nOrdenar as cores: ");
		
		for (int i = 0; i < cores.size(); i++) {
			System.out.println(cores .get(i));
		}
		
		leia.close();
	}

}
