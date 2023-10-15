import java.util.Locale;
import java.util.Scanner;

public class entradadedados01 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		System.out.println("Digite seu nome: ");
		String nome;
		nome = sc.next();
		System.out.println("Digite a sua idade: ");
		int idade;
		idade = sc.nextInt();
		System.out.println("Qual é o seu peso? ");
		double peso;
		peso = sc.nextDouble(); //Para dar entrada com . e não , é necessário adicionar o Locale.setDefault(Locale.US) e import java.util.Scanner
		System.out.println("Qual é o seu sexo? ");
		char sexo;
		sexo = sc.next().charAt(0);
		
		System.out.println("De entrada com os seguintes tipos de dados na mesma linha: string int e double");
		x = sc.next(); //Para ler vários dados na mesma linha:
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("O seu nome é " + nome);
		System.out.println("E você tem " + idade + " anos.");
		System.out.println("O seu peso é " + peso); //Para imprimir com a virgula é necessário por printf e %.quantidade das casas decimaisf$n
		System.out.printf("Repetindo o peso com f: %.2f%n", peso);
		System.out.println("Sexo: " + sexo);
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}
}
