// Aula 54
// Estrutura de repetição do while
// Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit. 
// Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o programa.
//
// Fórmula: F = 9C/5 + 32
//
// Exemplo:
// Digite a temperatura em Celsius: 30.0
// Equivalente em Fahrenheit: 86.0
// Deseja repetir (s/n)? s
// Digite a temperatura em Celsius: 21.0
// Equivalente em Fahrenheit: 69.8
// Deseja repetir (s/n)? s
// Digite a temperatura em Celsius: -10.5
// Equivalente em Fahrenheit: 13.1
// Deseja repetir (s/n)? n

package aula54exempl01;

import java.util.Locale;
import java.util.Scanner;

public class exemplo01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		char resposta;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = keyboard.nextDouble();
			double F = (9.0 * C / 5.0) + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)? ");
			resposta = keyboard.next().charAt(0);
		} while(resposta != 'n');
		
		keyboard.close();

	}

}
