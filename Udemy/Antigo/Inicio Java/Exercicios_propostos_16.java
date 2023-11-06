//Exercícios estrutura while 02
//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

import java.util.Scanner;

public class Exercicios_propostos_16 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int x = teclado.nextInt();
		int y = teclado.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			}
			else {
				System.out.println("Quarto");
			}
			
			x = teclado.nextInt();
			y = teclado.nextInt();
		}

		teclado.close();
	}
}
