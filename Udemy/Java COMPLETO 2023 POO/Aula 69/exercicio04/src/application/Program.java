// Aula 69
// Exercício 04
// 
// Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres 
// do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual 
// a nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em 
// caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota).
// Você deve criar uma classe Student para resolver este problema.
// 
// Exemplos:
// 
// Entrada:        Saída:
// Alex Green      FINAL GRADE = 90.00
// 27.00           PASS
// 31.00 
// 32.00
// 
// Entrada:        Saída:
// 17.00           FINAL GRADE = 52.00
// 20.00           FAILED
// 15.00           MISSING 8.00 POINTS

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Nome do aluno: ");
		student.aluno = keyboard.nextLine();
		
		do {
		//So para testar
		System.out.println("O primeiro trimestre vale 30.00");
		System.out.println("Insira uma nota menor ou igual a 30.00");
		student.notaPrimeiro = keyboard.nextDouble();
		} while(student.notaPrimeiro >= 30.01);
		
		do {
		//So para testar
		System.out.println("O segundo trimestre vale 35.00");
		System.out.println("Insira uma nota menor ou igual a 35.00");
		student.notaSegundo = keyboard.nextDouble();
		//So para testar
		} while(student.notaSegundo >= 35.01);
		
		do {
		System.out.println("O terceiro trimestre vale 35.00");
		System.out.println("Insira uma nota menor ou igual a 35.00");
		student.notaTerceiro = keyboard.nextDouble();
		} while(student.notaTerceiro >= 35.01);
		
		//Eu sei, o anunciado não pede para colocar essas mensagens, mas resolvi colocar apenas para melhor
		//entendimento na hora de testar.
		
		System.out.println();
		System.out.println("FINAL GRADE = " + student);
		
		keyboard.close();

	}

}
