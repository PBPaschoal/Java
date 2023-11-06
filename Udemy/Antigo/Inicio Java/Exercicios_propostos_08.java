//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
//Exemplos:
//Entrada:
//12
//Saída:
//PAR
//Entrada:
//-27
//Saída:
//IMPAR

import java.util.Scanner;

public class Exercicios_propostos_08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor = teclado.nextInt();
		
		if (valor % 2  == 0) {
			System.out.println("PAR");
		}
		
		else {
			System.out.println("IMPAR");
		}
		
		teclado.close();

	}

}
