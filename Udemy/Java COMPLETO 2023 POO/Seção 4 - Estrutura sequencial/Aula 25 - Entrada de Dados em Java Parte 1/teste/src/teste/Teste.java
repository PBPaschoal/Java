package teste;

public class Teste {

	public static void main(String[] args) {
		
		int x = 5;
		double y = 2 * x;
		System.out.println("--------------------");
		System.out.println("Teste simples: ");
		System.out.println("--------------------");
		System.out.println("Valor de x: " + x);
		System.out.println("Valor de y: " + y);
		
		System.out.println("\n--------------------");
		System.out.println("Calculo de area: ");
		System.out.println("--------------------");
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		System.out.println("(" + b + " + " + B + ") / 2.0 * " + h);
		System.out.println("Area = " + area);
		
		int c, d;
		double resultado;
		
		c = 5;
		d = 2;
		
		resultado = (double) c / d;
		System.out.println("\n--------------------");
		System.out.println("int double: ");
		System.out.println("--------------------");
		System.out.println("Resultado: " + resultado);
		
		double e;
		int f;
		
		e = 5.0;
		f = (int) e;
		
		System.out.println("\n--------------------");
		System.out.println("double int: ");
		System.out.println("--------------------");
		System.out.println(f);
	}

}
