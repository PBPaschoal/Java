// Aula 38 - Sintaxe switch - case
// Exemplo 01
// Problema:
// Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
// Escrever na tela o dia da semana correspondente, conforme exemplos.
// Entrada                        Saída
// 1                              Dia da semana: domingo
// Entrada                        Saída
// 4                              Dia da semana: quarta

package exemplo01;
import java.util.Scanner;

public class switchCaseUm {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int dayOfTheWeekInNumber = keyboard.nextInt();
		String day;
		
		switch(dayOfTheWeekInNumber) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "Saturday";
			break;
		default:
			day = "Invalid value";
			break;
		}
		
		System.out.println("Day of the week: " + day);
		
		keyboard.close();

	}

}
