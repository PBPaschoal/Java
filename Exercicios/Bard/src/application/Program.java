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
		int[] vetor = new int[N];
		
		System.out.println();
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = keyboard.nextInt();
		}
		
		Order order = new Order();
		
		int maior = vetor[0]; 
        int menor = vetor[0];
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
			} 
			if(vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		
		order.setMaior(maior);
        order.setMenor(menor);

        System.out.println("Maior: " + order.getMaior());
        System.out.println("Menor: " + order.getMenor());
		
		keyboard.close();
	}

}
