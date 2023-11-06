//Estrutura repetitiva for
//Aula 49

import java.util.Scanner;

public class Estrutura_repetitiva_para {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int N = teclado.nextInt();
		
		int soma = 0;
		for (int i=0; i<N; i++) {
			int x = teclado.nextInt();
			soma += x;
		}
		
		System.out.println(soma);
		
		teclado.close();
	}
}
