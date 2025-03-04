//Aula 94 Desafio sobre vetores (pensionato)
//Exercício de fixação
//A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados pelos números 0 e 9.
//Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N representando o número de 
//estudantes que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para cada 
//registro de aluguel, informar o nome e email do estudante, bem como qual dos quartos ele escolheu (de 0 a 9). 
//Suponha que seja escolhido um quarto vago. Ao final, seu programa deve imprimir um relatório de todas ocupações do pensionato, 
//por ordem de quarto, conforme exemplo.
//How many rooms will be rented? 3
//Rent #1
//Name: Maria Green
//Email: maria@gmail.com
//Room: 5
//Rent #2
//Name: Marco Antonio
//Email: marco@gmail.com
//Room: 1
//Rent #3
//Name: Alex Brown
//Email: alex@gmail.com
//Room: 8
//Busy rooms:
//1: Marco Antonio, marco@gmail.com
//5: Maria Green, maria@gmail.com
//8: Alex Brown, alex@gmail.com

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = keyboard.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			keyboard.nextLine();
			String name = keyboard.nextLine();
			System.out.print("Email: ");
			String email = keyboard.next();
			System.out.print("Room: ");
			int roomNumber = keyboard.nextInt();
			
			vect[roomNumber] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for(int i = 0; i < 10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		keyboard.close();
	}

}
