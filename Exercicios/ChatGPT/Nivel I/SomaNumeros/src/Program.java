// Dia 04/11/2023 às 23:44hrs
// Utilizando IntelliJ IDEA
// Exercício criando pela IA ChatGPT, aonde ela informa o enunciado e eu desenvolvo o programa. Sem pedir/copiar resultado.
// Exercício 1: Soma de Dois Números
// Crie um programa que solicite ao usuário que insira dois números e, em seguida, exiba a soma desses números.

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        double entradaPrimeiroValor = keyboard.nextDouble();
        System.out.print("Informe o segundo valor: ");
        double entradaSegundoValor = keyboard.nextDouble();

        double resultado = entradaPrimeiroValor + entradaSegundoValor;

        System.out.printf(entradaPrimeiroValor + " + " + entradaSegundoValor + " = " + resultado);

        keyboard.close();
    }
}
