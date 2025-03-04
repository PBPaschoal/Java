//Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
//mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
//os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
//Exemplo:
//Quantos elementos vai ter o vetor? 4
//Digite um numero: 10.0
//Digite um numero: 15.5
//Digite um numero: 13.2
//Digite um numero: 9.8
//MEDIA DO VETOR = 12.125
//ELEMENTOS ABAIXO DA MEDIA:
//10.0
//9.8 


package exerciciosVetores07;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int quantidade = keyboard.nextInt();
		
		double[] numeroV = new double[quantidade];
		
		for(int i = 0; i < numeroV.length; i++) {
			System.out.print("Digite um numero: ");
			numeroV[i] = keyboard.nextDouble();
		}
		
		double somaV = 0.0;
		double mediaV = 0.0;
		for(int i = 0; i < numeroV.length; i++) {
			somaV += numeroV[i];
		}
		
		mediaV = somaV / 4.0;
		System.out.printf("MEDIA DO VETOR = %.3f%n", mediaV);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for(int i = 0; i < numeroV.length; i++) {
			if(numeroV[i] <= mediaV) {
				System.out.println(numeroV[i]);
			}
		}
		
		keyboard.close();
	}

}
