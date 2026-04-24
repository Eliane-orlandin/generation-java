package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class ExercicioWhile2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, somaIdades = 0, mulhCisTransFront = 0,homemDevMob = 0, naoBinFull = 0;
		int backend = 0, totalPessoas = 0;
		float mediaIdade;
		String sair = "";
		String genero, dev;
			
		
		while (!sair.equalsIgnoreCase("n")) {
		
			System.out.println("Digite a Idade: ");
			idade = leia.nextInt();
			leia.nextLine();
			
			System.out.println("Identidade de Gênero - Digite (1 a 6):\n"
					+ "1 - Mulher Cis |"
					+ " 2 - Homem Cis |"
					+ " 3 - Não Binário |"
					+ " 4 - Mulher Trans |"
					+ " 5 - Homem Trans |"
					+ " 6 - Outros");
			genero = leia.nextLine();

			System.out.println("Pessoa Desenvolvedora- Digite (1 a 4):\n"
					+ "1 - Backend |"
					+ " 2 - Frontend |"
					+ " 3 - Mobile |"
					+ " 4 - FullStack");
			dev = leia.nextLine();
						
			System.out.println("Deseja adicionar um novo colaborador (S/N):");
			sair = leia.nextLine();	
			
			if (dev.equals("1")) {
				backend++;
			}
			
			if ((genero.equals("1")|| genero.equals("4")) && dev.equals("2")) {
				mulhCisTransFront++;
			}
			
			if ((genero.equals ("2") || genero.equals ("5")) && dev.equals ("3") && idade > 40 ) {
				homemDevMob++;
			}
			
			if (genero.equals ("3") && dev.equals ("4") && idade < 30) {
				naoBinFull++;
			}
			if (idade > 0) {
				somaIdades += idade;
				totalPessoas++;
			}
		}
		mediaIdade = (float) somaIdades / totalPessoas;
		
		System.out.println("Total de pessoas desenvolvedoras Backend: " + backend);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulhCisTransFront);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homemDevMob);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + naoBinFull);
		System.out.println("O número total de pessoas que responderam à pesquisa:  " + totalPessoas);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f" , mediaIdade);
				
		leia.close();
	}
}
