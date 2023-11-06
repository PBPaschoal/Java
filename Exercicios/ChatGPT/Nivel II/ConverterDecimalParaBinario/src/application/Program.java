// Dia 06/11/2023 às 08:50hrs
// Utilizando Eclipse IDE
// Exercício criando pela IA ChatGPT, aonde ela informa o enunciado e eu desenvolvo o programa. 
// Exercício 20: Converter Decimal para Binário
// Desenvolva um programa que solicite ao usuário um número decimal e converta-o para sua 
// representação em binário. 
// Tive que buscar ajuda na internet.

package application;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		int numero = keyboard.nextInt();
		
		int[] digitosBinarios = new int[32];

        int indice = 0;
        while (numero > 0) {
            digitosBinarios[indice] = numero % 2;
            numero /= 2;
            indice++;
        }

        System.out.print("Representação binária: ");
        for (int i = indice - 1; i >= 0; i--) {
            System.out.print(digitosBinarios[i]);
        }

        System.out.println();

        keyboard.close();
    }
}
