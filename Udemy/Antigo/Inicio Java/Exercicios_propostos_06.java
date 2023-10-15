//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre: 
//a) a área do triângulo retângulo que tem A por base e C por altura. 
//b) a área do círculo de raio C. (pi = 3.14159) 
//c) a área do trapézio que tem A e B por bases e C por altura. 
//d) a área do quadrado que tem lado B. 
//e) a área do retângulo que tem lados A e B.
//Exemplos:
//Entrada:
//3.0 4.0 5.2
//Saída:
//TRIANGULO: 7.800
//CIRCULO: 84.949
//TRAPEZIO: 18.200
//QUADRADO: 16.000
//RETANGULO: 12.000

import java.util.Locale;
import java.util.Scanner;

public class Exercicios_propostos_06 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double A, B, C, Triangulo, Circulo, Trapezio, Quadrado, Retangulo;
		
		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();
		
		Triangulo = A * C / 2;
		Circulo = 3.14159 * (C * C);
		Trapezio = ((A + B) * C) / 2;
		Quadrado = B * B;
		Retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", Triangulo);
		System.out.printf("CIRCULO: %.3f%n", Circulo);
		System.out.printf("TRAPEZIO: %.3f%n", Trapezio);
		System.out.printf("QUADRADO: %.3f%n", Quadrado);
		System.out.printf("RETANGULO: %.3f%n", Retangulo);
		
		teclado.close();
	}
}
