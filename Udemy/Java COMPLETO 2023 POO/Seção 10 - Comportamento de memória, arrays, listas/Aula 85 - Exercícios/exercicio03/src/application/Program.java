// Problema "alturas"
// Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
// tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
// bem como os nomes dessas pessoas caso houver.
// Exemplo:
// Quantas pessoas serao digitadas? 5
// 
// Dados da 1a pessoa:
// Nome: Joao
// Idade: 15
// Altura: 1.82
// Dados da 2a pessoa:
// Nome: Maria
// Idade: 16
// Altura: 1.60
// Dados da 3a pessoa:
// Nome: Teresa
// Idade: 14
// Altura: 1.58
// Dados da 4a pessoa:
// Nome: Carlos
// Idade: 21
// Altura: 1.65
// Dados da 5a pessoa:
// Nome: Paulo
// Idade: 17
// Altura: 1.78
// Altura média: 1.69
// Pessoas com menos de 16 anos: 40.0%
// Joao
// Teresa

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;
import util.Estatisticas;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int N = keyboard.nextInt();

        Pessoa[] vetor = new Pessoa[N];

        for (int i = 0; i < N; i++) {
            keyboard.nextLine();
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            String nome = keyboard.nextLine();
            System.out.print("Idade: ");
            int idade = keyboard.nextInt();
            System.out.print("Altura: ");
            double altura = keyboard.nextDouble();
            vetor[i] = new Pessoa(nome, idade, altura);
        }

        Estatisticas estatisticas = new Estatisticas(vetor);
        estatisticas.mostrarEstatisticas();

        keyboard.close();
    }
}
