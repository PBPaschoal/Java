/* Contador de Vogais
 * Crie um programa em Java que solicita ao usuário para inserir uma frase e conta o número de vogais (considerando tanto maiúsculas quanto minúsculas) na frase.
*/

package application;

import java.util.Scanner;

public class ContadorVogais {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
        String frase = keyboard.nextLine().toLowerCase();

        int contadorVogais = contarVogais(frase);

        System.out.println("Número de vogais na frase: " + contadorVogais);

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

}
