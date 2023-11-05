// Dia 04/11/2023 às 23:47hrs
// Utilizando IntelliJ IDEA
// Exercício criando pela IA ChatGPT, aonde ela informa o enunciado e eu desenvolvo o programa. Sem pedir/copiar resultado.
// Exercício 2: Desenvolva uma calculadora simples que permita ao usuário escolher uma operação (adição, subtração, multiplicação ou divisão) e, em seguida, insira dois números para realizar a operação escolhida.

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);

        double resultado = 0.0;

        System.out.println("Escolha o tipo de operacao:");
        System.out.println("1) + SOMA");
        System.out.println("2) - SUBTRACAO");
        System.out.println("3) * MULTIPLICACAO");
        System.out.println("4) / DIVISAO\n");
        int operacao = keyboard.nextInt();

        System.out.print("Informe o primeiro valor: ");
        double primeiroValor = keyboard.nextDouble();
        System.out.print("Informe o segundo valor: ");
        double segundoValor = keyboard.nextDouble();

        switch (operacao){
            case 1:
                resultado = primeiroValor + segundoValor;
                break;
            case 2:
                resultado = primeiroValor - segundoValor;
                break;
            case 3:
                resultado = primeiroValor * segundoValor;
                break;
            default:
                resultado = primeiroValor / segundoValor;
                break;
        }

        System.out.printf("RESULTADO = %.2f", resultado);

        keyboard.close();
    }
}
