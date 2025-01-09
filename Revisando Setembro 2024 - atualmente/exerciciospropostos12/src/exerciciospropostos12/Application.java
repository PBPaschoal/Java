//Exercicios propostos estrutura condicional - 06


package exerciciospropostos12;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos\n"
				+ "seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em\n"
				+ "nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.");
		double valor = keyboard.nextDouble();
		if(valor >= 0 && valor <= 25.0) {
			System.out.println("Intervalo [0,25]");
		} else if (valor >= 25.01 && valor <= 50.0) {
			System.out.println("Intervalo (25,50]");
		} else if (valor >= 50.01 && valor <= 75.0) {
			System.out.println("Intervalo (50,75]");
		} else if (valor >= 75.01 && valor <= 100.0) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}
		
		keyboard.close();
	}

}
