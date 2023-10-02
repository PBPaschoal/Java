// Aula 60
// Funções
// Fazer um programa para ler três números inteiros e mostrar na tela o maior deles.
// Exemplo:
// Enter three numbers:
// 5
// 8
// 3
// Higher = 8

package problemaexemplo01;

import java.util.Scanner;

public class ProblemaExemplo01 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Digite tres números: ");
		int primeiroNumero = keyboard.nextInt();
		int segundoNumero = keyboard.nextInt();
		int terceiroNumero = keyboard.nextInt();
		
		/* Poderia ser feito da seguinte forma:
		int resultado = 0;
		
		if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			resultado = primeiroNumero;
		} else if(segundoNumero > terceiroNumero) {
			resultado = segundoNumero;
		} else {
			resultado = terceiroNumero;
		} 
		
		System.out.println("Maior: " + resultado);*/
		
		int maior = max(primeiroNumero, segundoNumero, terceiroNumero);

		showResult(maior);
		
		keyboard.close();

	}

	public static int max(int valorP, int valorS, int valorT){
		int resultado;
		if(valorP > valorS && valorP > valorT) {
				resultado = valorP;
			} else if(valorS > valorT) {
				resultado = valorS;
			} else {
				resultado = valorT;
			} 
			return resultado;
	}
	
	public static void showResult(int value){
		System.out.println("Maior = " + value);
	}

}
