// Aula 77 - Sobrecarga
// Proposta de melhoria
// 
// Vamos criar um construtor opcional, o qual recebe apenas nome e preço do produto.
// A quantidade em estoque deste novo produto, por padrão, deverá então ser iniciada com o valor zero.
// 
// Nota: é possível também incluir um construtor padrão.

package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public Product(){
	}
	
	public Product(String name, double price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price){
		this.name = name;
		this.price = price;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}