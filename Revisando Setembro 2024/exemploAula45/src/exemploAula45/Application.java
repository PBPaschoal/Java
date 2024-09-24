package exemploAula45;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		int soma = 0;
		int x = keyboard.nextInt();
		
		while (x != 0) {
			soma += x;
			x = keyboard.nextInt();
		}
		
		System.out.println(soma);
		
		keyboard.close();
	}

}
