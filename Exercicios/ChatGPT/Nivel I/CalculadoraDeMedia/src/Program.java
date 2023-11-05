// Dia 05/11/2023 às 01:18hrs
// Utilizando IntelliJ IDEA
// Exercício criando pela IA ChatGPT, aonde ela informa o enunciado e eu desenvolvo o programa. Sem pedir/copiar resultado.
// Exercício 4: Calculadora de Média
// Desenvolva um programa que solicite ao usuário que insira três números e, em seguida, calcule a média desses números e a exiba.

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Informe três valores: ");
        double primeiroValor = keyboard.nextDouble();
        double segundoValor = keyboard.nextDouble();
        double terceiroValor = keyboard.nextDouble();

        double media = (primeiroValor + segundoValor + terceiroValor) / 3.0;

        System.out.printf("MEDIA = %.2f", media);

        keyboard.close();
    }
}
