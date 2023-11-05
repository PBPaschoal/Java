// Dia 05/11/2023 às 00:02hrs
// Utilizando IntelliJ IDEA
// Exercício criando pela IA ChatGPT, aonde ela informa o enunciado e eu desenvolvo o programa. Sem pedir/copiar resultado.
// Exercício 3: Verificar Número Par ou Ímpar
// Crie um programa que peça ao usuário para inserir um número e, em seguida, determine se o número é par ou ímpar. Exiba uma mensagem correspondente.

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int numero = keyboard.nextInt();

        if(numero % 2 == 0){
            System.out.print(numero + " EH PAR!");
        } else {
            System.out.print(numero + " EH IMPAR!");
        }

        keyboard.close();
    }
}
