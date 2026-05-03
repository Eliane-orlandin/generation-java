package ExemplosCookbook;

public class MetodoSaidaPrintf {

	public static void main(String[] args) {
		/*
		%c   — Caractere simples (char)
		%s   — Cadeia de caracteres (String)
		%b   — Boolean (true ou false)
		%d   — Inteiro (int ou long)
		%f   — Real com ponto flutuante (float ou double)
		%.2f — Real com ponto flutuante (float ou double),
		        delimitando o número de dígitos exibidos nas casas decimais.
		        Exemplo: serão exibidos 2 dígitos depois do ponto.
		%e   — Número real em notação científica com “e” minúsculo (float ou double)
		%E   — Número real em notação científica com “E” maiúsculo (float ou double)
		%%   — Imprimir o próprio caractere %
		*/
		int quantidade = 1000;
		long identificador = 10000l;
		float altura = 25.4f; 
		double area = 45.4567;
		double tamanho = 650000000.00;
		char tipo = 'A';
		String palavra = "Generation";
		 
		System.out.printf("Variável quantidade = %d", quantidade);
		System.out.printf("Variável identificador = %d", identificador);
		System.out.printf("Variável altura = %.2f", altura);
		System.out.printf("Variável area = %.2f", area);
		System.out.printf("Variável tamanho = %e", tamanho);
		System.out.printf("Variável tamanho = %E", tamanho);
		System.out.printf("Variável tipo = %c", tipo);
		System.out.printf("Variável palavra = %s", palavra);
		
	}

}
