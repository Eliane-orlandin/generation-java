package ExerciciosEstruturaDados;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ExercicioPilha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Deque<String> pilha = new ArrayDeque<>();
		int opcao;

		do {
			System.out.println("\n********************************");
			System.out.println("| 1 - Adicionar Livro na Pilha |"
							+ "\n| 2 - Listar todos os Livros   |"
							+ "\n| 3 - Retirar Livro da Pilha   |"
							+ "\n| 0 - Sair                     |");
			System.out.println("********************************");
			System.out.print("\nEntre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine(); 

			switch (opcao) {
				case 1:
					System.out.print("\nDigite o nome do livro: ");
					String livro = leia.nextLine();
					pilha.push(livro); 
					
					System.out.println("\nPilha:");
					for (String item : pilha) {
						System.out.println(item);
					}
					System.out.println("\nLivro adicionado!\n");
					break;
	
				case 2:
					System.out.println("\nLivros na pilha:");
					for (String item : pilha) {
						System.out.println(item);
					}
					break;
	
				case 3:
					if (pilha.isEmpty()) {
						System.out.println("\nA pilha está vazia!\n");
					} else {
						String retirado = pilha.pop();
						System.out.println("\nLivro retirado: " + retirado);
						System.out.println("\nPilha atual:");
						for (String item : pilha) {
							System.out.println(item);
						}
					}
					break;
	
				case 0:
					System.out.println("\nPrograma finalizado.");
					break;
	
				default:
					System.out.println("\nOpção inválida!");
				}

		} while (opcao != 0);

		leia.close();

	}

}
