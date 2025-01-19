package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (ehFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean ehFibonacci(int numero) {
        if (numero == 0 || numero == 1) {
            return true; 
        }

        int anterior = 0, atual = 1;

        while (atual <= numero) {
            if (atual == numero) {
                return true; // 
            }

            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        return false; // O número não foii encontrado na sequência
    }
}