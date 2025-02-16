package exerciciopropostos01;

import java.util.Scanner;

public class exercicio001 {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int valor1, valor2, soma;
		System.out.println("Faça um programa para ler dois valores inteiros,"
				+ "e depois mostrar na tela a soma desses números com uma "
				+ "mensagem explicativa, conforme exemplos.");
		valor1 = keyboard.nextInt();
		valor2 = keyboard.nextInt();
		soma = valor1 + valor2;
		System.out.println("SOMA = " + soma);
		keyboard.close();
	}
}
