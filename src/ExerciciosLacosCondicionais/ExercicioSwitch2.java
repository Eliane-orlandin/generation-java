package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class ExercicioSwitch2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int codCargo;
		float cargo1, cargo2, cargo3, cargo4, cargo5, cargo6, salario;
		
		System.out.println("********* Código dos cargos *****8****");
		System.out.println("* 1 - Gerente                        *");
		System.out.println("* 2 - Vendedor                       *");
		System.out.println("* 3 - Supervisor                     *");
		System.out.println("* 4 - Motorista                      *");
		System.out.println("* 5 - Estoquista                     *");
		System.out.println("* 6 - Técnico de TI                  *");
		System.out.println("**************************************\n");
		
		cargo1 = 1.10f;
		cargo2 = 1.07f;
		cargo3 = 1.09f;
		cargo4 = 1.06f;
		cargo5 = 1.05f;
		cargo6 = 1.08f;
		
		System.out.println("Nome do Colaborador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite o código do Cargo: (1 - 6)");
		codCargo = leia.nextInt();
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		System.out.println("\n");
		
		switch (codCargo) {
		case 1:
			System.out.printf("Nome do colaborador: %s \nCargo: Gerente \nSalário %.2f ", nome, (salario * cargo1));
			break;
			
		case 2:
			System.out.printf("Nome do colaborador: %s \nCargo: Vendedor \nSalário %.2f ", nome, (salario * cargo2));
			break;
			
		case 3:
			System.out.printf("Nome do colaborador: %s \nCargo: Supervisor \nSalário %.2f ", nome, (salario * cargo3));
			break;
		
		case 4:
			System.out.printf("Nome do colaborador: %s \nCargo: Motorista \nSalário %.2f ", nome, (salario * cargo4));
			break;
			
		case 5:
			System.out.printf("Nome do colaborador: %s \nCargo: Estoquista \nSalário %.2f ", nome, (salario * cargo5));
			break;
			
		case 6:
			System.out.printf("Nome do colaborador: %s \nCargo: Técnico de TI \nSalário %.2f ", nome, (salario * cargo6));
			break;
			
		default:
			System.out.println("Opção inválida");			
		}
		
		leia.close();

	}

}
