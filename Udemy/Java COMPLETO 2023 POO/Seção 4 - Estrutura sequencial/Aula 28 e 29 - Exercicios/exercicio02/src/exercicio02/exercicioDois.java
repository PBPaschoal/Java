// Aula 28 e 29
// Exercicio 02
// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
// casas decimais conforme exemplos.
// Fórmula da área: area = π . raio2
// Considere o valor de π = 3.14159
// Exemplos:
// Entrada: Saída:
// 2.00 A=12.5664

package exercicio02;
import java.util.Locale;
import java.util.Scanner;


public class exercicioDois {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double area, raio, pi = 3.14159;
		
		raio = teclado.nextDouble();
		
		area = pi * raio * raio;
		
		System.out.printf("A=%.4f%n", area);
		
		teclado.close();

	}

}
