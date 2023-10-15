//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
//Exemplos:
//Entrada:
//-10
//Saída:
//NEGATIVO
//Entrada:
//8
//Saída:
//NAO NEGATIVO

import java.util.Scanner;

public class Exercicios_propostos_07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor = teclado.nextInt();
		
		if (valor > 0) {
			System.out.println("NAO NEGATIVO");
		}
		
		else {
			System.out.println("NEGATIVO");
		}
		
		teclado.close();

	}

}
