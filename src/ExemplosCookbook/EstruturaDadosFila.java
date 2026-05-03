package ExemplosCookbook;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class EstruturaDadosFila {
	public static void main(String[] args) {

		Queue<Integer> fila = new LinkedList<Integer>();

		System.out.println("========== SISTEMA DE CHAMADA DE SENHAS ==========\n");

		// Adiciona senhas de 0 a 10
		System.out.println("[1] Adicionando senhas de 0 a 10 na fila...");
		for (int i = 0; i <= 10; i++) {
			fila.add(i);
		}
		System.out.println("Fila atual: " + fila);

		// Remove o primeiro elemento
		System.out.println("\n[2] Chamando a primeira senha (remove): " + fila.remove());
		System.out.println("Fila após a remoção: " + fila);

		// Adiciona o número 11
		System.out.println("\n[3] Adicionando nova senha (11): " + fila.add(11));
		System.out.println("Fila atualizada: " + fila);

		// Exibe o primeiro elemento (sem remover)
		System.out.println("\n[4] Próxima senha a ser chamada (peek): " + fila.peek());

		// Exibe o tamanho da fila
		System.out.println("\n[5] Quantidade de senhas na fila: " + fila.size());

		// Verifica se a senha 4 está na fila
		System.out.println("\n[6] A senha 4 está na fila? " + fila.contains(4));

		// Exibe e remove o primeiro elemento
		System.out.println("\n[7] Chamando e removendo a próxima senha (poll): " + fila.poll());
		System.out.println("Fila atual: " + fila);

		// Iteração sobre os elementos restantes
		System.out.println("\n[8] Senhas restantes na fila (iterando):");
		Iterator<Integer> iterator = fila.iterator();
		while (iterator.hasNext()) {
			System.out.println("→ Senha: " + iterator.next());
		}

		// Limpa a fila
		System.out.println("\n[9] Limpando todas as senhas da fila...");
		fila.clear();

		// Verifica se a fila está vazia
		System.out.println("[10] A fila está vazia? " + fila.isEmpty());

		System.out.println("\n==================================================");
		System.out.println("Sistema finalizado.");
	}
}
