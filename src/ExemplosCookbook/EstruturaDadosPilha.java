package ExemplosCookbook;

import java.util.ArrayDeque;
import java.util.Deque;

public class EstruturaDadosPilha {
	public static void main(String[] args) {

		// Criação de uma pilha usando ArrayDeque
		Deque<String> pilha = new ArrayDeque<>();

		// Variável para identificar a posição do elemento na pilha
		int contador = 0;

		// Adiciona elementos no topo da pilha
		pilha.push("Prato Verde");
		pilha.push("Prato Azul");
		pilha.push("Prato Branco");
		pilha.push("Prato Amarelo");
		pilha.push("Prato Vermelho");

		// Exibe os elementos da pilha do topo para a base
		System.out.println("\nElementos da Pilha (topo → base):");
		contador = pilha.size();

		for (String prato : pilha) {
			System.out.printf("[%d] %s%n", contador, prato);
			contador--;
		}

		// Remove o elemento do topo da pilha
		System.out.println("\nRetirar elemento: " + pilha.pop());

		// Exibe os elementos da pilha após remoção
		System.out.println("\nElementos da Pilha (topo → base):");
		contador = pilha.size();

		for (String prato : pilha) {
			System.out.printf("[%d] %s%n", contador, prato);
			contador--;
		}

		// Remove mais um elemento do topo da pilha
		System.out.println("\nRetirar elemento: " + pilha.pop());

		// Exibe os elementos da pilha após nova remoção
		System.out.println("\nElementos da Pilha (topo → base):");
		contador = pilha.size();

		for (String prato : pilha) {
			System.out.printf("[%d] %s%n", contador, prato);
			contador--;
		}

		// Mostra o elemento atual no topo da pilha sem removê-lo
		System.out.println("\nElemento no topo da Pilha: " + pilha.peek());

		// Adiciona um novo elemento ao topo da pilha
		pilha.push("Prato Roxo");

		// Informa que um novo prato foi adicionado
		System.out.println("\nAdicionar Elemento Prato Roxo");

		// Exibe a pilha atualizada após adição
		System.out.println("\nPilha Atualizada (topo → base):");
		contador = pilha.size();

		for (String prato : pilha) {
			System.out.printf("[%d] %s%n", contador, prato);
			contador--;
		}

		// Exibe o tamanho atual da pilha
		System.out.println("\nTamanho da Pilha: " + pilha.size());

		// Verifica se a pilha contém um elemento específico
		System.out.println("\nO Elemento Prato Verde existe na Pilha? " + pilha.contains("Prato Verde"));

		// Exibe todos os elementos da pilha usando uma nova iteração
		System.out.println("\nExibir todos os Elementos da Pilha por Iteração (topo → base):");
		contador = pilha.size();

		for (String prato : pilha) {
			System.out.printf("[%d] %s%n", contador, prato);
			contador--;
		}

		// Limpa todos os elementos da pilha
		pilha.clear();

		// Verifica se a pilha está vazia
		System.out.println("\nA Pilha está vazia? " + pilha.isEmpty());
	}
}
