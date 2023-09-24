// Aula 64
// O mesmo programa da aula 3, porém agora com programação orientada a objetos

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Insira as medidas do triangulo X: ");
		x.a = keyboard.nextDouble();
		x.b = keyboard.nextDouble();
		x.c = keyboard.nextDouble();
		System.out.println("Insira as medidas do triangulo Y: ");
		y.a = keyboard.nextDouble();
		y.b = keyboard.nextDouble();
		y.c = keyboard.nextDouble();

		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		if(areaX > areaY) {
			System.out.println("Maior area: X");
		} else {
			System.out.println("Maior area: Y");
		}

		keyboard.close();

	}

}