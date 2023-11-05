// Dia 05/11/2023 às 13:37hrs
// Utilizando IntelliJ IDEA
// Exercício criando pela IA ChatGPT, aonde ela informa o enunciado e eu desenvolvo o programa. Sem pedir/copiar resultado.
// Exercício 14: Contagem de Dígitos
// Escreva um programa que solicite ao usuário um número inteiro e conte e exiba a quantidade de dígitos nesse número.

import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int numeroInteiro = keyboard.nextInt();

        // Converte o número para uma string e conta os caracteres
        int quantidadeDigitos = String.valueOf(numeroInteiro).length();

        System.out.println("O número " + numeroInteiro + " possui " + quantidadeDigitos + " dígitos.");


        keyboard.close();
    }

}
