// Problema "mais_velho"
// Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
// devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome da pessoa mais velha.
// Exemplo:
// Quantas pessoas voce vai digitar? 5
// Dados da 1a pessoa:
// Nome: Joao
// Idade: 16
// Dados da 2a pessoa:
// Nome: Maria
// Idade: 21
// Dados da 3a pessoa:
// Nome: Teresa
// Idade: 15
// Dados da 4a pessoa:
// Nome: Carlos
// Idade: 23
// Dados da 5a pessoa:
// Nome: Paulo
// Idade: 17
// PESSOA MAIS VELHA: Carlos

package application;

import java.util.Scanner;

import entities.DadosVet;

public class Program {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
        int quantidade = keyboard.nextInt();
        keyboard.nextLine();

        String[] vetorName = new String[quantidade];
        int[] vetorIdade = new int[quantidade];
        int maisVelho = 0;

        DadosVet dadosVet = new DadosVet(vetorName, vetorIdade, maisVelho);
        dadosVet.EntradaDosDados();

        int pessoaMaisVelha = dadosVet.ObterPessoaMaisVelha();
        System.out.println("A PESSOA MAIS VELHA É: " + vetorName[pessoaMaisVelha]);

		
		
		/* OU Somente o código abaixo:
		 * int maisVelho = 0;
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int quantidade = keyboard.nextInt();
		keyboard.nextLine();
		
		DadosVet dadosvet = new DadosVet(quantidade, keyboard);
		
		
		
		String[] vetorName = new String[quantidade];
		int[] vetorIdade = new int[quantidade];
		
		for(int i = 0; i < vetorName.length; i++) {
			System.out.print("Dados da "  + ( i + 1) + "a pessoa: ");
			System.out.print("\nNome: ");
			vetorName[i] = keyboard.nextLine();
			System.out.print("Idade: ");
			vetorIdade[i] = keyboard.nextInt();
			keyboard.nextLine();
		}
		
		for(int i = 0; i < vetorName.length; i++) {
			if(vetorIdade[i] > vetorIdade[maisVelho]) {  // Compare com o maisVelho atual
				maisVelho = i; // Atualize a posição da pessoa mais velha
			}
		}
		
		System.out.print("A PESSOA MAIS VELHA É: " + vetorName[maisVelho]); */
		
		keyboard.close();
	}

}
