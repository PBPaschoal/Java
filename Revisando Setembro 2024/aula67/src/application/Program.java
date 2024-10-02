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
		
		keyboard.close();	

	}

}
