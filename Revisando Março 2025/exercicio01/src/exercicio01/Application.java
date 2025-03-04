package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		double largura, comprimento, area, preco, valor;
		largura = keyboard.nextDouble();
		comprimento = keyboard.nextDouble();
		valor = keyboard.nextDouble();
		area = largura * comprimento;
		preco = area * valor;
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f", preco);
		keyboard.close();

	}

}
