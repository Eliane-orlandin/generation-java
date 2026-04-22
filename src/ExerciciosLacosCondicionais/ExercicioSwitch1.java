package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class ExercicioSwitch1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int produto, qtdade;
		float prod1, prod2, prod3, prod4, prod5, prod6;
		
		System.out.println("******** Códigos dos produtos ********");
		System.out.println("* 1 - Cachorro Quente                *");
		System.out.println("* 2 - X-Salada                       *");
		System.out.println("* 3 - X-Bacon                        *");
		System.out.println("* 4 - Bauru                          *");
		System.out.println("* 5 - Refrigerante                   *");
		System.out.println("* 6 - Suco de Laranja                *");
		System.out.println("**************************************\n");
		
		prod1 = 10.00f;
		prod2 = 15.00f;
		prod3 = 18.00f;
		prod4 = 12.00f;
		prod5 = 8.00f;
		prod6 = 13.00f;
		
		System.out.println("Digite o código do Produto: (1 - 6)");
		produto = leia.nextInt();
		
		System.out.println("Digite a quantidade do Produto: ");
		qtdade = leia.nextInt();
		
		switch (produto) {
		case 1:
			System.out.printf("Produto: Cachorro Quente \nValor total: R$ %.2f ", (prod1 * qtdade));
			break;
			
		case 2:
			System.out.printf("Produto: X-Salada \nValor total: R$ %.2f ", (prod2 * qtdade));
			break;
			
		case 3:
			System.out.printf("Produto: X-Bacon \nValor total: R$ %.2f ", (prod3 * qtdade));
			break;
		
		case 4:
			System.out.printf("Produto: Bauru \nValor total: R$ %.2f ", (prod4 * qtdade));
			break;
			
		case 5:
			System.out.printf("Produto: Refrigerante \nValor total: R$ %.2f ", (prod5 * qtdade));
			break;
			
		case 6:
			System.out.printf("Produto: Suco de Laranja \nValor total: R$ %.2f ", (prod6 * qtdade));
			break;
			
		default:
			System.out.println("Opção inválida");			
		}
		
		leia.close();

	}

}
