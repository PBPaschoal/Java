package application;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
	
	Scanner keyboard = new Scanner(System.in);
	
	int m = keyboard.nextInt();
	int n = keyboard.nextInt();
	int[][] mat = new int[m][n];
	
	for(int i = 0; i < mat.length; i++) {
		for(int j = 0; j < mat[i].length; j++) {
			mat[i][j] = keyboard.nextInt();
		}
	}
	
	int x = keyboard.nextInt();
	
	for(int i = 0; i < mat.length; i++) {
		for(int j = 0; j < mat[i].length; j++) {
			if(mat[i][j] == x) {
				System.out.println("Position " + i + "," + j + ":");
				if(j > 0) {
					System.out.println("Left: " + mat[i][j-1]);
				}
				if(i > 0) {
					System.out.println("Up: " + mat[i-1][j]);
				}
				if(j < mat[i].length - 1) {
					System.out.println("Right: " + mat[i][j+1]);
				}
				if(i < mat.length - 1) {
					System.out.println("Down: " + mat[i+1][j]);
				}
			}
		}
	}
	
	keyboard.close();
	
	}

}
