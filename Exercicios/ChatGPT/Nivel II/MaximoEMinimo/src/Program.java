// Dia 05/11/2023 às 13:49hrs
// Utilizando IntelliJ IDEA
// Exercício criando pela IA ChatGPT, aonde ela informa o enunciado e eu desenvolvo o programa. Sem pedir/copiar resultado.
// Exercício 16: Encontre o Máximo e o Mínimo
// Crie um programa que solicite ao usuário que insira uma série de números e, em seguida, encontre e exiba o valor máximo
// e o valor mínimo dentre esses números.


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numero = 0;

        System.out.print("Quantos números vão ser digitados? ");
        int n = keyboard.nextInt();

        if (n <= 0) {
            System.out.println("Nenhum número para verificar, pois N é menor ou igual a zero.");
            keyboard.close();
            return;
        }

        System.out.print("Informe o 1º número: ");
        numero = keyboard.nextInt();
        int maximo = numero;
        int minimo = numero;

        for (int i = 2; i <= n; i++) {
            System.out.print("Informe o " + i + "º número: ");
            numero = keyboard.nextInt();

            if (numero > maximo) {
                maximo = numero;
            }

            if (numero < minimo) {
                minimo = numero;
            }
        }

        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);

        keyboard.close();
    }
}
