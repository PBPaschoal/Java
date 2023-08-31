// Aula 48 While
// Exercicio 02
// Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
// cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
// menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
// Exemplo:
// Entrada: Saída:
// 2 2
// 3 -2
// -8 -1
// -7 1
// 0 2
// primeiro
// quarto
// terceiro
// segundo

package exerciciowhiledois;

import java.util.Scanner;

public class whileExercicioDois {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int X = keyboard.nextInt();
		int Y = keyboard.nextInt();

		while (X != 0 && Y != 0) {
			if (X > 0 && Y > 0) {
				System.out.println("primeiro");
			} else if (X < 0 && Y > 0) {
				System.out.println("segundo");
			} else if (X < 0 && Y < 0) {
				System.out.println("terceiro");
			} else {
				System.out.println("quarto");
			}
			
			X = keyboard.nextInt();
			Y = keyboard.nextInt();
		}

		keyboard.close();

	}

}
