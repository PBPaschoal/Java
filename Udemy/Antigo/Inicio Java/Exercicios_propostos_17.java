//Exercícios estrutura while 03
//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//exemplo.
//Exemplo:
//Entrada:     Saída:
//8            MUITO OBRIGADO
//1            Alcool: 1
//7            Gasolina: 2
//2            Diesel: 0
//2
//4

import java.util.Scanner;

public class Exercicios_propostos_17 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int entrada = teclado.nextInt();

		int alcool = 0, gasolina = 0, diesel = 0;

		while (entrada != 4) {
			if (entrada == 1) {
				alcool += 1;
			} else if (entrada == 2) {
				gasolina += 1;
			} else if (entrada == 3) {
				diesel += 1;
			}
			entrada = teclado.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		teclado.close();
	}

}
