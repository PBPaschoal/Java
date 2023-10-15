//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário.
//A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
//Exemplos:
//Entrada:
//25
//100
//5.50
//Saída:
//NUMBER = 25
//SALARY = U$ 550.00

import java.util.Locale;
import java.util.Scanner;

public class Exercicios_propostos_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int id_funcionario, horas_trabalhadas;
		double valor_hora, salario;
		
		System.out.println("Informe o ID do funcionario:"); //Não é necessário colocar, mas gosto de acrescentar em meus exercicios. OBS: Eu sei que devo seguir o que o projeto solicita.
		id_funcionario = teclado.nextInt();
		System.out.println("Informe as horas trabalhadas:"); //Não é necessário colocar, mas gosto de acrescentar em meus exercicios. OBS: Eu sei que devo seguir o que o projeto solicita.
		horas_trabalhadas = teclado.nextInt();
		System.out.println("Informe o valor da hora: U$"); //Não é necessário colocar, mas gosto de acrescentar em meus exercicios. OBS: Eu sei que devo seguir o que o projeto solicita.
		valor_hora = teclado.nextDouble(); 
		salario = horas_trabalhadas * valor_hora;
		
		System.out.println("NUMBER = " + id_funcionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		teclado.close();
	}
}
