//Estrutura for. 
//Exercício proposto 01
//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
//Entrada:    Saída:
//8             1
//              3
//              5
//              7

import java.util.Scanner;

public class Exercicios_propostos_18 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int x = teclado.nextInt();

		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		teclado.close();
	}
}
