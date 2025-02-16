//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.
//Exemplo:
//Quantos numeros voce vai digitar? 6
//Digite um numero: 8
//Digite um numero: 2
//Digite um numero: 11
//Digite um numero: 14
//Digite um numero: 13
//Digite um numero: 20
//NUMEROS PARES:
//8 2 14 20
//QUANTIDADE DE PARES = 4

package exerciciosVetores04;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int quantidade = keyboard.nextInt();
		
		int[] vet = new int[quantidade];
		
		for(int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = keyboard.nextInt();
		}
		
		System.out.println("NUMEROS PARES:");
		int contadorPar = 0;
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
				contadorPar++;
			}
		}
		System.out.println();
		System.out.println("QUANTIDADE DE PARES: " + contadorPar);
		
		
		keyboard.close();
	}

}
