// Aula 89 - Vetores Parte 2
// Problema exemplo 2:
//
// Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N Produtos. 
// Armazene os N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.
//
// Example:
//
// Input:       Output:
// 3
// TV           AVERAGE PRICE = 700.00
// 900.00
// Fryer
// 400.00
// Stove
// 800.00

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		Product[] vect = new Product[n];
		
		for(int i = 0; i < vect.length; i++){ // vect.length é praticamente a mesma coisa que usar a variavel 'n', mas é melhor, pois não fica dependendo de outra variavel que não está atrelada ao vetor. O proprio vetor sabe o tamanho dele
			keyboard.nextLine();
			String name = keyboard.nextLine();
			double price = keyboard.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for(int i = 0; i < vect.length; i++){
			sum += vect[i].getPrice();
		}

		double avg = sum / vect.length;

		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		keyboard.close();
	}

}
