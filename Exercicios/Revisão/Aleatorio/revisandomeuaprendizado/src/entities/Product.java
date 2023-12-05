package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double SomaProduto() {
		return price * quantity;
	}
	
	public String toString() {
		return "o produto " + name + ", na quantidade " + quantity + ", que tem o valor total de R$ " + String.format("%.2f", SomaProduto());
	}
	

}
