package estruturaCondicionais;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas horas?");
		hora = keyboard.nextInt();
		
		if (hora < 12){
			System.out.println("Bom dia");
		} else if (hora <= 18){
			System.out.println("Boa tarde");
		
		} else {
			System.out.println("Boa noite");
		}
		
		keyboard.close();

	}

}
