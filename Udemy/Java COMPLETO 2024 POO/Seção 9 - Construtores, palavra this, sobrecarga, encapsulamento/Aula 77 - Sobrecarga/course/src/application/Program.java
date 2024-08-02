// Aula 77 - Sobrecarga
// Proposta de melhoria
// 
// Vamos criar um construtor opcional, o qual recebe apenas nome e preço do produto.
// A quantidade em estoque deste novo produto, por padrão, deverá então ser iniciada com o valor zero.
// 
// Nota: é possível também incluir um construtor padrão.

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		Product p = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = keyboard.nextLine();
		System.out.print("Price: ");
		double price = keyboard.nextDouble();
		Product product = new Product(name, price);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = keyboard.nextInt();
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