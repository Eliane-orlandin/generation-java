package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class ExercicioIf2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 0 && numero > 0) {
			System.out.println("O número " + numero + " é par e positivo");
		} else if (numero % 2 == 1 && numero > 0 ) {
			System.out.println("O número " + numero + " é ímpar e positivo");
		} else if (numero % 2 == 0 && numero < 0) {
			System.out.println("O número " + numero + " é par e negativo");
		} else {
			System.out.println("O número " + numero + " é ímpar e negativo");
		}
		
		leia.close();

	}

}
