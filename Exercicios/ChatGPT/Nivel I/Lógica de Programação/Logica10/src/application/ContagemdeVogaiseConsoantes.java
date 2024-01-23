/* Contagem de Vogais e Consoantes
 * Escreva um programa em Java que solicita ao usuário para inserir uma palavra ou frase. O programa deve contar e exibir o número de vogais e 
 * consoantes na entrada do usuário.
 * 
 */

package application;

import java.text.Normalizer;
import java.util.Scanner;

public class ContagemdeVogaiseConsoantes {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Informe uma palavra ou frase: ");
		String texto = keyboard.nextLine().toLowerCase().replaceAll("\\s", "");

		int contadorVogais = contarVogais(texto);
		int contarConsoantes = contarConsoantes(texto);

		System.out.println("Número de vogais na frase: " + contadorVogais);
		System.out.println("Número de consoantes na frase: " + contarConsoantes);

		keyboard.close();
	}

	private static int contarVogais(String texto) {
		int contador = 0;
		
		texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = texto.replaceAll("[^\\p{ASCII}]", "");

		for (int i = 0; i < texto.length(); i++) {
			char caractere = texto.charAt(i);

			if ("aeiou".indexOf(caractere) != -1) {
				contador++;
			}
		}

		return contador;
	}
	
	private static int contarConsoantes(String texto) {
		int contador = 0;
		
		texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = texto.replaceAll("[^\\p{ASCII}]", "");

		for (int i = 0; i < texto.length(); i++) {
			char caractere = texto.charAt(i);

			if ("bcdfghjklmnpqrstvwxyz".indexOf(caractere) != -1) {
				contador++;
			}
		}

		return contador;
	}

}
