package exercicio63;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("O salário R$ %.2f + abono R$ %.2f = R$ %.2f%n", salario, abono, novoSalario);

		leia.close();
				

	}

}
