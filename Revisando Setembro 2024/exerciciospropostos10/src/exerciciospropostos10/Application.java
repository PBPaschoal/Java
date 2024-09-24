//Exercícios propostos estrutura condicional - 04

package exerciciospropostos10;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode\n"
				+ "começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.");
		int horaInicial = keyboard.nextInt();
        int horaFinal = keyboard.nextInt();

        int duracao;
        if (horaFinal > horaInicial) {
            duracao = horaFinal - horaInicial;
        } else if (horaFinal < horaInicial) {
            duracao = (24 - horaInicial) + horaFinal;
        } else {
            duracao = 24; // caso onde horaInicial == horaFinal
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		keyboard.close();
	}

}
