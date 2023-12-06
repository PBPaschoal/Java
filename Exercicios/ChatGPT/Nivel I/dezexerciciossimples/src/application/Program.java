/* Exercicio 1) Soma de Dois Números:
 * Solicite dois números ao usuário e exiba a soma deles.
 * Exercicio 2) Cálculo de Média:
 * Peça ao usuário para inserir três notas, calcule a média e exiba o resultado.
 * Exercicio 3) Área do Retângulo:
 * Solicite a base e a altura de um retângulo e calcule sua área.
 * Exercicio 4) Conversão de Temperatura:
 * Peça ao usuário para inserir uma temperatura em Celsius e converta-a para Fahrenheit. A fórmula é: F = (C * 9/5) + 32.
 * Exercicio 5) Cálculo de Juros Simples:
 * Solicite o principal, a taxa de juros e o tempo de aplicação. Calcule e exiba o montante usando a fórmula de juros simples: 
 * Montante = Principal * (1 + Taxa * Tempo).
 * Exercicio 6) Conversão de Distância:
 * Peça ao usuário para inserir uma distância em quilômetros e converta-a para metros.
 * Exercicio 7) Volume de uma Esfera:
 * Solicite o raio de uma esfera e calcule o seu volume. A fórmula é: Volume = (4/3) * π * Raio^3.
 * Exercicio 8) Calculadora de Salário:
 * Solicite o valor da hora de trabalho e o número de horas trabalhadas em um mês. Calcule e exiba o salário total.
 * Exercicio 9) Troco de Compra:
 * Peça ao usuário para inserir o valor da compra e o valor pago. Calcule e exiba o troco.
 * Exercicio 10) Calculadora de IMC (Índice de Massa Corporal):
 * Solicite o peso e a altura do usuário e calcule o IMC usando a fórmula: IMC = Peso / (Altura * Altura). Exiba a categoria do IMC 
 * (abaixo do peso, peso normal, etc.).
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static final double PI = 3.14159265358979323846;

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
		System.out.println("Media: " + media);

		System.out.println("------------");
		System.out.println("Exercicio 3:");
		System.out.println("Informe a base do retangulo: ");
		double base = keyboard.nextDouble();
		System.out.println("Informe a altura do retangulo: ");
		double altura = keyboard.nextDouble();
		double retangulo = base * altura;
		System.out.printf("Retangulo: %.2f", retangulo);

		System.out.println();
		System.out.println("------------");
		System.out.println("Exercicio 4:");
		System.out.println("Informe a temperatura em Celsius: ");
		double celsius = keyboard.nextDouble();
		double fahrenheit = (celsius * 9 / 5) + 32;
		System.out.printf("Conversão de temperatura para Fahrenheit: %.2f", fahrenheit);

		System.out.println();
		System.out.println("------------");
		System.out.println("Exercicio 5:");
		System.out.println("Informe o valor principal: ");
		double principal = keyboard.nextDouble();
		System.out.println("Informe a taxa de juros: ");
		double taxa = keyboard.nextDouble();
		System.out.println("Informe o tempo de aplicacao: ");
		double tempo = keyboard.nextDouble();
		double montante = principal * (1 + taxa * tempo);
		System.out.printf("Montante: %.2f", montante);

		System.out.println();
		System.out.println("------------");
		System.out.println("Exercicio 6:");
		System.out.println("Informe o valor da distancia: ");
		double distancia = keyboard.nextDouble();
		double metros = distancia * 1000;
		System.out.printf("Distancia em quilômetros convertida para metros: %.2f", metros);

		System.out.println();
		System.out.println("------------");
		System.out.println("Exercicio 7:");
		System.out.println("Informe o raio de uma esfera:");
		double raio = keyboard.nextDouble();
		double volume = (4 / 3) * PI * raio * raio * raio;
		System.out.printf("Volume: %.2f", volume);

		System.out.println();
		System.out.println("------------");
		System.out.println("Exercicio 8:");
		System.out.println("Informe o valor da hora de trabalho: R$ ");
		double valorhoratrabalho = keyboard.nextDouble();
		System.out.println("Informe o valor dos numeros de horas: ");
		int horastrabalhadas = keyboard.nextInt();
		double salariototal = (double) valorhoratrabalho * horastrabalhadas;
		System.out.printf("Salario total R$ %.2f", salariototal);

		System.out.println();
		System.out.println("------------");
		System.out.println("Exercicio 9:");
		System.out.println("Informe o valor da compra: R$ ");
		double valorcompra = keyboard.nextDouble();
		System.out.println("Informe o valor pago: R$ ");
		double valorpago = keyboard.nextDouble();
		double troco = valorpago - valorcompra;
		System.out.printf("Seu troco R$ %.2f", troco);

		System.out.println();
		System.out.println("------------");
		System.out.println("Exercicio 10:");
		System.out.printf("Informe o seu peso: ");
		double pesovalor = keyboard.nextDouble();
		System.out.printf("Informe a sua altura:");
		double alturavalor = keyboard.nextDouble();
		double imc = pesovalor / (alturavalor * alturavalor);

		if (imc >= 17.0 && imc <= 18.49) {
			System.out.printf("Seu IMC: %.2f e esta abaixo do peso.", imc);
		} if (imc >= 18.50 && imc <= 24.99) {
			System.out.printf("Seu IMC: %.2f normal.", imc);
		} if(imc >= 25.00 && imc <= 29.90) {
			System.out.printf("Seu IMC: %.2f e esta acima do peso.", imc);
		}

		keyboard.close();

	}

}
