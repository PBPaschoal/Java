/* Exercício 1079 Médias Ponderadas
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. 
 * Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. 
 * Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o 
 * primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
 * 
 * Entrada
 * O arquivo de entrada contém um valor inteiro N na primeira linha. Cada N linha a seguir 
 * contém um caso de teste com três valores com uma casa decimal cada valor.
 * 
 * Saída
 * Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.
 * 
 * Exemplo de Entrada	        Exemplo de Saída
 * 3                            5.7
 * 6.5 4.3 6.2                  6.3
 * 5.1 4.2 8.1                  9.3
 * 8.0 9.0 10.0  */

package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		double values = 0.0;
		int N = keyboard.nextInt();
		keyboard.nextLine(); // Limpa o buffer

        // Loop para calcular a média para cada valor de N
        for (int i = 0; i < N; i++) {
            // Lê a linha contendo três valores separados por espaço
            String[] valores = keyboard.nextLine().split(" ");

            // Converte os valores para double e calcula a média ponderada
            double valor1 = Double.parseDouble(valores[0]);
            double valor2 = Double.parseDouble(valores[1]);
            double valor3 = Double.parseDouble(valores[2]);
            double media = (valor1 * 2 + valor2 * 3 + valor3 * 5) / (2 + 3 + 5);

            // Imprime a média formatada com uma casa decimal
            System.out.printf("%.1f%n", media);
        }
		keyboard.close();
	}

}
