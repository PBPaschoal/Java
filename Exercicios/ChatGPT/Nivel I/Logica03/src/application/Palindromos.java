/* 
 * Escreva um programa em Java que verifica se uma palavra é um palíndromo. Um palíndromo é uma palavra que 
 * é lida da mesma forma de trás para frente.
 * Exemplo:
 * A palavra "radar" é um palíndromo porque lida ao contrário também é "radar".
 * A palavra "java" não é um palíndromo.
 */

package application;

import java.util.Scanner;

public class Palindromos {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Informe uma palavra que seja Palíndromo: ");
		String palavra = keyboard.nextLine();
		
		palavra = palavra.toLowerCase().replaceAll("\\s", ""); // converter a palavra para minuscula e remover espaços/enter/tab

        if (verificarPalindromo(palavra)) {
        	System.out.println("Muito bem! Essa palavra é Palíndromo: ");
		} else {
			System.out.println("Essa palavra não é Palíndromo: ");
		}
		
		keyboard.close();
		
	}
	
	private static boolean verificarPalindromo(String palavra) {
		int comprimento = palavra.length();

        for (int i = 0; i < comprimento / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(comprimento - 1 - i)) {
                return false; 
            }
        }
        return true; 
    }

}
