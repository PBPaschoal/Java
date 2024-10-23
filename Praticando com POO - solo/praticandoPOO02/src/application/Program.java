package application;

import java.util.Locale;
import java.util.Scanner;

import animais.Gatos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		Gatos gatos = new Gatos();
		
		gatos.setNome(keyboard.nextLine());
		gatos.setSexo(keyboard.next().charAt(0));
		gatos.setAno(keyboard.nextInt());
		gatos.setQuilos(keyboard.nextDouble());
		
		System.out.println(gatos.bebendoAgua());
		System.out.println(gatos.quantosQuilos());
		System.out.println(gatos.aIdadeESexo());
		
		keyboard.close();

	}

}
