// Problema "soma_vetores"
// Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
// terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado.
// Exemplo:
// Quantos valores vai ter cada vetor? 6
// Digite os valores do vetor A:
// 8
// 2
// 11
// 14
// 13
// 20
// Digite os valores do vetor B:
// 5
// 10
// 3
// 1
// 10
// 7
// VETOR RESULTANTE:
// 13
// 12
// 14
// 15
// 23
// 27

package application;

import java.util.Scanner;

import util.MeusVetores;

public class Program {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Quantos valores vao ter cada vetor? ");
		int N = keyboard.nextInt();
		
		MeusVetores meusVetores = new MeusVetores(N, keyboard);
		
		meusVetores.lerValoresA();
		meusVetores.lerValoresB();
		
		meusVetores.calcularVetorC();
		meusVetores.mostrarVetorC();
		
		keyboard.close();
	}

}
