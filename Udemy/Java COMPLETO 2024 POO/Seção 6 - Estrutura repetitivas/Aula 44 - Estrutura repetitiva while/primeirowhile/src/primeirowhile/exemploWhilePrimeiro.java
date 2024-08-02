// Aula 44 
// Estrutura repetitiva while
// Problema Exemplo:
// Fazer um programa que lê números inteiros até que um zero seja lido. Ao final, mostrar a soma dos números lidos.

package primeirowhile;
import java.util.Scanner;

public class exemploWhilePrimeiro {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int numeroInteiro = keyboard.nextInt();
		
		int soma = 0;
		while(numeroInteiro != 0){
			soma += numeroInteiro;
			numeroInteiro = keyboard.nextInt();
		}
		
		System.out.println(soma);
		
		keyboard.close();
	}

}
