package entrada_de_dados_aula_vinte_e_cinco;
import java.util.Scanner;
import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String a, e;
		int b, f;
		double c, g; 
		char d;
		
		System.out.print("Digite uma String: ");
		a = sc.next();
		System.out.println("Voce digitou: " + a);
		
		System.out.print("\nDigite um numero int: ");
		b = sc.nextInt();
		System.out.println("Voce digitou: " + b);
		
		System.out.print("\nDigite um numero double: ");
		c = sc.nextDouble();
		System.out.println("Voce digitou: " + c);
		
		System.out.print("\nDigite qualquer coisa: ");
		d = sc.next().charAt(0);
		System.out.println("Voce digitou: " + d);
		
		System.out.print("Digite uma String; int e double na mesma linha: ");
		e = sc.next();
		f = sc.nextInt();
		g = sc.nextDouble();
		System.out.println(("\nDados digitados: "));
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
		sc.close();
		
	}

}
