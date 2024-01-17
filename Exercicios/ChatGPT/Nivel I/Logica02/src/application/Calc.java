/*
 * Escreva um programa em Java que solicita ao usuário que insira um número inteiro positivo e, em seguida, 
 * calcula o fatorial desse número. O fatorial de um número n é o produto de todos os números inteiros de 1 até 
    � * O fatorial de 0 é definido como 1.
 */

package application;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Informe um numero inteiro positivo: ");
		int numero = keyboard.nextInt();
		int fatorial = 1;
		
		if(numero < 0) {
			System.out.println("Informe um número positivo.");
		} else if (numero == 0){
			 System.out.println("Fatorial de " + numero + " é = 1");
		} else {
			for(int i = numero; i >= 1; i--) {
				fatorial = fatorial * i;
			}
			System.out.println("Fatorial de " + numero + " é = " + fatorial);
		}
		
		keyboard.close();
	}

}
