/* Exercícios Beecrowd - 1067 Números Ímpares
 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
 * 
 * Entrada
 * O arquivo de entrada contém 1 valor inteiro qualquer.
 * 
 * Saída
 * Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.
 * 
 * Exemplo de Entrada	            Exemplo de Saída
 * 8                                1
 *                                  3
 *                                  5
 *                                  7 */

package application;
import java.util.Scanner;

public class numerosImpares {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int x = keyboard.nextInt();
		for(int i = 1; i <= x; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		keyboard.close();

	}

}
