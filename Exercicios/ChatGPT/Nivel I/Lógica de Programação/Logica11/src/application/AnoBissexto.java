/* Verificação de Ano Bissexto
 * Escreva um programa em Java que solicita ao usuário para inserir um ano. O programa deve verificar se o ano fornecido pelo usuário é 
 * bissexto ou não.
 */

package application;

import java.util.Scanner;

public class AnoBissexto {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Informe um ano: ");
		int ano = keyboard.nextInt();
		
		if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
			System.out.println(ano + " é bissexto.");
		} else {
			System.out.println(ano + " não é bissexto.");
		}
		
		keyboard.close();
	}

}
