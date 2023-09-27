// VERSÃO 02:

package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorV2;

public class ProgramV2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner keyboard = new Scanner(System.in);
		CalculatorV2 calc = new CalculatorV2();
		
		System.out.print("Enter radius: ");
		double radius = keyboard.nextDouble();
		
		double c = calc.circumference(radius);

		double v = calc.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Pi value: %.2f%n", calc.PI);
		
		keyboard.close();
		
	}
	
}
