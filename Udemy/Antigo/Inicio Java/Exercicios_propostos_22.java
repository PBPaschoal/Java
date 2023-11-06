//Estrutura for
//Exercícios propostos 05
//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por definição, fatorial de 0 é 1.
//Entrada:      Saída:
//4             24
//Entrada:      Saída:
//1             1
//Entrada:      Saída:
//5             120

import java.util.Scanner;

public class Exercicios_propostos_22 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int N = teclado.nextInt();
		
		int fat = 1;
		for (int i = 1; i <= N; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		teclado.close();
		
	}
}
