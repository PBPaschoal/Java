//Faça um programa que leia um número inteiro Positivo N (máximo = 10) e depois N números inteiros e armazene-os em 
//um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
//Exemplo:
//Quantos numeros você vai digitar? 6
//Digite um numero: 8
//Digite um numero: -2
//Digite um numero: 9
//Digite um numero: 10
//Digite um numero: -3
//Digite um numero: -7
//NUMEROS NEGATIVOS:
//-2
//-3
//-7

package applicatiob;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int quantidade = keyboard.nextInt();
		int[] numeros = new int[quantidade];
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = keyboard.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] < 0) {
				System.out.println(numeros[i]);
			}
		}
		
		keyboard.close();
	}

}
