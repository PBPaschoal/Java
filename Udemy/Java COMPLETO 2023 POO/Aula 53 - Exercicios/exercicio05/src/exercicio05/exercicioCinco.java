// Aula 53
// Exercicio 05
// Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
// Lembrando que, por definição, fatorial de 0 é 1.
// Exemplos:
// Entrada:         Saída:
// 4                24
// Entrada:         Saída:
// 1                1
// Entrada:         Saída:
// 5                120
// Entrada:         Saída:
// 0                1

package exercicio05;

import java.util.Scanner;

public class exercicioCinco {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

        int N = keyboard.nextInt();
        int resultado = 1; // Variável para armazenar o resultado do fatorial

        if (N != 0) {
            for (int i = 1; i <= N; i++) { // Começa em 1
                resultado *= i; // Multiplica o resultado pelo próximo número
            }
        }

        System.out.println(resultado);
		
		keyboard.close();

	}

}
