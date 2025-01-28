package exerciciospropostos04;

import java.util.Locale;
import java.util.Scanner;

public class exercicio004 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por\n"
				+ "hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas\n"
				+ "decimais.");
		int employee_id = keyboard.nextInt();
		int hours_worked = keyboard.nextInt();
		double hour_value = keyboard.nextDouble();
		double wage = hour_value * hours_worked;
		System.out.println("NUMBER = " + employee_id);
		System.out.printf("SALARY = U$ %.2f%n", wage);
		keyboard.close();
	}

}
