//Estrutura repetitiva do-while
//Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit.
//Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o programa.

import java.util.Scanner;
import java.util.Locale;

public class Estrutura_repetitiva_faca_enquanto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		char repetir;

		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = teclado.nextDouble();
			double F = 9 * C / 5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)? ");
			repetir = teclado.next().charAt(0);
		} while (repetir != 'n');

		teclado.close();

	}

}
