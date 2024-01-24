/* Sistema de Notas
 * Crie um programa em Java para gerenciar notas de alunos. O programa deve permitir que o usuário insira as notas de vários alunos e, em seguida, calcule e exiba a média de cada aluno.
 * Requisitos:
 * Crie uma classe Aluno com atributos para o nome e as notas do aluno.
 * Utilize construtores para inicializar os dados do aluno.
 * Utilize métodos para calcular a média das notas.
 * Utilize arrays para armazenar os dados dos alunos. */

package application;

import java.util.Scanner;

public class Aluno {
	
	private String nome;
	private Double nota;
	
	public Aluno() {
	}
	
	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
	public String getNomeAluno() {
		return nome;
	}
	
	public void setNomeAluno(String aluno) {
		this.nome = aluno;
	}
	
	public Double getNotaAluno() {
		return nota;
	}
	
	public void setNotaAluno(Double nota) {
		this.nota = nota;
	}
	
	public static Aluno[] obterNotasDosAlunos(int quantidade) {
        Scanner keyboard = new Scanner(System.in);
        Aluno[] alunos = new Aluno[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            String nome = keyboard.nextLine();
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            double nota = keyboard.nextDouble();
            keyboard.nextLine(); 

            alunos[i] = new Aluno(nome, nota);
        }

        keyboard.close();
        return alunos;
    }

    public static void exibirMediasDosAlunos(Aluno[] alunos) {
        System.out.println("\nMédias dos Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + ": " + aluno.calcularMedia());
        }
    }

    public String getNome() {
        return nome;
    }

    public double calcularMedia() {
        return nota;
    }

}
