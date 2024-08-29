package exerciciospropostos16;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema \r\n"
				+ "cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo \r\n"
				+ "menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma");
		int X = keyboard.nextInt();
		int Y = keyboard.nextInt();
		
		while(X != 0 || X != 0) {
			if(X > 0 && Y > 0) {
				System.out.println("primeiro");
			} else if (X < 0 && Y > 0) {
				System.out.println("segundo");
			} else if (X < 0 && Y < 0) {
				System.out.println("terceiro");
			} else if (X > 0 && Y < 0) {
				System.out.println("quarto");
			}
			
			X = keyboard.nextInt();
			Y = keyboard.nextInt();
		}
		
		System.out.println();
		
		keyboard.close();
		
	}

}
