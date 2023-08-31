package tattoo;

import java.util.Scanner;

public class eternalLove {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Are you my father or my mother? ");
		String response = keyboard.next();

		if (response.equals("Mother") || response.equals("Father")) {
			System.out.println("I love you! I will always love, forever!\n"
					+ "Thank you for everything!");
		} else {
			System.out.println("Hello my friend.");
		}
		keyboard.close();
	}
}