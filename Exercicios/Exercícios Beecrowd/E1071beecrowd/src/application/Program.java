/* Aula 52 Exercício Beecrowd - 1071 Soma de Impares Consecutivos I
 * Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.
 * 
 * Entrada
 * O arquivo de entrada contém dois valores inteiros.
 * 
 * Saída
 * O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares que estão entre os valores
 * fornecidos na entrada que deverá caber em um inteiro.
 * 
 * Exemplo de Entrada	                 Exemplo de Saída
 * 6                                     5
 * -5
 * 
 * 15                                    13
 * 12
 * 
 * 12                                    0
 * 12 */

package application;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int X, Y, maior, menor, soma;
		X = keyboard.nextInt();
		Y = keyboard.nextInt();
		soma = 0;
		if(X < Y) {
			maior = Y;
			menor = X;
		} else {
			maior = X;
			menor = Y;
		}
		for(int i = menor + 1; i < maior; i++) {
			if(i % 2 != 0) {
				soma += i;
			}
		}
		System.out.println(soma);
		
		keyboard.close();
	}

}
