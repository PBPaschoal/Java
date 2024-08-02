// Aula 36
// Exercicio 06
// Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
// seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
// nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
// Exemplos:
// Entrada: Saída:
// 25.01 Intervalo (25,50]
// Entrada: Saída:
// 25.00 Intervalo [0,25]
// Entrada: Saída:
// 100.00 Intervalo (75,100]
// Entrada: Saída:
// -25.02 Fora de intervalo

package exercicio06;
import java.util.Locale;
import java.util.Scanner;

public class exercicioSeis {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		double valorQualquer = keyboard.nextDouble();
		
		if (valorQualquer < 0.0 || valorQualquer > 100.0) {
			System.out.println("Fora de intervalo");
		} else if (valorQualquer <= 25.0) {
			System.out.println("Intervalo [0,25]");
		} else if (valorQualquer <= 50.0) {
			System.out.println("Intervalo (25,50]");
		} else if (valorQualquer <= 75.0) {
			System.out.println("Intervalo (50,75]");
		} else {
			System.out.println("Intervalo (75,100]");
		}
		
		keyboard.close();

	}

}
