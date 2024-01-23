/* Contagem de Vogais e Consoantes
 * Escreva um programa em Java que solicita ao usuário para inserir uma palavra ou frase. O programa deve contar e exibir o número de vogais e 
 * consoantes na entrada do usuário.
 * 
 */

package application;

import java.util.Scanner;

public class ContagemdeVogaiseConsoantes {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Informe uma palavra ou frase: ");
		String texto = keyboard.nextLine().toLowerCase();

		int contadorVogais = contarVogais(texto);
		int contarConsoantes = contarConsoantes(texto);

		System.out.println("Número de vogais na frase: " + contadorVogais);
		System.out.println("Número de consoantes na frase: " + contarConsoantes);

		keyboard.close();
	}

	private static int contarVogais(String frase) {
		int contador = 0;

		for (int i = 0; i < frase.length(); i++) {
			char caractere = frase.charAt(i);

			if ("aeiou".contains(String.valueOf(caractere))) {
				contador++;
			}
		}

		return contador;
	}
	
	private static int contarConsoantes(String frase) {
		int contador = 0;

		for (int i = 0; i < frase.length(); i++) {
			char caractere = frase.charAt(i);

			if ("bcdfghjklmnpqrstvwxyz".contains(String.valueOf(caractere))) {
				contador++;
			}
		}

		return contador;
	}

}
