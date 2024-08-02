// VERSÃO 03:

package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorV3;

public class ProgramV3 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = keyboard.nextDouble();
		
		double c = CalculatorV3.circumference(radius);

		double v = CalculatorV3.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Pi value: %.2f%n", CalculatorV3.PI);
		
		keyboard.close();
		
	}
	
}
