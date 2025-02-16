package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = keyboard.nextLine();
		System.out.print("Price: ");
		product.price = keyboard.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = keyboard.nextInt();
		
		System.out.println(product.name + ", " + product.price + ", " + product.quantity);
		
		keyboard.close();
	}

}