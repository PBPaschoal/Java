// Problema "soma_vetor"
// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
// - Imprimir todos os elementos do vetor
// - Mostrar na tela a soma e a média dos elementos do vetor
// Exemplo:
// Quantos numeros voce vai digitar? 4
// Digite um numero: 8.0
// Digite um numero: 4.0
// Digite um numero: 10.0
// Digite um numero: 14.0
// VALORES = 8.0 4.0 10.0 14.0
// SOMA = 36.00
// MEDIA = 9.00
// Depois eu vou refazer esse exercicio com mais de uma class

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int NumerosReais = keyboard.nextInt();
		
		double[] vetor = new double[NumerosReais];
		
		for(int i = 0; i < NumerosReais; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = keyboard.nextDouble();
		}
		
		System.out.print("VALORES = ");
		for(int i = 0; i < NumerosReais; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}
		
		double soma = 0.0;
		for(int i = 0; i < NumerosReais; i++) {
			soma += vetor[i];
		}
		
		double media = soma / NumerosReais;
		
		System.out.printf("\nSOMA = %.2f", soma);
		System.out.printf("\nMEDIA = %.2f", media);
		
		keyboard.close();
	}

}
