package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Order;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		int N = keyboard.nextInt();
		
		Order[] vetor = new Order[N];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = new Order();
			System.out.print("Digite um numero: ");
			int numero = keyboard.nextInt();
			vetor[i].setMaior(numero);
			
			if(numero < vetor[i].getMenor()) {
				vetor[i].setMenor(numero);
			}
		}
		
		int maior = vetor[0].getMaior(); 
		int menor = vetor[0].getMenor();
		
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i].getMaior() > maior) {
				maior = vetor[i].getMaior();
			} 
			if(vetor[i].getMenor() < menor) {
				menor = vetor[i].getMenor();
			}
		}

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
		
		keyboard.close();
	}

}
