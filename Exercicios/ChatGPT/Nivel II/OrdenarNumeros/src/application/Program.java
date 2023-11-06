// Dia 06/11/2023 às 08:23hrs
// Utilizando Eclipse IDE
// Exercício criando pela IA ChatGPT, aonde ela informa o enunciado e eu desenvolvo o programa. 
// Sem pedir/copiar resultado.
// Exercício 18: Ordenar Números
// Escreva um programa que permita ao usuário inserir uma lista de números e, em seguida, ordene 
// e exiba esses números em ordem crescente.

package application;

import java.util.Scanner;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Quantos números deseja digitar? ");
        int quantidade = keyboard.nextInt();

        int[] numeros = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = keyboard.nextInt();
        }

        
        Arrays.sort(numeros);

        System.out.println("Números em ordem crescente: ");
        for (int i = 0; i < quantidade; i++) {
            System.out.print(numeros[i] + ", ");
        }

        keyboard.close();
    }
}

