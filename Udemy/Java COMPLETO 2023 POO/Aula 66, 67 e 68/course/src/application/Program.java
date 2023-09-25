// Aula 66, 67 e 68 - 
// Outro exemplo:
// 
// Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque). 
// Em seguida:
// 
// Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)
// Realizar uma entrada no estoque e mostrar novamente os dados do produto
// Realizar uma saída no estoque e mostrar novamente os dados do produto
// 
// Para resolver este problema, você deve criar uma CLASSE conforme o projeto ao lado:
// 
// Product
// - Name: string
// - Price: double
// - Quantity: int
// -------------------------------------
// + TotalValueInStock(): double
// + AddProducts(quantity: int): void
// + RemoveProducts(quantity: int): void
// 
// Exemplo:
// 
// Insira os dados do produto:
// Nome: televisão
// Preço: 900,00
// Quantidade em estoque: 10
// 
// Dados do produto: TV, $ 900,00, 10 unidades, Total: $ 9.000,00
// 
// Insira a quantidade de produtos a serem adicionados em estoque: 5
// 
// Dados atualizados: TV, R$ 900,00, 15 unidades, Total: R$ 13.500,00
// 
// Insira a quantidade de produtos a serem retirados do estoque: 3
// 
// Dados atualizados: TV, R$ 900,00, 12 unidades, Total: R$ 10.800,00

package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = keyboard.nextLine();
		System.out.print("Price: ");
		product.price = keyboard.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = keyboard.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = keyboard.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = keyboard.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		keyboard.close();

	}

}
