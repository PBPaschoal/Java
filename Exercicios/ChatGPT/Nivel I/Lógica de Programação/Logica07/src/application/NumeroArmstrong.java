/* Verificação de Números Armstrong
 * Um número de Armstrong (também conhecido como número de Narcisista ou número de pleno poder) é um número que é igual à soma de seus 
 * próprios dígitos elevados a uma potência específica. Por exemplo, 153 é um número de Armstrong, pois 1³ + 5³ + 3³ = 153.
 * Escreva um programa em Java que solicita ao usuário para inserir um número e verifica se é um número de Armstrong.
 */


package application;

import java.util.Scanner;

public class NumeroArmstrong {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (verificarArmstrong(numero)) {
            System.out.println(numero + " é um número de Armstrong!");
        } else {
            System.out.println(numero + " não é um número de Armstrong.");
        }

        scanner.close();
    }

    private static boolean verificarArmstrong(int numero) {
        int numOriginal = numero;
        int comprimento = contarDigitos(numero);
        int soma = 0;

        while (numero > 0) {
            int digito = numero % 10;
            soma += Math.pow(digito, comprimento);
            numero /= 10;
        }

        return soma == numOriginal;
    }

    private static int contarDigitos(int numero) {
        int count = 0;
        while (numero > 0) {
            numero /= 10;
            count++;
        }
        return count;
    }

}
