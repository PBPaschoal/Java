package aula90vetores2;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		Product[] vect = new Product[n];
		
		for(int i = 0; i < vect.length; i++) {
			keyboard.nextLine();
			String name = keyboard.nextLine();
			double price = keyboard.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		keyboard.close();
	}

}
