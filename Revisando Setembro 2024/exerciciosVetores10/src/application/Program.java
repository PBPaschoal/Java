package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int quantidadeAlunos = keyboard.nextInt();
		
		String[] nomeAluno = new String[quantidadeAlunos];
		double[] primeiraNota = new double[quantidadeAlunos];
		double[] segundaNota = new double[quantidadeAlunos];
		
		for(int i = 0; i < primeiraNota.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
			keyboard.nextLine();
			nomeAluno[i] = keyboard.nextLine();
			primeiraNota[i] = keyboard.nextDouble();
			segundaNota[i] = keyboard.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		double media = 0.0;
		for(int i = 0; i < primeiraNota.length; i++) {
			media = (primeiraNota[i] + segundaNota[i]) / 2.0;
			if(media >= 6.0) {
				System.out.println(nomeAluno[i]);
			}
		}
		
		keyboard.close();
	}

}
