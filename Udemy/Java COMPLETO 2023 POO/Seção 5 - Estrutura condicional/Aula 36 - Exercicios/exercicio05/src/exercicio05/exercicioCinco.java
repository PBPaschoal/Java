// Aula 36
// Exercicio 05
// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
// seguir, calcule e mostre o valor da conta a pagar.
// CODIGO  ESPECIFICACAO    PREÇO
// 1       Cachorro Quente  R$ 4.00
// 2       X-Salada         R$ 4.50
// 3       X-Bacon          R$ 5.00
// 4       Torrada simples  R$ 2.00
// 5       Refrigerante     R$ 1.50
// Exemplos:
// Entrada: Saída:
// 3 2 Total: R$ 10.00
// Entrada: Saída:
// 2 3 Total: R$ 13.50

package exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class exercicioCinco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		double result, price;
		
		// Vamos personalizar um pouco:
		System.out.println("--------------------------------");
		System.out.println("CODIGO  ESPECIFICACAO    PRECO");
		System.out.println("--------------------------------");
		System.out.println("  1     Cachorro Quente  R$ 4.00");
		System.out.println("  2     X-Salada         R$ 4.50");
		
		int itemCode = keyboard.nextInt();
		int itemQuantity = keyboard.nextInt();
		
		if(itemCode == 1) {
			price = 4.00;
		} else if (itemCode == 2) {
			price = 4.50;
		} else if (itemCode == 3) {
			price = 5.00;
		} else if (itemCode == 4) {
			price = 2.00;
		} else {
			price = 1.50;
		}
		
		result = itemQuantity * price;
		System.out.printf("Total: R$ %.2f%n", result);
		
		keyboard.close();

	}

}
