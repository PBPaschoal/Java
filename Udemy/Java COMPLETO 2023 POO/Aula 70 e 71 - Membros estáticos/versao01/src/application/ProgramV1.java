// Aula 70 - Membros estáticos - PARTE 01
// Problema exemplo:
// 
// Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto seria o valor de 
// uma circunferência e do volume de uma esfera para um raio daquele valor. Informar também o valor 
// de PI com duas casas decimais.
// 
// Exemplo:
// Enter radius: 3.0
// Circumference: 18.84
// Volume: 113.04
// PI Value: 3.14
// 
// Checklist
// 
// Versão 01: métodos na própria classe do programa
// 	Nota: Dentro de um método estático você não pode chamar membros de instância da mesma classe.
// 	
// Versão 02: classe Calculator com membros de instância
// 
// Versão 03: classe Calculator com método estático
//
//
// VERSÃO 01:

package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramV1 {
	
	public static final double PI = 3.14;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = keyboard.nextDouble();
		
		double c = circumference(radius);

		double v = volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Pi value: %.2f%n", PI);
		
		keyboard.close();
		
	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
