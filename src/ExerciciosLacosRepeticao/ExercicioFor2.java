package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int i, numero, contador, par = 0, impar = 0;
		
		for (i = 1; i < 11; i++) {
			contador = i;
			System.out.printf("Digite o %dº número: ", contador);
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.printf("Total de números pares: %d\n", par);
		System.out.printf("Total de números pares: %d", impar);
		
		
		
		leia.close();

	}

}
