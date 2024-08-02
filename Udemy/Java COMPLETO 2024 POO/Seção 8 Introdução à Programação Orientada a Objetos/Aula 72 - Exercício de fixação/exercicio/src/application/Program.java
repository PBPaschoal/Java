// Aula 72
// Exercício de fixação
// 
// Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma 
// pessoa em reais.
// Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que 
// pagar 6% de IOF sobre o valor em dólar.
// Criar uma classe CurrencyConverter para ser responsável pelos cálculos.
// 
// Exemplo:
// What is the dollar price? 3.10
// How many dollars will be bought? 200.00
// Amount to be paid in reais = 657.20
// Fiz essa versão sozinho:
package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double exchangeRate = keyboard.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double amountInDollars = keyboard.nextDouble();
		
		double meuConvert = CurrencyConverter.convert(exchangeRate, amountInDollars);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", meuConvert);
		
		keyboard.close();

	}

}
