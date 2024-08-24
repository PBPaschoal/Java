package exemploAula39;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int dataDia = keyboard.nextInt();
		String dia;

		switch (dataDia) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "Valor inválido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		keyboard.close();

	}

}
