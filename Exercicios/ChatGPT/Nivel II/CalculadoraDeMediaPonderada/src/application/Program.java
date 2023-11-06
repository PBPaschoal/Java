// Dia 06/11/2023 às 08:50hrs
// Utilizando Eclipse IDE
// Exercício criando pela IA ChatGPT, aonde ela informa o enunciado e eu desenvolvo o programa. 
// Sem pedir/copiar resultado.
// Exercício 19: Calculadora de Média Ponderada
// Crie uma calculadora de média ponderada que peça ao usuário para inserir um conjunto de notas 
// e pesos correspondentes, e depois calcule a média ponderada.

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Quantas notas e pesos deseja inserir? ");
        int quantidade = keyboard.nextInt();

        double somaNotas = 0.0;
        double somaPesos = 0.0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = keyboard.nextDouble();

            System.out.print("Digite o peso para a nota " + i + ": ");
            double peso = keyboard.nextDouble();

            somaNotas += nota * peso;
            somaPesos += peso;
        }

        if (somaPesos == 0.0) {
            System.out.println("Não é possível calcular a média ponderada, pois a soma dos pesos é zero.");
        } else {
            double mediaPonderada = somaNotas / somaPesos;
            System.out.printf("A média ponderada é: %.2f", mediaPonderada);
        }
		
		keyboard.close();
		
	}

}
