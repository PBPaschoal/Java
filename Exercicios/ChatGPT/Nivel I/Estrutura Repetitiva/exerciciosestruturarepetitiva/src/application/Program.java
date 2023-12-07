/* Exercicios estruturas repetitivas
 * Exercicio 01) Escreva um programa que imprima os números de 1 a 10 usando um loop while.
 * Exercicio 02) Faça um programa que calcule a soma dos números de 1 a 100 usando um loop for.
 * Exercicio 03) Crie um programa que solicite ao usuário um número e imprima a tabuada desse número de 1 a 10.
 * Exercicio 04) Escreva um programa que peça ao usuário para digitar um número e imprima todos os números pares de 0 até o número fornecido.
 * Exercicio 05) Desenvolva um programa que calcule e imprima o fatorial de um número fornecido pelo usuário.
 * Exercicio 06) Crie um programa que imprima os primeiros 20 termos da sequência de Fibonacci.
 * Exercicio 07) Faça um programa que solicite ao usuário para digitar uma senha. Continue pedindo a senha até que ela seja "senha123".
 * Exercicio 08) Escreva um programa que gere e imprima os números primos entre 1 e 50.
 * Exercicio 09) Desenvolva um programa que peça ao usuário para digitar um número e imprima se ele é primo ou não.
 * Faça um programa que imprima a seguinte pirâmide de números:
 *    1
 *   232
 *  34543
 * 4567654
 */

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int soma = 0;

		System.out.println("--------------------");
		System.out.println("Exercicio 01: ");
		System.out.print("RESULTADO: ");
		int contadorWhile = 1;
		keyboard.nextLine();
		while (contadorWhile <= 10) {
			System.out.print(contadorWhile + " ");
			contadorWhile++;
		}

		System.out.println();
		System.out.println("--------------------");
		System.out.println("Exercicio 02: ");
		for (int i = 1; i <= 100; i++) {
			soma += i;
		}
		System.out.print("RESULTADO: ");
		System.out.println(soma);

		System.out.println();
		System.out.println("--------------------");
		System.out.println("Exercicio 03: ");
		System.out.print("Informe um numero: ");
		int numero = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("RESULTADO TABUADA: ");
		for (int i = 1; i <= 10; i++) {
			int tabuada = numero * i;
			System.out.println(numero + " x " + i + " = " + tabuada);
		}

		System.out.println();
		System.out.println("--------------------");
		System.out.println("Exercicio 04: ");
		System.out.print("Digite um numero: ");
		numero = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("RESULTADO NUMEROS PARES:");
		for (int i = 0; i < numero; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		System.out.println("--------------------");
		System.out.println("Exercicio 05: ");
		System.out.print("Informe um numero: ");
		numero = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("RESULTADO FATORIAL: ");
		int fatorial = 1;
		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
			System.out.println(fatorial);
		}

		System.out.println();
		System.out.println("--------------------");
		System.out.println("Exercicio 06: ");
		int n = 20;
		int primeiroTermo = 0;
		int segundoTermo = 1;
		System.out.println("RESULTADO:");
		System.out.println("Os primeiros " + n + " termos da sequência de Fibonacci são:");
		System.out.print(primeiroTermo + " " + segundoTermo + " ");
		for (int i = 2; i < n; i++) {
			int proximoTermo = primeiroTermo + segundoTermo;
			System.out.print(proximoTermo + " ");
			primeiroTermo = segundoTermo;
			segundoTermo = proximoTermo;
		}

		System.out.println();
		System.out.println("--------------------");
		System.out.println("Exercicio 07: ");
		String senha;
		do {
			System.out.println("Informe a senha: ");
			senha = keyboard.nextLine();

			if (!senha.equals("senha123")) {
				System.out.println("Senha inválida!");
			}

		} while (!senha.equals("senha123"));
		System.out.println("ACESSADO COM SUCESSO!");

		System.out.println();
		System.out.println("--------------------");
		System.out.println("Exercicio 08: ");
		System.out.println("RESULTADO NUMEROS PRIMOS ATE 50: ");
		for (int i = 2; i <= 50; i++) {
			int j;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
			}

			if (j == i) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		System.out.println("--------------------");
		System.out.println("Exercicio 09: ");
		System.out.println("Informe um numero: ");
		int numeroPrimo = keyboard.nextInt();
		System.out.println("RESULTADO NUMEROS PRIMOS ATE " + numeroPrimo + ": ");
		for (int i = 2; i <= numeroPrimo; i++) {
			int j;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
			}

			if (j == i) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		System.out.println("--------------------");
		System.out.println("Exercicio 10: ");
		System.out.println("RESULTADO: ");
		int linhas = 4; // Número de linhas da pirâmide

        for (int i = 1; i <= linhas; i++) {
            // Imprime espaços em branco à esquerda
            for (int j = 1; j <= linhas - i; j++) {
                System.out.print("  ");
            }

            // Imprime números crescentes
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Imprime números decrescentes, exceto o primeiro
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            // Muda para a próxima linha após imprimir a sequência para a linha atual
            System.out.println();
            // depois eu volto para corrigir. 
        }

		keyboard.close();

	}

}
