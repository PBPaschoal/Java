import java.util.Scanner;

//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
//Exemplos:
//Entrada:
//5
//6
//7
//8
//Saída:
//DIFERENCA = -26
//Entrada:
//5
//6
//-7
//8
//Saída:
//DIFERENCA = 86

public class Exercicios_propostos_03 {

	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int A, B, C, D, DIFERENCA;
		
		A = teclado.nextInt();
		B = teclado.nextInt();
		C = teclado.nextInt();
		D = teclado.nextInt();
		
		DIFERENCA = A * B - C * D;
		
		System.out.println("DIFERENCA = " + DIFERENCA);
		
		teclado.close();
	}
}
