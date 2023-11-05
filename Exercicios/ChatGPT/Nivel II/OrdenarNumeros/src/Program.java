// Dia 05/11/2023 às 02:12hrs
// Utilizando IntelliJ IDEA
// Exercício criando pela IA ChatGPT, aonde ela informa o enunciado e eu desenvolvo o programa. Sem pedir/copiar resultado.
// Exercício 18: Ordenar Números
// Escreva um programa que permita ao usuário inserir uma lista de números e, em seguida, ordene e exiba esses números em ordem crescente.

import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Quantos numeros deseja digitar? ");
        int numeros = keyboard.nextInt();

        for(int i = 0; i < numeros; i++){
            System.out.print("Digite o " + (i + 1) + "a valor: ");
            numeros = keyboard.nextInt();
            System.out.println(i);
        }

        keyboard.close();
    }
}
