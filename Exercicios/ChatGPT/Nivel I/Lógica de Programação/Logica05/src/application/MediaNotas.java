/* Média de Notas
 * Escreva um programa em Java que solicita ao usuário para inserir as notas de alunos em uma disciplina. 
 * O programa deve calcular e exibir a média das notas. O usuário deve poder inserir quantas notas desejar 
 * e indicar que terminou a entrada.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		double media = 0.0;

		do {
			System.out.print("Quantas notas deseja inserir? ");
			int quantidade = keyboard.nextInt();

			if (quantidade == 0) {
				System.out.println(quantidade + ": Vazio.");
			} else if (quantidade < 0) {
				System.out.println("Valor negativo.");
			} else {
				double[] vetor = new double[quantidade];

				for (int i = 0; i < vetor.length; i++) {
					System.out.print("Digite a nota para o aluno " + (i + 1) + ": ");
					vetor[i] = keyboard.nextDouble();
				}

				double soma = 0.0;
				for (int i = 0; i < vetor.length; i++) {
					soma += vetor[i];
				}

				media = soma / vetor.length;

				System.out.println("----------");
				System.out.printf("Media: %.2f", media);
				System.out.println();
			}
			
			System.out.println();
			System.out.println("----------");
			System.out.print("Deseja inserir mais notas? (S/N): ");
		} while (keyboard.next().toLowerCase().equals("s"));
		
		System.out.println();
		System.out.println("----------");
		System.out.println("Programa encerrado.");

		keyboard.close();
	}

}
