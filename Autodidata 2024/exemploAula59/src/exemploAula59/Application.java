package exemploAula59;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String original = "abcde FGHIJ ABC abc DEFG     ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		
		String nome = keyboard.nextLine();
		
		String convertUpp = nome.toUpperCase();
		String convertLower = nome.toLowerCase();
		
		System.out.println("convertUpp: " + convertUpp);
		System.out.println("convertLower: " + convertLower);
		
		keyboard.close();
	}

}
