package praticandoRevisando;
import java.util.Scanner;

public class Programm {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int voto;
		int deputado1 = 0;
		int deputado2 = 0;
		int totalVotos = 0;
		int votoOculto;
		do {
			System.out.println("Em quem voce vai votar?");
			System.out.println("[1]: Para o candidato 01");
			System.out.println("[2]: Para o candidato 02");
			voto = keyboard.nextInt();
			if(voto == 1) {
				deputado1++;
			} else if (voto == 2){
				deputado2++;
			}
			
			if (deputado2 == 5) {
				deputado1--;
				deputado2++;
			}
			totalVotos++;
		} while (totalVotos < 8);
		System.out.println("RESULTADO:");
		System.out.println("DEPUTADO 01: VOTOS = " + deputado1);
		System.out.println("DEPUTADO 02: VOTOS = " + deputado2);
		keyboard.close();
	}

}
