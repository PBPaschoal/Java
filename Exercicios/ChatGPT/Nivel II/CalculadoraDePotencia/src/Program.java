// Dia 05/11/2023 às 13:19hrs
// Utilizando IntelliJ IDEA
// Exercício criando pela IA ChatGPT, aonde ela informa o enunciado e eu desenvolvo o programa. Sem pedir/copiar resultado.
// Exercício 13: Calculadora de Potência
// Desenvolva uma calculadora de potência que permita ao usuário inserir um número base e um expoente e, em seguida,
// calcule e exiba o resultado da potenciação.

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Informe o valor da base: ");
        int base = keyboard.nextInt();
        System.out.print("Informe o valor do expoente: ");
        int expoente = keyboard.nextInt();

        int potenciacao = 1;

        for (int i = 0; i < expoente; i++) {
            potenciacao = potenciacao * base;
        }

        System.out.println("Resultado da potenciação: " + potenciacao);

        keyboard.close();
    }
}

