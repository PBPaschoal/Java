package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height:");
		
		Retangulo retangulo = new Retangulo();
		retangulo.width = keyboard.nextDouble();
		retangulo.height = keyboard.nextDouble();
		
		System.out.println(retangulo);
		
		keyboard.close();
		
	}

}
