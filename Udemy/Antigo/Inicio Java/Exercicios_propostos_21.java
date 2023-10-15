//Estrutura for
//Exercicios propostos 04
//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
//Exemplo:
//Entrada:                Saída:
//3                       -1.5
//3 -2                    divisao impossivel
//0 8                     0.0

import java.util.Scanner;

public class Exercicios_propostos_21 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int N = teclado.nextInt();
		
		for (int i=0; i < N; i++) {
			
			int A = teclado.nextInt();
			int B = teclado.nextInt();
			
			if (B == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double div = (double) A / B;
				System.out.printf("%.1f%n", div);
			}
			
		}
		
		teclado.close();
	}

}
