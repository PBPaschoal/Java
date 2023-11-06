//Estrutura for 03. 
//Exercício proposto 03
//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
//Entrada:        Saída:
//3               5.7
//6.5 4.3 6.2     6.3
//8.0 9.0 10.0    9.3

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_propostos_20 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int N = teclado.nextInt();
		
		for(int i = 0; i < N; i++) {
			
			double a = teclado.nextDouble();
			double b = teclado.nextDouble();
			double c = teclado.nextDouble();
			
			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
			
			System.out.printf("%.1f%n", media);
		}
		
		teclado.close();
	}

}
