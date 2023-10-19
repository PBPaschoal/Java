// Problema "negativos"
// Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
// e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
// Exemplo:
// Quantos numeros voce vai digitar? 6
// Digite um numero: 8
// Digite um numero: -2
// Digite um numero: 9
// Digite um numero: 10
// Digite um numero: -3
// Digite um numero: -7
// NUMEROS NEGATIVOS:
// -2
// -3
// -7
// Depois eu vou refazer esse exercicio com mais de uma class

package application;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		 Scanner keyboard = new Scanner(System.in);
		 
		 System.out.print("Quantos numeros voce vai digitar? ");
		 int N = keyboard.nextInt();
		 
		 int[] vec = new int[N];
		 
		 for(int i = 0; i < N; i++) {
			 System.out.print("Digite um numero: ");
			 vec[i] = keyboard.nextInt();
		 }
		 
		 System.out.println("NUMEROS NEGATIVOS: ");
		 
		 for(int i = 0; i < N; i++) {
			 if(vec[i] < 0) {
				 System.out.println(vec[i]);
			 }
		 }
		 
		 keyboard.close();
		
	}

}
