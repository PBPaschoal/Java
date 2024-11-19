//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram 
//no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir 
//os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0 (seis). 
// 
//Exemplo: 
//Quantos alunos serao digitados? 4 
//Digite nome, primeira e segunda nota do 1o aluno: 
//Joao Silva   
//7.0   
//8.5 
//Digite nome, primeira e segunda nota do 2o aluno: 
//Maria Teixeira   
//9.2   
//6.5 
//Digite nome, primeira e segunda nota do 3o aluno: 
//Carlos Carvalho   
//5.0   
//6.0 
//Digite nome, primeira e segunda nota do 4o aluno: 
//Teresa Pires   
//5.5   
//6.5 
//Alunos aprovados: 
//Joao Silva 
//Maria Teixeira 
//Teresa Pires 

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
