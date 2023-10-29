/*
 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa 
 *	que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número de homens. 
 *	Exemplo: 
 *	Quantas pessoas serao digitadas? 5 
 *	Altura da 1a pessoa: 1.70 
 *	Genero da 1a pessoa: F 
 *	Altura da 2a pessoa: 1.83   
 *	Genero da 2a pessoa: M 
 *	Altura da 3a pessoa: 1.54   
 *	Genero da 3a pessoa: M 
 *	Altura da 4a pessoa: 1.61   
 *	Genero da 4a pessoa: F 
 *	Altura da 5a pessoa: 1.75   
 *	Genero da 5a pessoa: F 
 *	Menor altura = 1.54 
 *	Maior altura = 1.83 
 *	Media das alturas das mulheres = 1.69 
 *	Numero de homens = 2
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		int N, qtdhomens, qtdmulheres;
	    double menoraltura, maioraltura, alturafemMedia, alturafemtotal;

	    System.out.print("Quantas pessoas serao digitadas? ");
	    N = keyboard.nextInt();

	    double[] alturas = new double[N];
	    char[] generos = new char[N];

	    for (int i = 0; i< alturas.length; i++) {
	    	System.out.printf("Altura da %da pessoa: ", i + 1);
	        alturas[i] = keyboard.nextDouble();
	        System.out.printf("Genero da %da pessoa: ", i + 1);
	        generos[i] = keyboard.next().charAt(0);
	    }

	    menoraltura = alturas[0];
	    maioraltura = alturas[0];

	    for (int i = 1; i < alturas.length; i++) {
	        if (alturas[i] > maioraltura) {
	            maioraltura = alturas[i];
	        }
	        if (alturas[i] < menoraltura) {
	            menoraltura = alturas[i];
	        }
	    }

		qtdhomens = 0;
		qtdmulheres = 0;
		alturafemtotal = 0;
	    for (int i = 0; i < alturas.length; i++) {
	        if (generos[i] == 'M') {
	            qtdhomens++;
	        }
	        else {
	            qtdmulheres++;
	            alturafemtotal = alturafemtotal + alturas[i];
	        }
	    }

	    alturafemMedia = alturafemtotal / qtdmulheres;

	    System.out.printf("Menor altura = %.2f\n", menoraltura);
	    System.out.printf("Maior altura = %.2f\n", maioraltura);
	    System.out.printf("Media das alturas das mulheres = %.2f\n", alturafemMedia);
	    System.out.printf("Numero de homens = %d\n", qtdhomens);

	    keyboard.close();
	}
}