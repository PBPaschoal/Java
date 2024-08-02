// Aula 28 e 29
// Exercicio 05
// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
// Exemplos:
// Entrada: Saída:
// 12 1 5.30
// 16 2 5.10
// VALOR A PAGAR: R$ 15.50
// Variaveis:
// primeiraPeca = firstPiece
// primeiraQuantidadeDePecas = firstQuantityOfParts
// primeiroValorDeCadaPeca = firstValueOfEachPiece
// segundaPeca = secondPiece
// segundaQuantidadeDePecas = secondPieceQuantity
// segundoValorDeCadapeca = secondValueOfEachPiece
// totalParaPagar = totalToPay

package exercicio05;
import java.util.Locale;
import java.util.Scanner;

public class exercicioCinco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner keyboard = new Scanner(System.in);
		
		int firstPiece = keyboard.nextInt();
		int firstQuantityOfParts = keyboard.nextInt();
		double firstValueOfEachPiece = keyboard.nextDouble();
		int secondPiece = keyboard.nextInt();
		int secondPieceQuantity = keyboard.nextInt();
		double secondValueOfEachPiece = keyboard.nextDouble();
		
		double totalToPay = (firstQuantityOfParts * firstValueOfEachPiece) + (secondPieceQuantity * secondValueOfEachPiece);
		
		System.out.printf("AMOUNT PAYABLE: $ %.2f%n", totalToPay);
		
		
		keyboard.close();

	}

}
