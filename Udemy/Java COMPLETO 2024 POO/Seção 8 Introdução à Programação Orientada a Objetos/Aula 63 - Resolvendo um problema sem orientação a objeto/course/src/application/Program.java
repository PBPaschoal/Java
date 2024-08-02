// Aula 63 Resolvendo um problema sem orientação a objeto
// Problema exemplo:
// 
// Fazer um programa para ler as medidas dos lados de dois triângulos X e Y 
// (suponha medidas válidas). Em seguida, mostrar o valor das áreas dos dois 
// triângulos e dizer qual dos dois triângulos possui a maior área.
// 
// A fómula para calcular a área de um triângulo a partir das medidas de seus 
// lados a, b e c é a seguinte (fórmula de Heron): Area = raiz quadrada: p(p-a)(p-b)
// (p-c) onde p = a + b + c /2
// 
// Exemplo:
// Enter the measures of triangle X (Insira as medidas do triângulo X):
// 3.00
// 4.00
// 5.00
// Enter the measures of triangle Y (Insira as medidas do triângulo Y):
// 7.50
// 4.50
// 4.02
// Triangle X area: 6.0000
// Triangle Y area: 7.5638
// Larger area: Y

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Insira as medidas do triangulo X: ");
		xA = keyboard.nextDouble();
		xB = keyboard.nextDouble();
		xC = keyboard.nextDouble();
		System.out.println("Insira as medidas do triangulo Y: ");
		yA = keyboard.nextDouble();
		yB = keyboard.nextDouble();
		yC = keyboard.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Maior area: X");
		} else {
			System.out.println("Maior area: Y");
		}
		
		keyboard.close();

	}

}
