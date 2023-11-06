/* Aula 63 RESOLVENDO UM PROBLEMA SEM ORIENTAÇÃO A OBJETOS.
 * Problema exemplo:
 * Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas).
 * Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a maior área.
 * 
 * A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a seguinte (fórmula de Heron):
 * p = a + b + c sobre 2
 * Exemplo:
 * Digite as medidas do triângulo X:
 * 3.00
 * 4.00
 * 5.00
 * Digite as medidas do triângulo Y:
 * 7.50
 * 4.50
 * 4.02
 * Triângulo X area: 6.0000
 * Triângulo Y area: 7.5638
 * Larger area: Y */

package course;

import java.util.Locale;
import java.util.Scanner;

public class sem_orientacao_a_objetos {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Enter the measures of triangle X: ");
		xA = teclado.nextDouble();
		xB = teclado.nextDouble();
		xC = teclado.nextDouble();
		System.out.println("Enter the measures of triangule Y: ");
		yA = teclado.nextDouble();
		yB = teclado.nextDouble();
		yC = teclado.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
				
		teclado.close();
				
				
	}

}
