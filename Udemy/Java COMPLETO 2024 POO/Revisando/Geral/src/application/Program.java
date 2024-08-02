package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);

		int numero, soma = 0;

		System.out.println("Vamos somar alguns numeros.");
		System.out.print("Quantas vezes deseja repetir? ");
		int repetir = keyboard.nextInt();

		for (int i = 0; i < repetir; i++) {
			System.out.print("Informe um numero inteiro positivo: ");
			numero = keyboard.nextInt();
			soma += numero;
		}

		System.out.println("O total da soma dos numeros digitados: = " + soma);
		
		System.out.println("for encerrado.");

		System.out.println();
		System.out.println("Agora vamos contar de x numero até y numero!");
		System.out.print("Quer começar a contar a partir de quanto? ");
		int contarInicio = keyboard.nextInt();
		System.out.print("E quer contar até que número? ");
		int contarFim = keyboard.nextInt();

		if (contarInicio < contarFim) {
			for (int i = contarInicio; i <= contarFim; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = contarInicio; i >= contarFim; i--) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("for + if~else encerrado.");
		
		char resposta;

		do {
			System.out.println();
			System.out.print("\nDigite a temperatura em Celsius: ");
			double celsius = keyboard.nextDouble();
			double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
			System.out.print("Deseja repetir (s/n): ");
			resposta = keyboard.next().charAt(0);
		} while (resposta != 'n');
		
		
		System.out.println("do~while encerrado.\n");
		
		System.out.println();
		System.out.print("Digite um valor diferente de 5 ou digite 5 para terminar: ");
		int valor = keyboard.nextInt();
		
		while(valor != 5) {
			valor = keyboard.nextInt();
		}
		
		System.out.println("while encerrado.");

		keyboard.close();

	}

}
