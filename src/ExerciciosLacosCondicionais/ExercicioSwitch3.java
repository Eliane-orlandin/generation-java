package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class ExercicioSwitch3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float numero1, numero2;
		int operador;
		
		System.out.println("Digite o primeiro número:");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número:");
		numero2 = leia.nextFloat();
		
		System.out.println("Operações: 1 (+) | 2 (-) | 3 (*) | 4 (/)");
		System.out.println("Digite a operação: ");
		operador = leia.nextInt();
		
		switch (operador) {
		case 1:
			System.out.println("Resultado: " + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
			break;
			
		case 2:
			System.out.println("Resultado: " + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
			break;
			
		case 3:
			System.out.println("Resultado: " + numero1 + " * " + numero2 + " = " + (numero1 * numero2));
			break;
		
		case 4:
			System.out.println("Resultado: " + numero1 + " / " + numero2 + " = " + (numero1 / numero2));
			break;	
			
		default:
			System.out.println("Opção inválida");			
		}
		
		
		leia.close();

	}

}
