// Aula 28 e 29
// Exercicio 03
// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
// de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
// Exemplos:
// Entrada: Saída:
// 5
// 6
// 7
// 8
// DIFERENCA = -26

package exercicio03;
import java.util.Scanner;

public class exercicioTres {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int A = teclado.nextInt();
		int B = teclado.nextInt();
		int C = teclado.nextInt();
		int D = teclado.nextInt();
		
		int diferenca = (A * B - C * D);
		
		System.out.println("DIFERENCA = " + diferenca);
		
		teclado.close();

	}

}
