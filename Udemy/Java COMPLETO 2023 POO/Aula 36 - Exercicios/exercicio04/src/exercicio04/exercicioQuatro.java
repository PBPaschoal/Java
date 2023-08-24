// Aula 36
// Exercicio 04
// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
// Exemplos:
// Entrada: Saída:
// 16 2 O JOGO DUROU 10 HORA(S)
// Entrada: Saída:
// 0 0 O JOGO DUROU 24 HORA(S)

package exercicio04;
import java.util.Scanner;

public class exercicioQuatro {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int startTime = keyboard.nextInt();
		int endTime = keyboard.nextInt();
		
		int duration;
		if (startTime < endTime) {
			duration = endTime - startTime;
		}
		else {
			duration = 24 - startTime + endTime;
		}
		
		System.out.println("GAME LAST " + duration + " HOUR(S)");
		
		keyboard.close();

	}

}
