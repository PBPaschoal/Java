import java.util.Scanner;

public class Estrutura_repetitiva_enquanto02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int x = 0;
		int y = 4;
		
		while (x < 3) {
			y = y + 2;
			x = x + 1;
			System.out.println(x + "-" + y);
		}
		
		teclado.close();
	}
}
