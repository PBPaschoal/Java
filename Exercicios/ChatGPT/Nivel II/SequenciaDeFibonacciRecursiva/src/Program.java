// Dia 05/11/2023 às 13:44hrs
// Utilizando IntelliJ IDEA
// Exercício criando pela IA ChatGPT, aonde ela informa o enunciado e eu desenvolvo o programa. Sem pedir/copiar resultado.
// Exercício 15: Sequência de Fibonacci Recursiva
// Modifique o exercício 10 para calcular os primeiros "n" termos da sequência de Fibonacci de forma recursiva.
// Fiz com ajuda da internet.

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numeroInteiro = keyboard.nextInt();

        System.out.print("Sequência de Fibonacci com " + numeroInteiro + " termos: ");
        for (int i = 0; i < numeroInteiro; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }

        keyboard.close();
    }

    // Usamos um array para armazenar os termos já calculados
    static int[] fibonacciArray = new int[100]; // Tamanho arbitrário para armazenar os termos

    // Função recursiva para calcular o termo da sequência de Fibonacci
    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            fibonacciArray[n] = n;
            return n;
        } else {
            if (fibonacciArray[n] != 0) {
                return fibonacciArray[n];
            }
            fibonacciArray[n] = calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
            return fibonacciArray[n];
        }
    }
}
