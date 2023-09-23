package funcoes01;

import java.util.Locale;
import java.util.Scanner;

public class umExemploDeFuncoes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		char resposta;
		
		do {
			System.out.print("Informe um valor para calcular a raiz quadrada: ");
			double valor = keyboard.nextDouble();
			
			double raizQuadrada = Math.sqrt(valor);
			
			System.out.println("A raiz quadrada de " + valor + " eh = " + raizQuadrada + "\n");
			System.out.print("Deseja verificar outro valor (s/n)? ");
			resposta = keyboard.next().charAt(0);
		} while(resposta != 'n');
		
		System.out.println("\n-------------------");
		System.out.println("Programa encerrado.");
		System.out.println("-------------------");
		
		keyboard.close();

	}

}
