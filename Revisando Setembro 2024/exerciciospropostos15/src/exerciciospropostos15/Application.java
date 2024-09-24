//Exercício 01 Aula 49
package exerciciospropostos15;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int senha = 2002;
		System.out.println("Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha \r\n"
				+ "incorreta informada, escrever a mensagem \"Senha Invalida\". Quando a senha for informada corretamente deve ser \r\n"
				+ "impressa a mensagem \"Acesso Permitido\" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.");
		int digiteSenha = keyboard.nextInt();
		
		while(digiteSenha != senha) {
			System.out.println("Senha Invalida");
			digiteSenha = keyboard.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		keyboard.close();
	}

}
