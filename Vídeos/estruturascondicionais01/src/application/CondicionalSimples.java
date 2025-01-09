package application;

import java.util.Scanner;

public class CondicionalSimples {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = keyboard.nextInt();
		
		if(idade >= 18) {
			System.out.println("Você é maior de idade.");
		} else {
			System.out.println("Você é menor de idade");
		}
		
		keyboard.close();
	}
}
