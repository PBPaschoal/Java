//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
//seguir, calcule e mostre o valor da conta a pagar
//Código         Especificação         Preço
// 1             Cachorro Quente       R$ 4.00
// 2             X-Salada              R$ 4.50
// 3             X-Bacon               R$ 5.00
// 4             Torrada simples       R$ 2.00
// 5             Refrigerante          R$ 1.50
//Exemplos:
//Entrada:
//3 2
//Saída:
//Total: R$ 10.00
//Entrada:
//2 3
//Saída
//Total: R$ 13.50

import java.util.Locale;
import java.util.Scanner;

public class Exercicios_propostos_11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int codigo, quantidade;
		double total;
		
		codigo = teclado.nextInt();
		quantidade = teclado.nextInt();
		
		if (codigo == 1) {
			total = quantidade * 4.00;
		}
		
		else if (codigo == 2) {
			total = quantidade * 4.50;
		}
		
		else if (codigo == 3) {
			total = quantidade * 5.00;
		}
		
		else if (codigo == 4) {
			total = quantidade * 2.00;
		}
		
		else {
			total = quantidade * 1.50;
		}
			
		System.out.printf("Total: R$ %.2f%n", total);
		
		teclado.close();

	}

}
