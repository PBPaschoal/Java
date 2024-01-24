/* Sistema de Notas
 * Crie um programa em Java para gerenciar notas de alunos. O programa deve permitir que o usuário insira as notas de vários alunos e, em seguida, calcule e exiba a média de cada aluno.
 * Requisitos:
 * Use uma classe Aluno para representar cada aluno, com métodos para calcular a média das notas.
 * Utilize um construtor para inicializar os dados do aluno (nome, notas, etc.).
 * Implemente sobrecargas de métodos, permitindo diferentes formas de inserir as notas (pode aceitar uma quantidade variável de notas, por exemplo).
 * Utilize arrays para armazenar as notas de cada aluno.
 * Utilize uma matriz para armazenar os dados de vários alunos (nome e notas).
 * Implemente uma estrutura de repetição para permitir que o usuário insira os dados de vários alunos.
 * Implemente estruturas condicionais para tratar situações como notas inválidas. */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Quantos alunos deseja informar as notas? ");
        int quantidadeAlunos = keyboard.nextInt();

        Aluno[] alunos = Aluno.obterNotasDosAlunos(quantidadeAlunos);
        
        Aluno.exibirMediasDosAlunos(alunos);
		
		keyboard.close();
	}

}
