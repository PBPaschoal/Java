import java.util.Locale;

//Dia 15/09/2022
//Revisão básica

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		// %f = ponto flutuante
		// %d = inteiro
		// %s = texto
		// %n = quebra de linha
		
		System.out.print("Olá mundo!");
		System.out.println("Bom dia!");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f\n", x); //printF com "%.NumeroF" para limitar quantas casas decimais deseja. \n para pular linha.
		Locale.setDefault(Locale.US); //Para configurar, usando ponto ao inves de virgula (para isso é preciso usar o import java.util.Locale; no inicio).
		System.out.printf("%.4f\n", x);
		System.out.println("RESULTADO = " + x + " METROS"); //Concatenar vários elementos em um mesmo comando de escrita. OU:
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
	}

}
