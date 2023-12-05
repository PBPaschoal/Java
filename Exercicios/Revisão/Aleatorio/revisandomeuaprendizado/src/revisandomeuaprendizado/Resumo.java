package revisandomeuaprendizado;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Resumo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Informe um numero: ");
		int A = keyboard.nextInt();
		System.out.print("Informe outro numero: ");
		int B = keyboard.nextInt();

		int soma = A + B;
		int subtracao = A - B;
		int multiplicacao = A * B;
		int divisao = A / B;
		int resto = A % B;
		int dia = 0;

		System.out.println(A + " + " + B + " = " + soma);
		System.out.println(A + " - " + B + " = " + subtracao);
		System.out.println(A + " * " + B + " = " + multiplicacao);
		System.out.println(A + " / " + B + " = " + divisao);
		System.out.println(A + " % " + B + " = " + resto);

		System.out.println("----------------");
		if (A < B) {
			System.out.println("A eh < que B");
		} else {
			System.out.println("A eh > que B");
		}

		System.out.println("----------------");
		System.out.println(
				" 1 = Domingo - 2 = Segunda-feira - 3 = Terça-feira - 4 = Quarta-feira - 5 = Quinta-feira - 6 = Sexta-feira - 7 = Sabado");

		do {
			System.out.println("Que dia eh hoje?");
			dia = keyboard.nextInt();
			switch (dia) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-feira");
				break;
			case 3:
				System.out.println("Terça-feira");
				break;
			case 4:
				System.out.println("Quarta-feira");
				break;
			case 5:
				System.out.println("Quinta-feira");
				break;
			case 6:
				System.out.println("Sexta-feira");
				break;
			case 7:
				System.out.println("Sabado");
				break;
			default:
				System.out.println("Invalido");
				break;
			}

		} while (dia > 7);

		System.out.println("----------------");
		System.out.println("Vamos fazer a tabuada de quais valores?");
		System.out.print("Primeiro valor: ");
		int primeiroValor = keyboard.nextInt();
		keyboard.nextLine();
		System.out.print("Segundo valor: ");
		int segundoValor = keyboard.nextInt();
		keyboard.nextLine();

		for (int i = 0; i <= 10; i++) {
			System.out.println(primeiroValor + " x " + i + " = " + primeiroValor * i);
		}
		System.out.println("----------------");
		for (int i = 0; i <= 10; i++) {
			System.out.println(segundoValor + " x " + i + " = " + segundoValor * i);
		}

		System.out.println("----------------");
		System.out.println("Vamos contar ate quanto?");
		int contador = keyboard.nextInt();
		int contando = 0;
		while (contando <= contador) {
			System.out.println(contando);
			contando++;
		}
		
		System.out.println("----------------");
		System.out.print("Informe o nome do produto: ");
		keyboard.nextLine();
		String name = keyboard.nextLine();
		System.out.print("Informe o preco do produto: R$ ");
		double price = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.print("Informe a quantidade do produto: ");
		int quantity = keyboard.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println("----------------");
		System.out.println("Voce tem " + product);
		
		

		keyboard.close();

	}

}
