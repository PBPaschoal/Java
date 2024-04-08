/* Fazer um programa que lê um valor inteiro N e depois N números inteiros.
 * Ao final, mostra a soma dos N números lidos.
 * Entrada				Saída
 * 3				    11
 * 5
 * 2
 * 4 */

package application;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int VALOR;
		int SOMA = 0;
		int N = keyboard.nextInt();
		for(int i = 0; i < N; i++) {
			VALOR = keyboard.nextInt();
			SOMA += VALOR;
		}
		System.out.println(SOMA);
		
		keyboard.close();
	}

}
