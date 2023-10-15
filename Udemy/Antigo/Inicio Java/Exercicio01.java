import java.util.Locale;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		//Dia 15/09/2022 Primeiro exercicio:
		//Em um novo programa, inicie as seguintes variáveis:
		
		String product1 = "Computer";
		String produtc2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		//Em seguida, usando os valores das variáveis, produza a seguinte saída na tela do console:
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f\n", product1, price1);
		System.out.printf("%s, which price is $ %.2f\n\n", produtc2, price2);
		
		System.out.printf("Record: %d years old, code %d and gender: %s\n\n", age, code, gender);
		
		System.out.printf("Measue with eight decimal places: %.8f\n", measure);
		System.out.printf("Rouded (three decimal places): %.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
		// Descrevi o exercicio já resolvendo.
	}
	
}
