package applciation;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Informe o seu primeiro nome: ");
		String nome = keyboard.nextLine();

		System.out.println("O que voce eh meu?");
		String pergunta02 = keyboard.nextLine();

		if (pergunta02.toUpperCase().equals("PAI") && nome.toUpperCase().equals("LUIS")) {
			System.out.println("Oi Pai! Que bom ter voce aqui!");
		} else if (pergunta02.toUpperCase().equals("MAE") && nome.toUpperCase().equals("CLAUDIA")) {
			System.out.println("Oi Mae! Que bom ter voce aqui!");
		} else if (pergunta02.toUpperCase().equals("IRMAO") && nome.toUpperCase().equals("LUIS")
				|| nome.toUpperCase().equals("EDUARDO")) {
			System.out.println("Oi Eduardo! Que bom ter voce aqui!");
		} else if (pergunta02.toUpperCase().equals("IRMAO") && nome.toUpperCase().equals("GUILHERME")
				|| nome.toUpperCase().equals("AUGUSTO")) {
			System.out.println("Oi Guilherme! Que bom ter voce aqui!");
		} else if (pergunta02.toUpperCase().equals("SOBRINHA") && nome.toUpperCase().equals("ALICE")
				|| nome.toUpperCase().equals("BOLUCHA") || nome.toUpperCase().equals("BOBONA")) {
			System.out.println("Oi Alice! Que bom ter voce aqui!");
		} else if (pergunta02.toUpperCase().equals("ESPOSA") || pergunta02.toUpperCase().equals("NAMORADA")
				|| pergunta02.toUpperCase().equals("AMOR") && nome.toUpperCase().equals("BRUNA")
				|| nome.toUpperCase().equals("SENE") || nome.toUpperCase().equals("GATA BRANCA")) {
			System.out.println("Oi Amor! Que bom ter voce aqui!");
		} else {
			System.out.println("Ola!");
		}

		keyboard.close();
	}

}
