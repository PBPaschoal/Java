import java.util.Scanner;

//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplo.s
//Exemplos:
//Entrada:
//10
//30
//Saída:
//SOMA = 40
//Entrada:
//-30
//10
//Saída
//SOMA = -20

public class Exercicio_propostos_01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int primeiro_valor = teclado.nextInt();
		int segundo_valor = teclado.nextInt();
		
		int soma = primeiro_valor + segundo_valor;
		
		System.out.println("SOMA = " + soma);

		teclado.close();
	}

}
