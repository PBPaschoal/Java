/* Exercício 1075 Beecrowd - Resto 2
 * Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão resto igual a 2.
 * 
 * Entrada
 * A entrada contém um valor inteiro N (N < 10000).
 * 
 * Saída
 * Imprima todos valores que quando divididos por N dão resto = 2, um por linha.
 * 
 * Exemplo de Entrada	            Exemplo de Saída
 * 13                               2
 *                                  15
 *                                  28
 *                                  41
 *                                  ... */

package application;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int N = keyboard.nextInt();
		for(int i = 0; i < 1000; i++) {
			if(i % N == 2) {
				System.out.println(i);
			}
		}
		keyboard.close();
	}

}
