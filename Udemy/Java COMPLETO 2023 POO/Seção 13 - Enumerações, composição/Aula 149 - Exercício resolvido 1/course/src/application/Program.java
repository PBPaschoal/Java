/* Aula 149 - Exercício resolvido 1
 * 
 * Ler os dados de um trabalhor com N contratos (N fornecido pelo usuário). Depois, solicitar do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo:
 * 
 * Enter department's name: Design
 * Enter worker data:
 * Name: Alex
 * Level: MID_LEVEL
 * Base salary: 1200.00
 * How many contracts to this worker? 3
 * Enter contract #1 data:
 * Date (DD/MM/YYYY): 20/08/2018
 * Value per hour: 50.00
 * Duration (hours): 20
 * Enter contract #2 data:
 * Date (DD/MM/YYYY): 25/08/2018
 * Value per hour: 80.00
 * Duration (hours): 10
 * 
 * Enter month and yer to calculate income (MM/YYYY): 08/2018
 * Name: Alex
 * Department: Design
 * Income for 08/2018: 3000.00
 */

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department's name: ");
		String departmentName = keyboard.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = keyboard.nextLine();
		System.out.print("Level:  ");
		String workerLevel = keyboard.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = keyboard.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Department(departmentName));

		System.out.print("How many contracts to this worker? ");
		int n = keyboard.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(keyboard.next());
			System.out.print("Value per hour: ");
			double valuePerHour = keyboard.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = keyboard.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);

			System.out.println();
			System.out.print("Enter month and year to calculate income (MM/YYYY): ");
			String monthAndYear = keyboard.next();
			int month = Integer.parseInt(monthAndYear.substring(0, 2));
			int year = Integer.parseInt(monthAndYear.substring(3));
			System.out.println("Name: " + worker.getName());
			System.out.println("Department: " + worker.getDepartment().getName());
			System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

		}

		keyboard.close();

	}

}
