package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class ExercicioWhile1 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		 
		 int  idade = 0, menor = 0, maior = 0;
		 
		 while (idade >= 0) {
				System.out.println("Digite uma idade (valor negativo para encerrar)");
				idade = leia.nextInt();
				
				if (idade < 0) {
					break;
				}
		
				if (idade < 21) {
					menor++;
				} else if (idade > 50){
					maior++;
				}
		 }
		 System.out.printf("Total de pessoas menores de 21 anos: %d\n", menor);
		 System.out.printf("Total de pessoas maiores de 50 anos: %d\n", maior);
		 
		 leia.close();
	}

}
