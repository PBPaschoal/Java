// Aula 53
// Exercicio 04
// Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo.
// Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
// Exemplo:
// Entrada:           Saída:
// 3                  -1.5
// 3 -2               divisao impossivel
// -8 0               0.0
// 0 8

package exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class exercicioQuatro {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		int primeiroNumero = 0, segundoNumero = 0;
		int N = keyboard.nextInt();
		
		for(int i = 0; i < N; i++) {
			primeiroNumero = keyboard.nextInt();
			segundoNumero = keyboard.nextInt();
			
			if(segundoNumero != 0) {
				double divisao = (double) primeiroNumero / (double) segundoNumero;
				System.out.printf("%.1f%n", divisao);
			} else {
				System.out.println("Divisao impossivel");
			}
		}
		
		keyboard.close();

	}

}
