package entradaDeDados;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		String nome;
		int idade;
		double altura;
		char sexo;
		System.out.println("Digite o seu nome:");
		nome = keyboard.next();
		System.out.println("Voce digitou: " + nome);
		System.out.println("\nDigite a sua idade:");
		idade = keyboard.nextInt();
		System.out.println("Voce digitou: " + idade);
		System.out.println("\nDigite a sua altura:");
		altura = keyboard.nextDouble();
		System.out.printf("Voce digitou: %.2f%n", altura);
		System.out.println("\nInforme o seu sexo: ");
		sexo = keyboard.next().charAt(0);
		System.out.println("Você digitou " + sexo);
		keyboard.close();
	}

}