package exerciciospropostos13;

import java.util.Locale;
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas\n"
				+ "de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o\n"
				+ "ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).\n"
				+ "Se o ponto estiver na origem, escreva a mensagem “Origem”.\n"
				+ "Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a\n"
				+ "situação.");
		
		double x = keyboard.nextDouble();
		double y = keyboard.nextDouble();
		//Verificação da Origem:
		if(x == 0 && y == 0) {
			System.out.println("Origem");
		} else if (x == 0 && y != 0) {
			//Verificação dos Eixos:
			System.out.println("Eixo Y");
		} else if (x != 0 && y == 0) {
			//Verificação dos Eixos:
			System.out.println("Eixo X");
			
		} else if (x > 0 && y > 0) {
			//Determinação do Quadrante:
			System.out.println("Q1");
		} else if (x < 0 && y > 0) {
			//Determinação do Quadrante:
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			//Determinação do Quadrante:
			System.out.println("Q3");
		} else {
			//Determinação do Quadrante:
			System.out.println("Q4");
		}
		
		keyboard.close();
	}

}
