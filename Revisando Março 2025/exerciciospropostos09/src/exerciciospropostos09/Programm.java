//Exercícios propostos estrutura condicional - 03

package exerciciospropostos09;

import java.util.Scanner;

public class Programm {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem \"Sao Multiplos\" ou \"Nao sao\n"
                + "Multiplos\", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em\n"
                + "ordem crescente ou decrescente.");
        System.out.println("ENTRADA:");
        int valor1 = keyboard.nextInt();
        int valor2 = keyboard.nextInt();
        
        System.out.println("SAÍDA:");
        // Verifica se valor1 é múltiplo de valor2 ou se valor2 é múltiplo de valor1
        if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        
        keyboard.close();
    }
}

