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

		double areaX = x.area();
		double areaY = y.area();

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