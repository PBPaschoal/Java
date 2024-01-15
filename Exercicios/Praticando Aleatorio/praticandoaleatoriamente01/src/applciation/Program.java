package applciation;

import java.util.Locale;
import java.util.Scanner;

import familia.Familia;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Informe o seu primeiro nome: ");
		String nome = keyboard.nextLine();

		System.out.println("O que voce eh meu?");
		String pergunta02 = keyboard.nextLine();
		
		Familia familia = new Familia(keyboard);

		familia.setMeuPai("LUIS"); 
		familia.setMinhaMae("CLAUDIA");

		String saudacao = familia.saudacaoPara(pergunta02, nome);
		System.out.println(saudacao);

		keyboard.close();
	}

}
