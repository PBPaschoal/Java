package application;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		int [][] mat = new int[n][n];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = keyboard.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for(int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		int count = 0;
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers = " + count);
		
		keyboard.close();
		
	}

}
