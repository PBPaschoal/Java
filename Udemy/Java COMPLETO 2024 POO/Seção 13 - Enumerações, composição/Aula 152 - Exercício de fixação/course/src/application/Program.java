/* Aula 152 - Exercício de fixação

Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um sumário do pedido conforme exemplo (próxima página). 
Nota: o instante do pedido deve ser o instante do sistema: new Date()

Enter cliente data:
Name: Alex Green
Email: alex@gmail.com
Brith date (DD/MM/YYYY): 15/03/1985
Enter order data:
Status: PROCESSING
How many items to this order? 2
Enter #1 item data:
Product name: TV
Product price: 1000.00
Quantity: 1
Enter #2 item data:
Product name: Mouse
Product price: 40.00
Quantity: 2

ORDER SUMMARY:
Order moment: 20/04/2018 11:25:09
Order statud: Processing
Client: Alex Green (15/03/1965) - alex@gmail.com
Order items:
TV, $1000.00, Quantity: 1, Subtotal: $1000.00
Mouse, $40.00, Quantity: 2, Subtotal: $80.00
Total price: $1080.00 */

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = keyboard.nextLine();
		System.out.print("Email: ");
		String email = keyboard.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(keyboard.next());

		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(keyboard.next());

		Order order = new Order(new Date(), status, client);

		System.out.print("How many items to this order? ");
		int N = keyboard.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			keyboard.nextLine();
			String productName = keyboard.nextLine();
			System.out.print("Product price: ");
			double productPrice = keyboard.nextDouble();
			System.out.print("Quantity: ");
			int quantity = keyboard.nextInt();

			Product product = new Product(productName, productPrice);

			OrderItem it = new OrderItem(quantity, productPrice, product);

			order.addItem(it);
		}
		
		System.out.println();
		System.out.println(order);

		keyboard.close();

	}

}
