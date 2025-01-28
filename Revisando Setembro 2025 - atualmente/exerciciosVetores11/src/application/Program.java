//Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa 
//que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número de homens. 
//Exemplo: 
//Quantas pessoas serao digitadas? 5 
//Altura da 1a pessoa: 1.70 
//Genero da 1a pessoa: F 
//Altura da 2a pessoa: 1.83   
//Genero da 2a pessoa: M 
//Altura da 3a pessoa: 1.54   
//Genero da 3a pessoa: M 
//Altura da 4a pessoa: 1.61   
//Genero da 4a pessoa: F 
//Altura da 5a pessoa: 1.75   
//Genero da 5a pessoa: F 
//Menor altura = 1.54 
//Maior altura = 1.83 
//Media das alturas das mulheres = 1.69 
//Numero de homens = 2

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		int qtdHomens, qtdMulheres;
		double menorAltura, maiorAltura, alturaFemMedia, alturaFemTotal;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int quantidade = keyboard.nextInt();
		
		double[] alturas = new double[quantidade];
		char[] generos = new char[quantidade];
		
		for(int i = 0; i < quantidade; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			alturas[i] = keyboard.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			generos[i] = keyboard.next().charAt(0);
		}
		
		menorAltura = alturas[0];
		maiorAltura = alturas[0];
		
		for(int i = 1; i < quantidade; i++) {
			if(alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
			if(alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
		}
		
		qtdHomens = 0;
		qtdMulheres = 0;
		alturaFemTotal = 0;
		for(int i = 0; i < quantidade; i++) {
			if(generos[i] == 'M') {
				qtdHomens++;
			} else {
				qtdMulheres++;
				alturaFemTotal += alturas[i];
			}
		}
		
		alturaFemMedia = alturaFemTotal / qtdMulheres;
		
		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", alturaFemMedia);
		System.out.printf("Numero de homens = %d\n", qtdHomens);
		
		keyboard.close();
	}

}
