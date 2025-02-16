package exerciciospropostos06;

import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e\n"
				+ "mostre:\n"
				+ "\na) a área do triângulo retângulo que tem A por base e C por altura.\n"
				+ "\nb) a área do círculo de raio C. (pi = 3.14159)\n"
				+ "\nc) a área do trapézio que tem A e B por bases e C por altura.\n"
				+ "\nd) a área do quadrado que tem lado B.\n"
				+ "\ne) a área do retângulo que tem lados A e B.");
		double A = keyboard.nextDouble();
		double B = keyboard.nextDouble();
		double C = keyboard.nextDouble();
		double pi = 3.14159;
		double area_triangulo = 1.0 / 2.0 * A * C;
		double area_circulo = pi * Math.pow(C, 2);
		double area_trapezio = 1.0 / 2.0 * (A + B) * C;
		double area_quadrado = Math.pow(B, 2);
		double area_retangulo = A * B;
		System.out.printf("TRIANGULO: %.3f%n", area_triangulo);
		System.out.printf("CIRCULO: %.3f%n", area_circulo);
		System.out.printf("TRAPEZIO: %.3f%n", area_trapezio);
		System.out.printf("QUADRADO: %.3f%n", area_quadrado);
		System.out.printf("RETANGULO: %.3f%n", area_retangulo);
		keyboard.close();
	}

}
