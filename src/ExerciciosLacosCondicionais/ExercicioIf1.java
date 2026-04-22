package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class ExercicioIf1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valor1, valor2, valor3, soma;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = leia.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		valor2 = leia.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		valor3 = leia.nextInt();
		
		soma = valor1 + valor2;
		
		if (soma > valor3) {
			System.out.println("A soma de A + B é maior que C.");
		} else if (soma < valor3) {
			System.out.println("A soma de A + B é menor que C.");
		} else {
			System.out.println("A soma de A + B é igual que C.");
		}
			
		leia.close();
	}

}
