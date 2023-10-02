// Aula 53
// Exercicio 01
// Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X,
// se for o caso.
// Exemplo:
// Entrada:       Saída:
// 8              1
//                3
//                5
//                7

package exercicio01;

import java.util.Scanner;

public class exercicioUm {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int X = keyboard.nextInt();
		
		for(int i = 0; i < X; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		keyboard.close();

	}

}
