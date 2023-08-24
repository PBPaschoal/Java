// Aula 36
// Exercicio 02
// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
// Exemplos:
// Entrada: Saída:
// 12 PAR
// Entrada: Saída:
// -27 IMPAR

package exercicio02;
import java.util.Scanner;

public class exercicioDois {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int enteredValue = keyboard.nextInt();
		
		if (enteredValue % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		keyboard.close();

	}

}
