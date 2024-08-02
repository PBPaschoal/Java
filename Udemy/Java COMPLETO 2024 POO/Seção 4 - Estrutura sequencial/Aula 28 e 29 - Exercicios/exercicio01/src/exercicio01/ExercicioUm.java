// Aula 28 e 29
// Exercicio 01
// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
// mensagem explicativa, conforme exemplos.
// Exemplos:
// Entrada: Saída:
// 10
// 30
// SOMA = 40

package exercicio01;
import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int primeiroValor, segundoValor;
		
		primeiroValor = teclado.nextInt();
		segundoValor = teclado.nextInt();
		
		int soma = primeiroValor + segundoValor;
		
		System.out.println("SOMA = " + soma);

	}

}
