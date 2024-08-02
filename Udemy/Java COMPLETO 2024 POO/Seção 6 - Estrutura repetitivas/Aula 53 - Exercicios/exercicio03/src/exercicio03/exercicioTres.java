// Aula 53
// Exercicio 03
// Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 
// valores reais, cada um deles com uma casa decimal.
// Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o 
// segundo valor tem peso 3 e o terceiro valor tem peso 5.
// Exemplo:
// Entrada:          Saída:
// 3                 5.7
// 6.5 4.3 6.2       6.3
// 5.1 4.2 8.1       9.3
// 8.0 9.0 10.0

package exercicio03;
import java.util.Locale;
import java.util.Scanner;

public class exercicioTres {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		int N = keyboard.nextInt();
		
		for(int i = 0; i < N; i++) {
			double a = keyboard.nextDouble();
			double b = keyboard.nextDouble();
			double c = keyboard.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);
        }
		
		keyboard.close();

	}

}
