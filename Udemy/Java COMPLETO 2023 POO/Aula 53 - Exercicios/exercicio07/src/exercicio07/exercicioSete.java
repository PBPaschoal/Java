// Aula 53
// Exercicio 07
// Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, começando de 1
// até N. Para cada linha, mostrar o numero da linha, depois o quadrado e o cubo do valor, conforme exemplo.
// Exemplo:
// Entrada:        Saída:
// 5               1 1 1
//                 2 4 8
//                 3 9 27
//                 4 16 64
//                 5 25 125

package exercicio07;

import java.util.Scanner;

public class exercicioSete {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int N = keyboard.nextInt();
		
		for(int i = 1; i <= N; i++) {
			int quadrado = i * i;
			int cubo = i * i * i;
			System.out.println(i + " " + quadrado + " " + cubo);
		}
		
		keyboard.close();

	}

}
