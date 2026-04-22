package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class ExercicioIf3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		System.out.println("Digite o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação: (true ou false)");
		primeiraDoacao = leia.nextBoolean();
		
		if (idade >= 18 && idade < 60 ) {
			System.out.println(nome + " está apto(a) para doar sangue!");
		} else if (idade >= 60 && idade <= 69 && primeiraDoacao == true) {
			System.out.println(nome + " não está apto(a) para doar sangue!");
		} else if (idade >= 60 && idade <= 69 && primeiraDoacao == false) {
			System.out.println(nome + " está apto(a) para doar sangue!");
		} else {
			System.out.println("Idade " + idade + " não permitida");
		}
		
		leia.close();		

	}

}
