package ExerciciosEstruturaDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int opcao;
		Queue<String> fila = new LinkedList<>();

		do {
		    System.out.println("\n*********************************");
		    System.out.println("| 1 - Adicionar Cliente na Fila |"
		            + "\n| 2 - Listar todos os Clientes  |"
		            + "\n| 3 - Retirar Cliente da Fila   |"     
		            + "\n| 0 - Sair                      |");
		    System.out.println("*********************************");
		    System.out.print("\nEntre com a opção desejada: ");
		    opcao = leia.nextInt();
		    leia.nextLine(); 

		    switch (opcao) {
		        case 1:
		            System.out.print("\nDigite o nome do cliente: ");
		            String nome = leia.nextLine();
		            fila.add(nome);

		            System.out.println("\nFila:");
		            for (String cliente : fila) {
		                System.out.println(cliente);
		            }
		            System.out.println("\nCliente Adicionado!\n");
		            break;

		        case 2:
		            System.out.println("\nLista de clientes na fila:");
		            for (String cliente : fila) {
		                System.out.println(cliente);
		            }
		            break;

		        case 3:
		        	if (fila.isEmpty()) {
		                System.out.println("\nA fila está vazia!\n");
		            } else {
		                String chamado = fila.poll();
		                System.out.println("\nCliente chamado: " + chamado);

		                System.out.println("\nFila atual:");
		                for (String cliente : fila) {
		                    System.out.println(cliente);
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
