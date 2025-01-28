package exerciciospropostos02;
import java.util.Locale;
import java.util.Scanner;

public class exercicio002 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		double PI = 3.14159;
		double area, raio;
		System.out.println("Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro\n"
				+ "casas decimais conforme exemplos.\n"
				+ "Fórmula da área: area = π . raio2\n"
				+ "Considere o valor de π = 3.14159\n");
		raio = keyboard.nextDouble();
		area = PI * Math.pow(raio, 2);
		System.out.printf("A=%.4f%n", area);
		keyboard.close();
	}

}
