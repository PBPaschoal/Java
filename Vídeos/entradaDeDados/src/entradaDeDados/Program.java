package entradaDeDados;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		int idade;
		String nome, apelido, time;
		
		idade = keyboard.nextInt();
		keyboard.nextLine();
		nome = keyboard.nextLine();
		apelido = keyboard.nextLine();
		time = keyboard.nextLine();
		
		System.out.println("Você digitou: " + idade);
		System.out.println("Você digitou: " + nome);
		System.out.println("Você digitou: " + apelido);
		System.out.println("Você digitou: " + time);
	}

}
