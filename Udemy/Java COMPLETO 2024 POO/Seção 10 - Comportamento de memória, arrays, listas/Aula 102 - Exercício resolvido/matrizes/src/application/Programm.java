/* Exercício resolvido
 *
 * Fazer um programa para ler um número inteiro N e uma matriz de ordem N contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz.
 * 
 * Exemplo:
 * 
 * Input:
 * 3
 * 5 -3 -10
 * 15 8  2
 * 7  9 -4
 * 
 * Output:
 * Main diagonal:
 * 5 8 -4
 * Negative numbers = 2  
 */
package application;

import java.util.Scanner;

public class Programm {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int n = keyboard.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = keyboard.nextInt();
			}
		}

		System.out.println("Main diagonal:");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}

		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.print("\nNegative numbers = " + count);

		keyboard.close();

	}

}
