package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int x = keyboard.nextInt();

		int soma = 0;
		while (x != 0) {
			soma += x;
			x = keyboard.nextInt();
		}
		
		System.out.println("A soma dos numeros: " + soma);

		keyboard.close();
	}

}
