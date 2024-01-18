/* Verificador de Números Perfeitos
 * Um número perfeito é um número inteiro positivo que é igual à soma de seus divisores próprios positivos,
 * excluindo ele mesmo. Por exemplo, 6 é um número perfeito, pois seus divisores próprios (1, 2, 3) somam 6.
 * Escreva um programa em Java que solicita ao usuário que insira um número inteiro positivo e verifica se 
 * esse número é um número perfeito. Se for, o programa deve exibir uma mensagem indicando que é um número 
 * perfeito; caso contrário, deve indicar que não é.
*/

package application;

import java.util.Scanner;

public class NumerosPerfeitos {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Informe um numero inteiro positivo: ");
		int numero = keyboard.nextInt();

		if (Verificando(numero)) {
			System.out.println(numero + " é um número perfeito!");
		} else {
			System.out.println("Este não é um número perfeito.");
		}

		keyboard.close();

	}

	public static boolean Verificando(int numero) {
		int soma = 0;
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0 && i != numero) {
				soma += i;
			}
		}
		return soma == numero;
	}

}
