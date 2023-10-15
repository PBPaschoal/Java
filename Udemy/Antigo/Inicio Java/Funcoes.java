package course;

import java.util.Scanner;

public class Funcoes {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Entre com os numeros: ");
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		teclado.close();
	
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Maior = " + value);
	}
}
