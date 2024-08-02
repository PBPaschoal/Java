// Aula 49
// Estrutura repetitiva for
// Exemplo:
// Fazer um programa que lê um valor inteiro N e depois N números inteiros.
// Ao final, mostrar a soma dos N números lidos.
// Entrada:       Saída:
// 3              11
// 5
// 2
// 4

package estruturafor;
import java.util.Scanner;

public class estruturaRepetitivaFor {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int entryValue, result = 0;
		
		int HowManyTimes = keyboard.nextInt();
		for(int i = 1; i <= HowManyTimes; i++) {
			entryValue = keyboard.nextInt();
			result = result + entryValue;
		}
		
		System.out.println(result);
		
		keyboard.close();

	}

}
