package converter;

public class CurrencyConverter {
	
	public double pricedollar;
	public double quantitydollars;
	public double value;
	
	public double Converter() {
		return value = pricedollar * quantitydollars;
	}
	
	public double Tax() {
		return Converter() +(Converter() * 6.0 / 100.0);
	}

}
