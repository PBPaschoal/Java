package problemaExemploAula55;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		char letra;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = keyboard.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)?" );
			letra = keyboard.next().charAt(0);
		} while(letra != 'n');
			
		keyboard.close();

	}

}
