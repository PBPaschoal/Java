/* Soma dos Números Pares
 * Escreva um programa em Java que solicita ao usuário para inserir um número inteiro positivo. O programa deve calcular e exibir a soma de 
 * todos os números pares de 1 até o número fornecido pelo usuário
 */

package application;

import java.util.Scanner;

public class SomadosNumerosPares {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.print("Informe um numero inteiro positivo: ");
		int numero = keyboard.nextInt();
		
		for(int i = 0; i <= numero; i++) {
			if(i % 2 == 0) {
				soma += i;
			}
		}
		
		System.out.println("A soma de todos os números pares de 1 até " + numero + " = : " + soma);
		
		keyboard.close();
	}

}
