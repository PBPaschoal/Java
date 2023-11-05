// Dia 05/11/2023 às 02:04hrs
// Utilizando IntelliJ IDEA
// Exercício criando pela IA ChatGPT, aonde ela informa o enunciado e eu desenvolvo o programa. Sem pedir/copiar resultado.
// Exercício 9: Tabuada
// Escreva um programa que solicite ao usuário um número e exiba a tabuada desse número, indo de 1 a 10.

import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int resultadoTabuada = 0;

        System.out.print("Informe um numero: ");
        int numero = keyboard.nextInt();

        for(int i = 1; i <= 10; i++){
            resultadoTabuada = numero * i;
            System.out.println(i + " x " + numero + " = " + resultadoTabuada);
        }

        keyboard.close();
    }
}
