import java.util.Locale;
import java.util.Scanner;

//Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos
//custa R$ 2.00. Fazer um programa para ler a quantidade de minuto que uma pessoa consumiu, daí mostrar o valor a ser pago.
//Entrada:         Saída:
//22               Valor a pagar: R$ 50.00
//Entrada:         Saída:
//103              Valor a pagar: R$ 56.00

public class Sintaxe_opcional01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double valor_pago = 50.00;
		
		int minutos = teclado.nextInt();
		
		if (minutos > 100) {
			valor_pago += (minutos - 100) * 2.0; //operador de atribuição cumulativa
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", valor_pago); 
		
		teclado.close();
	}
}
