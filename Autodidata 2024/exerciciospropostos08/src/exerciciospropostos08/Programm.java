//Exercícios propostos estrutura condicional - 02

package exerciciospropostos08;

import java.util.Scanner;

public class Programm {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.");
		System.out.println("ENTRADA:");
		int valor = keyboard.nextInt();
		System.out.println("SAÍDA:");
		if(valor % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		keyboard.close();
	}

}
