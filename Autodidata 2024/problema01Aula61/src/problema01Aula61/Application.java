package problema01Aula61;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		int c = keyboard.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		/*
		 * Uma forma de fazer:
		 
		if (a > b && a > c) {
			System.out.println("Higher = " + a);
		} else if (b > c) {
			System.out.println("Higher = " + b);
		} else {
			System.out.println("Higher = " + c);
		}*/
		
		keyboard.close();
		
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
