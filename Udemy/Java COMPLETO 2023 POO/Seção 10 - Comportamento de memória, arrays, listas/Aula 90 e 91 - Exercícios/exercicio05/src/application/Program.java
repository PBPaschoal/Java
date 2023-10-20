// Problema "maior_posicao"
// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
// o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
// considerando a primeira posição como 0 (zero).
// Exemplo:
// Quantos numeros voce vai digitar? 6
// Digite um numero: 8.0
// Digite um numero: 4.0
// Digite um numero: 10.0
// Digite um numero: 14.0
// Digite um numero: 13.0
// Digite um numero: 7.0
// MAIOR VALOR = 14.0
// POSICAO DO MAIOR VALOR = 3

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
		
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int N = keyboard.nextInt();
		
		double[] vetor = new double[N];
		
		for(int i = 0; i < N; i++) {
			keyboard.nextLine();
			System.out.print("Digite um numero: ");
			vetor[i] = keyboard.nextDouble();
		}
		
		double maiorVetor = 0;
		int vetorPosicao = 0;
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] > maiorVetor) {
				maiorVetor = vetor[i];
				vetorPosicao = i;
			}
		}
		
		System.out.printf("MAIOR VALOR = %.1f", maiorVetor);
		System.out.print("\nPOSICAO DO MAIOR VALOR = " + vetorPosicao);
		
		keyboard.close();
	}
}
