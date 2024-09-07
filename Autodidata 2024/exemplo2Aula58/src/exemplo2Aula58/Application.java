package exemplo2Aula58;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		
		int mask = 0b100000;
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false");
		}
		
		keyboard.close();

	}

}
