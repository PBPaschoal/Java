package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		int numero, soma = 0;
		
		System.out.println("Vamos somar alguns numeros.");
		System.out.print("Quantas vezes deseja repetir? ");
		int repetir = keyboard.nextInt();
		
		for(int i = 0; i < repetir; i++) {
			System.out.print("Informe um numero inteiro positivo: ");
			numero = keyboard.nextInt();
			soma += numero;
		}
		
		System.out.println("O total da soma dos numeros digitados: = " + soma);
		
		System.out.println();
		System.out.println("Agora vamos contar de x numero até y numero!");
		System.out.print("Quer começar a contar a partir de quanto? ");
		int contarInicio = keyboard.nextInt();
		System.out.print("E quer contar até que número? ");
		int contarFim = keyboard.nextInt();
		
		if(contarInicio < contarFim) {
			for(int i = contarInicio; i <= contarFim; i++) {
				System.out.print(i + " ");
			}
		} else {
			for(int i = contarInicio; i >= contarFim; i--) {
				System.out.print(i + " ");
			}
		}
		
		
		keyboard.close();
		
		
		}

}
