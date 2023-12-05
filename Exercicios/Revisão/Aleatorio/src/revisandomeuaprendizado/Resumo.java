package revisandomeuaprendizado;

import java.util.Locale;
import java.util.Scanner;

public class Resumo {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Locale.setDefault(Locale.US);

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
				" 1 = Domingo\n 2 = Segunda-feira\n 3 = Terça-feira\n 4 = Quarta-feira\n 5 = Quinta-feira\n 6 = Sexta-feira\n 7 = Sabado");

		do {
			System.out.println("\nQue dia eh hoje?");
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
		System.out.print("Segundo valor: ");
		int segundoValor = keyboard.nextInt();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(primeiroValor + " x " + i + " = " + primeiroValor * i);
		}
		System.out.println("----------------");
		for(int i = 0; i <= 10; i++) {
			System.out.println(segundoValor + " x " + i + " = " + segundoValor * i);
		}
		
		
		
		keyboard.close();

	}

}
