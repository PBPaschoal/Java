import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler as medidas da largura e comprimento de uma terreno retangular com uma casa decimal, bem como o valor
//do metro quadrado do terreno com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do terreno, bem como
//o valor do preço do terreno, ambos com duas casas decimais, conforme exemplo.
//Entrada:
//LARGURA: 10.0
//COMPRIMENTO: 30.0
//VALOR METRO: 200.00
//Saída:
//AREA = 300.00
//PRECO == 60000.00

public class Exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double largura = teclado.nextDouble();
		double comprimento = teclado.nextDouble();
		double metro_quadrado = teclado.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metro_quadrado; 
		
		System.out.println("Largura = " + largura); //Não é para apresentar na tela, mas resolvi colocar só para ver se está tudo certo.
		System.out.println("Comprimento = " + comprimento); //Não é para apresentar na tela, mas resolvi colocar só para ver se está tudo certo.
		System.out.printf("Valor do metro = R$ %.2f%n", metro_quadrado); //Não é para apresentar na tela, mas resolvi colocar só para ver se está tudo certo.
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PREÇO = R$ %.2f%n", preco);
		
		teclado.close();
	}

}
