// Dia 05/11/2023 às 14:35hrs
// Utilizando IntelliJ IDEA
// Exercício criando pela IA ChatGPT, aonde ela informa o enunciado e eu desenvolvo o programa. Sem pedir/copiar resultado.
// Exercício 17: Fatoração
// Desenvolva um programa que solicite ao usuário um número inteiro e encontre e exiba todos os fatores desse número.
// Por exemplo, para 12, os fatores são 1, 2, 3, 4, 6 e 12.

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int n = keyboard.nextInt();

        System.out.print("Fatores de " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

        keyboard.close();
    }
}
