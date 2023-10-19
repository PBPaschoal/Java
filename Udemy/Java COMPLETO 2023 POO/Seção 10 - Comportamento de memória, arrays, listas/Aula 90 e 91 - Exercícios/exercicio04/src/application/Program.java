// Problema "numeros_pares"
// Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
// tela todos os números pares, e também a quantidade de números pares.
// Exemplo:
// Quantos numeros voce vai digitar? 6
// Digite um numero: 8
// Digite um numero: 2
// Digite um numero: 11
// Digite um numero: 14
// Digite um numero: 13
// Digite um numero: 20
// NUMEROS PARES:
// 8 2 14 20
// QUANTIDADE DE PARES = 4

package application;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int N = keyboard.nextInt();
		
		int[] vetor = new int[N];
		
		for(int i = 0; i < N; i++) {
			keyboard.nextLine();
			System.out.print("Digite um numero: ");
			vetor[i] = keyboard.nextInt();
		}
		
		int quantidadeDePares = 0;
		
		System.out.println("NUMEROS PARES: ");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
				quantidadeDePares++;
			}
		}
		
		System.out.print("\nQUANTIDADE DE PARES = " + quantidadeDePares);
		
		keyboard.close();
		
	}

}
