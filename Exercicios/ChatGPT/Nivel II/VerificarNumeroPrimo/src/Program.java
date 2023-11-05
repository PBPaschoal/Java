// Dia 05/11/2023 às 12:27hrs
// Utilizando IntelliJ IDEA
// Exercício criando pela IA ChatGPT, aonde ela informa o enunciado e eu desenvolvo o programa. Sem pedir/copiar resultado.
// Exercício 11: Verificar Número Primo
// Escreva um programa que solicite ao usuário um número inteiro e determine se o número é primo ou não. Um número primo é
// aquele que é divisível apenas por 1 e por ele mesmo.

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = keyboard.nextInt();

        boolean ehPrimo = true; // Assumimos que o número é primo inicialmente

        if (numero <= 1) {
            ehPrimo = false; // Números menores ou iguais a 1 não são primos
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false; // O número é divisível por um valor diferente de 1 e ele mesmo.
                }
            }
        }

        if (ehPrimo) {
            System.out.println("Número primo.");
        } else {
            System.out.println("Não é um número primo.");
        }

        keyboard.close();
    }
}


