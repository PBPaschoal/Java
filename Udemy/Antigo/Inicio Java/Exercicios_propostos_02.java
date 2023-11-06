import java.util.Locale;
import java.util.Scanner;

//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
//Fórmula da área: area = Pi.raio'2
//Considere o valor de Pi = 3.14159
//Entrada:
//2.00
//Saída:
//A=12.5664
//Entrada:
//100.64
//Saída:
//A=31819.3103

public class Exercicio_propostos_02 {
	
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner teclado = new Scanner(System.in);
			
			double raio = teclado.nextDouble();
			
			double A = 3.14159 * raio * raio;
			
			System.out.printf("A= %.4f%n", A);
			
			teclado.close();
			
	}
}
