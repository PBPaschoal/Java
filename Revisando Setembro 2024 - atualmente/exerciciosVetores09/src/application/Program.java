//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes 
//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome 
//da pessoa mais velha. 
// 
//Exemplo: 
//Quantas pessoas voce vai digitar? 5 
//Dados da 1a pessoa: 
//Nome: Joao 
//Idade: 16 
//Dados da 2a pessoa: 
//Nome: Maria 
//Idade: 21 
//Dados da 3a pessoa: 
//Nome: Teresa 
//Idade: 15 
//Dados da 4a pessoa: 
//Nome: Carlos 
//Idade: 23 
//Dados da 5a pessoa: 
//Nome: Paulo 
//Idade: 17 
//PESSOA MAIS VELHA: Carlos 

package application;

import java.util.Scanner;

public class Program {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int quantidadePessoas = keyboard.nextInt();
		
		String[] nomePessoas = new String[quantidadePessoas];
		int[] idadePessoas = new int[quantidadePessoas];
		
		for(int i = 0; i < idadePessoas.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			keyboard.nextLine();
			nomePessoas[i] = keyboard.nextLine();
			System.out.print("Idade: ");
			idadePessoas[i] = keyboard.nextInt();
		}
		
		int idadePessoaMaisVelha = 0;
		String nomePessoaMaisVelha = null;
		for(int i = 0; i < idadePessoas.length; i++) {
			if(idadePessoas[i] >= idadePessoaMaisVelha) {
				idadePessoaMaisVelha = idadePessoas[i];
				nomePessoaMaisVelha = nomePessoas[i];
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + nomePessoaMaisVelha);
		
		keyboard.close();
	}

}
