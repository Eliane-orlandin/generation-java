package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class ExercicioWhileRefactor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, genero, dev, totalPessoas, somaIdades = 0;
		float mediaIdade;
		String sair = "";

		int mulhCisTransFront = 0, homemDevMob = 0,	naoBinFull = 0;

		int mulherCis = 0, homemCis = 0, naoBinario = 0, mulherTrans = 0, homemTrans = 0 ,outros = 0;

		int backend = 0, frontend = 0, mobile = 0, fullstack = 0;
			
		
		while (!sair.equalsIgnoreCase("n")) {
		
			System.out.println("Digite a Idade: ");
			idade = leia.nextInt();
			
			System.out.println("Identidade de Gênero - Digite (1 a 6):\n"
					+ "1 - Mulher Cis |"
					+ " 2 - Homem Cis |"
					+ " 3 - Não Binário |"
					+ " 4 - Mulher Trans |"
					+ " 5 - Homem Trans |"
					+ " 6 - Outros");
			genero = leia.nextInt();
			
			switch (genero) {
			case 1:
				mulherCis++;
				break;
			case 2:
				homemCis++;
				break;
			case 3:
				naoBinario++;
				break;
			case 4:
				mulherTrans++;
				break;
			case 5:
				homemTrans++;
				break;
			case 6:
				outros++;
				break;	
			default:
				System.out.println("Opção inválida!");
			}
			
			System.out.println("Pessoa Desenvolvedora- Digite (1 a 4):\n"
					+ "1 - Backend |"
					+ " 2 - Frontend |"
					+ " 3 - Mobile |"
					+ " 4 - FullStack");
			dev = leia.nextInt();
			
			switch (dev) {
			case 1:
				backend++;
				break;
			case 2:
				frontend++;
				break;
			case 3:
				mobile++;
				break;
			case 4:
				fullstack++;
				break;	
			default:
				System.out.println("Opção inválida!");
			}
			
			System.out.println("Deseja adicionar um novo colaborador (S/N):");
			sair = leia.next();	
			
			if ((genero == 1 || genero == 4) && dev == 2) {
				mulhCisTransFront++;
			}
			
			if ((genero == 2 || genero == 5) && dev == 3 && idade > 40 ) {
				homemDevMob++;
			}
			
			if (genero == 3 && dev == 4 && idade < 30) {
				naoBinFull++;
			}
			if (idade > 0) {
				somaIdades += idade;
			}	
		}
		totalPessoas = mulherCis + mulherTrans + homemCis + homemTrans + naoBinario + outros;
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
