// Problema "abaixo_da_media"
// Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
// mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
// os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
// Exemplo:
// Quantos elementos vai ter o vetor? 4
// Digite um numero: 10.0
// Digite um numero: 15.5
// Digite um numero: 13.2
// Digite um numero: 9.8
// MEDIA DO VETOR = 12.125
// ELEMENTOS ABAIXO DA MEDIA:
// 10.0
// 9.8

package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calc;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int N = keyboard.nextInt();
		
		double[] valoresReais = new double[N]; // Crie um array para armazenar os números reais
		
		Calc calc = new Calc(valoresReais); // Passe o array para o construtor da classe Calc
		
		
		calc.MeusValoresReais(N, keyboard);
		calc.MediaDosVetores();
		calc.AbaixoDaMedia();
		
		keyboard.close();
		
	}

}
