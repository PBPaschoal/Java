package ex04;

import java.util.Locale;

public class CelsiusFahrenheit {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double c = 37.0;
		double f = c * 1.8 + 32.0;
		System.out.printf("Fahrenheit = %.2f", f);
	}

}