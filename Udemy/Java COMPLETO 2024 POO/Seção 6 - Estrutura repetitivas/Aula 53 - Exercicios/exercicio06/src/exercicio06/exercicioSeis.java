// Aula 53
// Exercicio 06
// Ler um número inteiro N e calcular todos os seus divisores
// Exemplo:
// Entrada:      Saída:
// 6             1
//               2
//               3
//               6

package exercicio06;

import java.util.Scanner;

public class exercicioSeis {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int N = keyboard.nextInt();
		
		for(int i = 1; i <= N; i++) {
			if(N % i == 0) {
				System.out.println(i);
			}
		}
		
		keyboard.close();

	}

}
