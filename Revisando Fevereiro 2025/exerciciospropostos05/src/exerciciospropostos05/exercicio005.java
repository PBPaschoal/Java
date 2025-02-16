package exerciciospropostos05;

import java.util.Locale;
import java.util.Scanner;

public class exercicio005 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o\n"
				+ "código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.");
		int product_id1 = keyboard.nextInt();
		int product_quantity1 = keyboard.nextInt();
		double product_value1 = keyboard.nextDouble();
		int product_id2 = keyboard.nextInt();
		int product_quantity2 = keyboard.nextInt();
		double product_value2 = keyboard.nextDouble();
		double value_to_be_paid = (product_quantity1 * product_value1) + (product_quantity2 * product_value2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", value_to_be_paid);
		keyboard.close();
	}

}
