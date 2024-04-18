/* Aula 52 Exercício Beecrowd - 1072 Intervalo 2
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
 * essas informações.
 * 
 * Entrada
 * A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste.
 * Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 * 
 * 
 * Saída
 * Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo.
 * 
 * Exemplo de Entrada	        Exemplo de Saída
 * 4                            2 in
 * 14                           2 out 
 * 123
 * 10
 * -25 */

package application;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n, x;
		int inside = 0;
		int outside = 0;
		n = keyboard.nextInt();
		for(int i = 0; i < n; i++) {
			x = keyboard.nextInt();
			if(x >= 10 && x <= 20) {
				inside++;
			} else {
				outside++;
			}
		}
		System.out.println(inside + " in");
		System.out.println(outside + " out");
		
		keyboard.close();
	}
}
