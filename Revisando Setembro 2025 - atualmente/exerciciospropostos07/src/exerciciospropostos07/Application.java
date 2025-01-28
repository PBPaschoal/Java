package exerciciospropostos07;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.");
		System.out.println("ENTRADA:");
		int valor = keyboard.nextInt();
		System.out.println("SAÍDA:");
		if(valor < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NAO NEGATIVO");
		}
		
		keyboard.close();
	}

}
