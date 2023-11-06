// Aula 23 do curso: Java Completo POO
// Irei sempre escrever os textos em inglês para praticar a lingua e as vezes os comentarios também (mas por enquanto os comentarios eu irei escrever em Portugues.

import java.util.Locale;

public class saidaDeDados {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println(y);
		System.out.println(x);
		System.out.println("Good morning!");
		// Casas decimais:
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		// O printf utiliza virgula porque está no padrão do meu sistema operacional, no caso em Português.
		// Para utilizar ponto, precisamos usar o comando: Locale.setDefault(Locale.US); e a biblioteca: import java.util.Locale;
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x); // Com ponto.
		
		// Concatenar vários elementos em um mesmo comando de escrita:
		System.out.println("RESULT = " + x + " meters");
		// Agora utilizando o printf:
		System.out.printf("RESULT = %.2f meters", x);
		// Com vários:
		// Observação:
		// %f = ponto flutuante
		// %d = inteiro
		// %s = texto
		// %n = quebra de linha
		System.out.printf("\n%s is %d years and earn R$ %.2f real%n", nome, idade, renda); // Variaveis na mesma ordem dos marcadores
		
	}

}
