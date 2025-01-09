package application;

import java.util.Locale;
import java.util.Scanner;

import converter.CurrencyConverter;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		CurrencyConverter cConverter = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		cConverter.pricedollar = keyboard.nextDouble();
		System.out.print("How many dollars will be bought? ");
		cConverter.quantitydollars = keyboard.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f", cConverter.Tax());
		
		keyboard.close();
	}

}
