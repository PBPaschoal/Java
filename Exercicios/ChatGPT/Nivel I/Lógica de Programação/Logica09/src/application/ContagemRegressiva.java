/* Contagem Regressiva
 *Escreva um programa em Java que solicita ao usuário para inserir um número inteiro positivo. O programa deve então imprimir uma contagem 
 *regressiva a partir desse número até 1.
 */

package application;

import java.util.Scanner;

public class ContagemRegressiva {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro positivo: ");
		int numero = keyboard.nextInt();
		
		for(int i = numero; i > 0; i--) {
			System.out.print(i + " - ");
		}
		
		
		keyboard.close();
		
	}

}
