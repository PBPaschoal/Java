//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
//Exemplos:
//Entrada:
//16 2
//Saída:
//O JOGO DUROU 10 HORA(S)
//Entrada:
//0 0
//Saída:
//O JOGO DUROU 24 HORA(S)

import java.util.Scanner;

public class Exercicios_propostos_10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int hora_inicio = teclado.nextInt();
		int hora_fim = teclado.nextInt();
		
		int duracao;
		if (hora_inicio < hora_fim) {
			duracao = hora_fim - hora_inicio;
		}
		
		else {
			duracao = 24 - hora_inicio + hora_fim;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		teclado.close();
	}
}
