package exerciciospropostos03;
import java.util.Scanner;

public class exercicio003 {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int A, B, C, D, DIFERENCA;
		System.out.println("Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto\n"
				+ "de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).\n");
		A = keyboard.nextInt();
		B = keyboard.nextInt();
		C = keyboard.nextInt();
		D = keyboard.nextInt();
		DIFERENCA = (A * B) - (C * D);
		System.out.println("DIFERENA = " + DIFERENCA);
		keyboard.close();
	}

}
