// Aula 73 - Construtores
// Problema exemplo:
// 
// Product
// - Name: string
// - Price: double
// - Quantity: int
// -----------------
// + TotalValueInStock(): double
// + AddProducts(quantity: int): void
// + RemoveProducts(quantity: int): void
// 
// Enter product data:
// Name: TV
// Price 900.00
// Quantity in stock: 10
// 
// Product data: TV, $ 900.00, 10 units, Total: $ 9000.00
// 
// Enter the number of products to be added in stock: 5
// 
// Updated data: TV, $ 900.00, 15 units, Total: $ 13500.00
// 
// Enter the number of products to be removed from stock: 3
// 
// Updated data: TV, $ 900.00, 12 units, Total: $ 10800.00

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = keyboard.nextLine();
		System.out.print("Price: ");
		double price = keyboard.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = keyboard.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = keyboard.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = keyboard.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		keyboard.close();
	}
}