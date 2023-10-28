// Problema "media_pares"
// Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
// aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
// digitado, mostrar a mensagem "NENHUM NUMERO PAR"
// Exemplo 1:
// Quantos elementos vai ter o vetor? 6
// Digite um numero: 8
// Digite um numero: 2
// Digite um numero: 11
// Digite um numero: 14
// Digite um numero: 13
// Digite um numero: 20
// MEDIA DOS PARES = 11.0
// Exemplo 2:
// Quantos elementos vai ter o vetor? 3
// Digite um numero: 7
// Digite um numero: 9
// Digite um numero: 11
// NENHUM NUMERO PAR

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);

		int n, somapares = 0, npares = 0;
		double mediapares;

		System.out.print("Quantos elementos vai ter o vetor? ");
		n = keyboard.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = keyboard.nextInt();
		}

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				somapares = somapares + vetor[i];
				npares++;
			}
		}

		if (npares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			mediapares = (double) somapares / npares;

			System.out.printf("MEDIA DOS PARES = %.1f\n", mediapares);
		}

		keyboard.close();
	}

}
