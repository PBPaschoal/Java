//Exercícios propostos estrutura condicional - 05

package exerciciospropostos11;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Com base na tabela no PDF, escreva um programa que leia o código de um item e a quantidade deste item. A\n"
				+ "seguir, calcule e mostre o valor da conta a pagar.");
		int idProduto = keyboard.nextInt();
		int quantidade = keyboard.nextInt();
		double valorProduto, valorTotal;
		
		if(idProduto == 1) {
			valorProduto = 4.00;
		} else if (idProduto == 2) {
			valorProduto = 4.50;
		} else if (idProduto == 3) {
			valorProduto = 5.00;
		} else if (idProduto == 4) {
			valorProduto = 2.00;
		} else {
			valorProduto = 1.50;
		}
		valorTotal = valorProduto * quantidade;
		System.out.printf("Total: %.2f%n", valorTotal);
		keyboard.close();
	}

}
