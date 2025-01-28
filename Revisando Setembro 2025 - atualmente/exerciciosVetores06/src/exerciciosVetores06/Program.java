//Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
//terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado.
//Exemplo:
//Quantos valores vai ter cada vetor? 6
//Digite os valores do vetor A:
//8
//2
//11
//14
//13
//20
//Digite os valores do vetor B:
//5
//10
//3
//1
//10
//7
//VETOR RESULTANTE:
//13
//12
//14
//15
//23
//27 

package exerciciosVetores06;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int quantidade = keyboard.nextInt();
		
		int[] vet1 = new int[quantidade];
		int[] vet2 = new int[quantidade];
		int[] vet3 = new int[quantidade];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i < vet1.length; i++) {
			vet1[i] = keyboard.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0; i < vet2.length; i++) {
			vet2[i] = keyboard.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		for(int i = 0; i < vet3.length; i++) {
			vet3[i] = vet1[i] + vet2[i];
			System.out.println(vet3[i]);
		}
		
		keyboard.close();
	}

}
