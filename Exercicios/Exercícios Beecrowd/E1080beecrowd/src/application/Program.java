package application;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int integer_value, count, more;
		more = 0;
		count = 0;
		for(int i = 0; i < 6; i++) {
			integer_value = keyboard.nextInt();
			if(integer_value >= more) {
				more = integer_value;
				count++;
			}
		}
		System.out.println(more);
		System.out.println(count + 1);
		keyboard.close();
	}

}
