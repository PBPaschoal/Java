//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver. 
//Exemplo:
//Quantas pessoas serao digitadas? 5
//Dados da 1a pessoa:
//Nome: Joao
//Idade: 15
//Altura: 1.82
//Dados da 2a pessoa:
//Nome: Maria
//Idade: 16
//Altura: 1.60
//Dados da 3a pessoa:
//Nome: Teresa
//Idade: 14
//Altura: 1.58
//Dados da 4a pessoa:
//Nome: Carlos
//Idade: 21
//Altura: 1.65
//Dados da 5a pessoa:
//Nome: Paulo
//Idade: 17
//Altura: 1.78
//Altura média: 1.69
//Pessoas com menos de 16 anos: 40.0%
//Joao
//Teresa 

package exerciciosVetores03;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = keyboard.nextInt();
		
		Dados[] dados = new Dados[n];
		
		for(int i = 0; i < dados.length; i++) {
			keyboard.nextLine();
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			String nome = keyboard.nextLine();
			System.out.print("Idade: ");
			int idade = keyboard.nextInt();
			System.out.print("Altura: ");
			double altura = keyboard.nextDouble();
			dados[i] = new Dados(nome, idade, altura);
		}
		
		double somaAltura = 0.0;
		for(int i = 0; i < dados.length; i++) {
			somaAltura += dados[i].getAltura();
		}
		double mediaAltura = somaAltura / n;
		
		System.out.printf("Altura média: %.2f%n", mediaAltura);
		
		int menoresDe16 = 0;
        String[] nomesMenores = new String[n]; 
        int contadorNomes = 0; 

        for (int i = 0; i < dados.length; i++) {
            if (dados[i].getIdade() < 16) {
                nomesMenores[contadorNomes] = dados[i].getNome();
                contadorNomes++;
                menoresDe16++;
            }
        }

        double porcentagemMenoresDe16 = ((double) menoresDe16 / n) * 100.0;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagemMenoresDe16);

        if (menoresDe16 > 0) {
            System.out.println("Nomes:");
            for (int i = 0; i < contadorNomes; i++) {
                System.out.println(nomesMenores[i]);
            }
        }
		keyboard.close();
	}

}
