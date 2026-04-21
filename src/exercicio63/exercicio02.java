package exercicio63;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite a primeira nota:");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota:");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota:");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a quarta nota:");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("A média final: %.1f%n", media);

		
		leia.close();

	}

}
