/* Aula 161 - Exercicio resolvido
  * Uma empresa possui funcionários e terceirizados.
  * Para cad afuncionário, deseja-se registrar nome, horas, trabalhadas e valor por hora. Funcionários terceirizado possuem ainda uma despesa adicional.
  *
  * O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas,
  * sendo que os funcionários  terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional.
  *
  * Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e amarzená-los em uma lista.
  * Depois de ler todos os dados, mostrar nome e pagamento de cada funcionário na mesma ordem em que foram digitados.
  *
  * Construa o programa conforme projeto ao lado. Veja exemplo na próxima página. 
  *
  * Employee
  * - name : String
  * - hours : Integer
  * - valuePerHour : Double
  * + payment() : Double
  *
  * OutsourcedEmployee
  * - additionalCharge : Double
  *
  * Exemplo:
  * Enter the number of employees: 3
  * Employee #1 data:
  * Outsourced (y/n)? n
  * Name: Bruno
  * Hours: 50
  * Value per hour: 20.00
  * Employee #2 data:
  * Outsourced (y/n)?
  * Name: Bob
  * Hours: 100
  * Value per hour: 15.00
  * Additional charge: 200.00
  * Employee #3 data: 
  * Outsourced (y/n)? n
  * Name: Maria
  * Hours: 60
  * Value per hour: 20.00
  *
  * PAYMENTS:
  * Bruno - $ 1000.00
  * Bob - $ 1720.00
  * Maria - $ 1200.00
 */

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if(ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				//Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				//Employee emp = new Employee(name, hours, valuePerHour);
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		sc.close();

	}

}
