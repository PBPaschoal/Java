package util;

import java.util.Scanner;

public class MeusVetores {
	private int[] vetorA;
	private int[] vetorB;
	private int[] vetorC;
	private Scanner keyboard;
	
	public MeusVetores(int N, Scanner keyboard) {
		vetorA = new int[N];
		vetorB = new int[N];
		vetorC = new int[N];
		this.keyboard = keyboard;
	}
	
	public void lerValoresA() {
		System.out.println("Digite os valores do vetor A: ");
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = keyboard.nextInt();
		}
	}
	
	public void lerValoresB() {
		System.out.println("Digite os valores do vetor B: ");
		for(int i = 0; i < vetorB.length; i++) {
			vetorB[i] = keyboard.nextInt();
		}
	}
	
	public void calcularVetorC() {
		for(int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}
	}
	
	public void mostrarVetorC() {
		System.out.println("VETOR RESULTANTE: ");
		for(int i = 0; i < vetorC.length; i++) {
			System.out.println(vetorC[i]);
		}
	}

}
