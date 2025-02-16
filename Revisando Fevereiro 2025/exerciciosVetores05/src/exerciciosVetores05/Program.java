//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
//considerando a primeira posição como 0 (zero).
//Exemplo:
//Quantos numeros voce vai digitar? 6
//Digite um numero: 8.0
//Digite um numero: 4.0
//Digite um numero: 10.0
//Digite um numero: 14.0
//Digite um numero: 13.0
//Digite um numero: 7.0
//MAIOR VALOR = 14.0
//POSICAO DO MAIOR VALOR = 3

package exerciciosVetores05;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int quantidade = keyboard.nextInt();
		
		double[] vet = new double[quantidade];
		
		for(int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = keyboard.nextDouble();
		}
		
		int posicao = 0;
		double qualMaior = 0.0;

		for(int i = 0; i < vet.length; i++) {
			if(vet[i] >= qualMaior) {
				qualMaior = vet[i];
				posicao++;
			}
		}
		
		System.out.printf("MAIOR VALOR = %.1f%n", qualMaior);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
		
		keyboard.close();
	}

}
