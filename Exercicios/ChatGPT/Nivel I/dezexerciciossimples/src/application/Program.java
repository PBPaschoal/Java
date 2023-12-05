/* Exercicio 1) Soma de Dois Números:
 * Solicite dois números ao usuário e exiba a soma deles.
 * Exercicio 2) Cálculo de Média:
 * Peça ao usuário para inserir três notas, calcule a média e exiba o resultado.
 * Exercicio 3) Área do Retângulo:
 * Solicite a base e a altura de um retângulo e calcule sua área.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Exercicio 1:");
		System.out.println("Informe um numero: ");
		int numeroUm = keyboard.nextInt();
		System.out.println("Informe outro numero: ");
		int numeroDois = keyboard.nextInt();
		
		int soma = numeroUm + numeroDois;
		System.out.println("A soma de " + numeroUm + " + " + numeroDois + " = " + soma);
		
		System.out.println("------------");
		System.out.println("Exercicio 2:");
		System.out.println("Informe a primeira nota: ");
		int notaUm = keyboard.nextInt();
		System.out.println("Informe a segunda nota: ");
		int notaDois = keyboard.nextInt();
		System.out.println("Informe a terceira nota: ");
		int notaTres = keyboard.nextInt();
		
		int media = (notaUm + notaDois + notaTres) / 3;
		System.out.println("Resultado: " + media);
		
		System.out.println("------------");
		System.out.println("Exercicio 3:");
		System.out.println("Informe a base do retangulo: ");
		double base = keyboard.nextDouble();
		System.out.println("Informe a altura do retangulo: ");
		double altura = keyboard.nextDouble();
		
		double retangulo = base * altura;
		System.out.println("Retangulo: " + retangulo);
		
		keyboard.close();

	}

}
