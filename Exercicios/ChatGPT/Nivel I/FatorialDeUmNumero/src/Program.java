// Dia 05/11/2023 às 01:37hrs
// Utilizando IntelliJ IDEA
// Exercício criando pela IA ChatGPT, aonde ela informa o enunciado e eu desenvolvo o programa. Sem pedir/copiar resultado.
// Exercício 6: Fatorial de um Número
// Escreva um programa que solicite ao usuário um número inteiro e calcule o fatorial desse número. O fatorial de um número é
// o produto de todos os inteiros positivos de 1 até o número inserido.

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner keyboard= new Scanner(System.in);

        int fatorial = 1;

        System.out.print("Informe um numero inteiro: ");
        int numeroInteiro = keyboard.nextInt();

        for(int i = 1; i <= numeroInteiro; i++){
            fatorial = fatorial * i;
        }

        System.out.print("O Fatorial de " + numeroInteiro + " eh a = " + fatorial);

        keyboard.close();
    }
}
