//Exercícios estrutura while 01
//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
//Exemplo:
//Entrada:                 Saída:
//2200                     Senha invalida
//1020                     Senha invalida
//2022                     Senha invalida
//2002                     Acesso Permitido

import java.util.Scanner;

public class Exercicios_propostos_15 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int senha = teclado.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha invalida");
			senha = teclado.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		teclado.close();
	}
}
