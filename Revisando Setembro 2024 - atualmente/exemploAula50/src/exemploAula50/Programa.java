package exemploAula50;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int soma = 0;
		int N = keyboard.nextInt();
		for(int i = 0; i < N; i++) {
			int numero = keyboard.nextInt();
			soma += numero;
		}
		
		System.out.println(soma);
		
		keyboard.close();

	}

}
