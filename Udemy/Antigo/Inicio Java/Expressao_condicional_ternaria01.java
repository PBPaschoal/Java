//Expressão condicional ternária
//Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma condição.
//Sintaxe:
//( condição ) ? valor_se_verdadeiro : valor_se_falso
//Exemplos:
//( 2 > 4 ) ? 50 : 80        ----> 80
//( 10 != 3 ) ? "Maria" : "Alex"          ----> "Maria"

import java.util.Scanner;

public class Expressao_condicional_ternaria01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
		teclado.close();

	}

}
