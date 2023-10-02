// Aula 53
// Exercicio 02
// Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
// Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
// informações conforme exemplo(use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
// Exemplo:
// Entrada:       Saída:
// 5              2 in
// 14             3 out
// 123 
// 10
// -25
// 32

package exercicio02;

import java.util.Scanner;

public class exercicioDois {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int in = 0, out = 0;
		int N = keyboard.nextInt();
		
		for(int i = 0; i < N; i++) {
			int X = keyboard.nextInt();
			if(X >= 10 && X <= 20) {
				in++;
			} else {
				out++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		keyboard.close();

	}

}
