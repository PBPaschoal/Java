// Aula 28 e 29
// Exercicio 06
// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
// a) a área do triângulo retângulo que tem A por base e C por altura.
// b) a área do círculo de raio C. (pi = 3.14159)
// c) a área do trapézio que tem A e B por bases e C por altura.
// d) a área do quadrado que tem lado B.
// e) a área do retângulo que tem lados A e B.
// Exemplos:
// Entrada: Saída:
// 3.0 4.0 5.2 TRIANGULO: 7.800
// CIRCULO: 84.949
// TRAPEZIO: 18.200
// QUADRADO: 16.000
// RETANGULO: 12.000

package exercicio06;
import java.util.Locale;
import java.util.Scanner;

public class exercicioSeis {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		double A, B, C, triangle, circle, trapeze, square, rectangle;
		
		A = keyboard.nextDouble();
		B = keyboard.nextDouble();
		C = keyboard.nextDouble();
		
		triangle = A * C / 2.0;
		circle = 3.14159 * C * C;
		trapeze = (A + B) / 2.0 * C;
		square = B * B;
		rectangle = A * B;
		
		System.out.printf("TRIANGLE: %.3f%n", triangle);
		System.out.printf("CIRCLE: %.3f%n", circle);
		System.out.printf("TRAPEZE: %.3f%n", trapeze);
		System.out.printf("SQUARE: %.3f%n", square);
		System.out.printf("RECTANGLE: %.3f%n", rectangle);
		
		keyboard.close();

	}

}
