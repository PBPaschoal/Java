//Estrutura for 
//Exercícios propostos 06
//Ler um número inteiro N e calcular todos os seus divisores.
//Entrada:         Saída:
//6                1
//                 2
//                 3
//                 6

import java.util.Scanner;

public class Exercicios_propostos_23 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int N = teclado.nextInt();
		
		for (int i = 1; i <+ N; i++) {
			if (N % i == 0) {
				System.out.println(i);
			}
		}
		
		teclado.close();
	}
}
