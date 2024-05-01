package praticando;
import java.util.Locale;
import java.util.Scanner;

public class Relembrar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		int pais;
		double divisao, multiplicacao;
		double soma = 0.0;
		double valores = 0.0;
		System.out.print("Quantos valores deseja informar? ");
		int quantasVezes = keyboard.nextInt();
		for(int i = 0; i < quantasVezes; i++) {
			System.out.print("Informe o " + (i + 1) + "º valor: ");
			valores = keyboard.nextDouble();
			soma += valores;
		}
		
		if(soma >= 100.0) {
			System.out.println("Parabens! Voce ganhou R$" + String.format("%.2f", soma));
		} else {
			System.out.println("Voce nao ganhou o premio.");
		}
		
		do {
			System.out.println("De qual pais voce eh? ");
			System.out.println("[1 - BRASIL] [2 - EUA] [3 - PORTUGAL] [4 - INGLATERRA] [5 - JAPAO]");
			System.out.print("Escolha uma opcao: ");
			pais = keyboard.nextInt();
			switch(pais) {
			case 1:
				System.out.println("\nBRASIL! Pais lindo! Pais rico!");
				break;
			case 2:
				System.out.println("\nEUA! Considerada a maior potencia do mundo!");
				break;
			case 3:
				System.out.println("\nPORTUGAL! O pais da produção de vinhos e azeites");
				break;
			case 4:
				System.out.println("\nINGLATERRA! Eh grande a lista de artistas que alcançaram um estrondoso sucesso mundial e tem origem na Inglaterra");
				break;
			case 5:
				System.out.println("\nJAPAO! Terra do sol nascente! Pais da educacao, respeito e apaixonante!");
				break;
			default:
					System.out.println("Opcao invalida!");
					System.out.println();
					break;
			}
		} while (pais >= 6);
		
		
		
		keyboard.close();
	}

}
