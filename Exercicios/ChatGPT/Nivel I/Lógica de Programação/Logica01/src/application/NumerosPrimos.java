/*
 * Exercício: Verificador de Números Primos
 * Escreva um programa em Java que recebe um número inteiro positivo do usuário e verifica se esse número é 
 * primo ou não.
 */

package application;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Informe um numero positivo: ");
		int numero = keyboard.nextInt();

		if (numero <= 1) {
			System.out.println(numero + " não é número primo.");
		} else {
			boolean primo = true;

			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					primo = false;
					break;
				}
			}

			if (primo) {
				System.out.println(numero + " é primo.");
			} else {
				System.out.println(numero + " não é primo.");
			}
		}

		keyboard.close();

	}

}
