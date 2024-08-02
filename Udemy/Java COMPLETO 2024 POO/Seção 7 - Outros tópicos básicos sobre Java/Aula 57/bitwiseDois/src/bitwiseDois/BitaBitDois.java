// Aula 57

package bitwiseDois;
import java.util.Scanner;

public class BitaBitDois {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int mask = 0b100000;
		int n = keyboard.nextInt();

		if((n & mask) != 0){
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bi is false!");
		}

		keyboard.close();

	}

}
