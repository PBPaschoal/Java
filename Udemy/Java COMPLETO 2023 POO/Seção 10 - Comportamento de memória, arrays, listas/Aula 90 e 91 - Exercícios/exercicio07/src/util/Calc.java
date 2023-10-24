package util;

import java.util.Scanner;

public class Calc {

	private double numeroReal[];
	private double media;

	public Calc(double[] numeroReal) {
		this.numeroReal = numeroReal;
	}
	
	public void MeusValoresReais(int N, Scanner keyboard) {
		for(int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			numeroReal[i] = keyboard.nextDouble();
		}
	}
	
	public void MediaDosVetores() {
	    media = 0.0;
	    for (int i = 0; i < numeroReal.length; i++) {
	        media += numeroReal[i];
	    }
	    media /= numeroReal.length; // Calcule a média dividindo pelo número de elementos
	    System.out.printf("MEDIA DO VETOR = %.3f%n", media);
	}
	
	public void AbaixoDaMedia() {
	    System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
	    for (int i = 0; i < numeroReal.length; i++) {
	        if (numeroReal[i] < media) {
	            System.out.printf("%.1f%n", numeroReal[i]);
	        }
	    }
	}
	
}
