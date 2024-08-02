// Aula 48
// Exercicio While 01
// Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
// incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
// impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
// Exemplo:
// Entrada: Saída:
// 2200
// 1020
// 2022
// 2002
// Senha Invalida
// Senha Invalida
// Senha Invalida
// Acesso Permitido

package exerciciowhileum;

import java.util.Scanner;

public class whileExercicioUm {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int enterPassword = keyboard.nextInt();
		
		int myPassword = 2002;
		
		while(enterPassword != myPassword) {
			System.out.println("Invalid password");
			enterPassword = keyboard.nextInt();
		}
		
		System.out.println("Permitted Access");
		
		
		keyboard.close();

	}

}
