// Aula 36
// Exercicio 03
// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
// Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
// ordem crescente ou decrescente.
// Exemplos:
// Entrada: Saída:
// 6 24 Sao Multiplos
// Entrada: Saída:
// 6 25 Nao sao Multiplos

package exercicio03;
import java.util.Scanner;

public class exercicioTres {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int A = keyboard.nextInt();
		int B = keyboard.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao Sao Multiplos");
		}
		
		keyboard.close();

	}

}
