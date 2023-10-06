// Aula 88 - Vetores Parte 1
//
// Problema exemplo 1
//
// Fazer um programa para ler um número inteiro N e a altura de N pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas.
//
// Exemplo:
// 
// input:          output:
// 3               AVERAGE HEIGHT = 1.69
// 1.72
// 1.56
// 1.80

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		double[] vect = new double[n];

		for(int i = 0; i < n; i++){
			vect[i] = keyboard.nextDouble();
		}
		
		double sum = 0.0;
		for(int i = 0; i < n; i++){
			sum += vect[i];
		}

		double avg = sum / n;

		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		keyboard.close();
		
	}

}
