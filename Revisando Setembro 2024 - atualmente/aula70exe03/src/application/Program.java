package application;

import java.util.Locale;
import java.util.Scanner;

import student.Student;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		Student student = new Student();
		
		student.nome = keyboard.nextLine();
		student.note1 = keyboard.nextDouble();
		student.note2 = keyboard.nextDouble();
		student.note3 = keyboard.nextDouble();
		
		student.result();
		
		keyboard.close();
	}

}
