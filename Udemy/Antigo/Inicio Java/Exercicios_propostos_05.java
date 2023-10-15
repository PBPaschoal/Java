import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
//Exemplos
//Entrada:
//12 1 5.30
//16 2 5.10
//Saída:
//VALOR A PAGAR: R$ 15.50

public class Exercicios_propostos_05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		int cod01, quantidadePrimeira, cod02, quantidadeSegunda;
		double valorUnitario01, valorUnitario02, valorPagamento;

		/*
		 * System.out.println("Informe o código do primeiro produto:"); cod01 =
		 * teclado.nextInt();
		 * System.out.println("Informe a quantidade do primeiro produto:");
		 * quantidadePrimeira = teclado.nextInt();
		 * System.out.println("Informe o valor do primeiro produto: R$");
		 * valorUnitario01 = teclado.nextDouble();
		 * 
		 * System.out.println("Informe o código do segundo produto:"); cod02 =
		 * teclado.nextInt();
		 * System.out.println("Informe a quanbtidade do segundo produto:");
		 * quantidadeSegunda = teclado.nextInt();
		 * System.out.println("Informe o valor do segundo produto: R$"); valorUnitario02
		 * = teclado.nextDouble();
		 * 
		 * valorPagamento = (quantidadePrimeira * valorUnitario01) + (quantidadeSegunda
		 * * valorUnitario02);
		 * 
		 * System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPagamento);
		 */

		cod01 = teclado.nextInt();
		quantidadePrimeira = teclado.nextInt();
		valorUnitario01 = teclado.nextDouble();

		cod02 = teclado.nextInt();
		quantidadeSegunda = teclado.nextInt();
		valorUnitario02 = teclado.nextDouble();

		valorPagamento = (quantidadePrimeira * valorUnitario01) + (quantidadeSegunda * valorUnitario02);

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPagamento);

		teclado.close();
	}
}
