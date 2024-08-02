package util;

import java.util.Scanner;

public class EntradaDados {
	Scanner keyboard = new Scanner(System.in);

	private String vetorNome[];
	private double vetorNotas[];

	public EntradaDados(String[] vetornome, double[] notas) {
		vetorNome = vetornome;
		this.vetorNotas = notas;
	}

	public void getvetorNomeNotas() {
		for(int i = 0; i < vetorNome.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
	        vetorNome[i] = keyboard.nextLine();
	        double nota1 = keyboard.nextDouble();
            double nota2 = keyboard.nextDouble();
            vetorNotas[i] = (nota1 + nota2) / 2.0;
            keyboard.nextLine();
		}
	}
	

	public void getResultados() {
		System.out.println("Alunos aprovados:");
        for (int i = 0; i < vetorNotas.length; i++) {
            if (vetorNotas[i] >= 6.0) {
                System.out.println(vetorNome[i]);
            }
        }
	}
}
