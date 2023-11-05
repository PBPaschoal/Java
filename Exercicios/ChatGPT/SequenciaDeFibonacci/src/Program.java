// Dia 05/11/2023 às 02:12hrs
// Utilizando IntelliJ IDEA
// Exercício criando pela IA ChatGPT, aonde ela informa o enunciado e eu desenvolvo o programa. Sem pedir/copiar resultado.
// Exercício 10: Sequência de Fibonacci
// Desenvolva um programa que peça ao usuário um número inteiro e gere os primeiros "n" termos da sequência de Fibonacci,
// onde "n" é o número fornecido pelo usuário. A sequência de Fibonacci começa com 0 e 1, e os termos subsequentes são
// a soma dos dois termos anteriores.

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numeroInteiro = keyboard.nextInt();

        int primeiroTermo = 0;
        int segundoTermo = 1;

        System.out.print("Sequência de Fibonacci com " + numeroInteiro + " termos: ");

        for (int i = 0; i < numeroInteiro; i++) {
            if (i == 0) {
                System.out.print(primeiroTermo + " ");
            } else if (i == 1) {
                System.out.print(segundoTermo + " ");
            } else {
                int proximoTermo = primeiroTermo + segundoTermo;
                System.out.print(proximoTermo + " ");
                primeiroTermo = segundoTermo;
                segundoTermo = proximoTermo;
            }
        }

        keyboard.close();
    }
}
