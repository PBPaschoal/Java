// Aula 36
// Exercicio 01
// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
// Exemplos:
// Entrada: Saída:
// -10 NEGATIVO
// Entrada: Saída:
// 8 NAO NEGATIVO

package exercicio01;
import java.util.Scanner;

public class exercicioUm {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int entryValue = keyboard.nextInt();
		
		if (entryValue < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NAO NEGATIVO");
		}
		
		keyboard.close();

	}

}
