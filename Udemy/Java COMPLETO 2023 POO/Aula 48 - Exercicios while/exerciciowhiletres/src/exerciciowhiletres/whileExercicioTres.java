// Aula 48
// Exercicio While 03
// Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
// um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
// 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
// que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
// mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
// exemplo.
// Exemplo:
// Entrada: Saída:
// 8
// 1
// 7
// 2
// 2
// 4
// MUITO OBRIGADO
// Alcool: 1
// Gasolina: 2
// Diesel: 0

package exerciciowhiletres;

import java.util.Scanner;

public class whileExercicioTres {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int dataInput = keyboard.nextInt();

		int alcohol = 0, gasoline = 0, diesel = 0;

		while (dataInput != 4) {
			switch (dataInput) {
			case 1:
				alcohol = alcohol + 1;
				break;
			case 2:
				gasoline = gasoline + 1;
				break;
			case 3:
				diesel = diesel + 1;
				break;
			}

			dataInput = keyboard.nextInt();
		}

		System.out.println("THANK YOU VERY MUCH\nAlcohol: " + alcohol + "\nGasoline: " + gasoline + "\nDiesel: " + diesel);

		keyboard.close();

	}

}
