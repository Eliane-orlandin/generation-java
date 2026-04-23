package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class ExercicioSwitch4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int codigo;
		float saldo = 1000.00f;
		float valor;
		
		System.out.println("*** Código da operação ***");
		System.out.println("* 1 - Saldo              *");
		System.out.println("* 2 - Saque              *");
		System.out.println("* 3 - Depósito           *");
		System.out.println("**************************\n");

		System.out.println("Digite a operação: ");
		codigo = leia.nextInt();
		

		switch (codigo) {
		case 1:
			System.out.printf("Operação - Saldo \nSaldo: R$ %.2f", saldo);
			break;
			
		case 2:
			System.out.println("Digite o valor: ");
			valor = leia.nextFloat();
			
			System.out.println("Operação - Saque");
			if (saldo < valor) {
				System.out.println("Saldo Insuficiente!");
			} else
				System.out.printf("Novo saldo: R$ %.2f", (saldo - valor));
			break;
			
		case 3:
			System.out.println("Digite o valor: ");
			valor = leia.nextFloat(); 
			
			System.out.printf("Operação - Depósito \nNovo saldo: R$ %.2f", (saldo + valor));
			break;
			
		default:
			System.out.println("Opção inválida");			
		}
		
		leia.close();
		
	}

}
