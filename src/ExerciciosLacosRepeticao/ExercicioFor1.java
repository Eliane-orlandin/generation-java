package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class ExercicioFor1 {

	public static void main(String[] args) {
		
		int num1, num2, i;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número do intervalo: ");
		num2 = leia.nextInt();
		
		
		if (num1 >= num2) {
			System.out.println("Intervalo inválido");
		} else {
			System.out.printf("No intervalo entre %d e %d:\n", num1, num2);
			for (i = num1; i <= num2; i++) {
				// if (i % 3 == 0 && i % 5 == 0) { --> aqui o zero aparece como múltiplo
				if (i != 0 && i % 3 == 0 && i % 5 == 0) {
					System.out.printf("%d é múltiplo de 3 e 5\n", i);
				}
			}
			
		}
		
		leia.close();

	}

}
