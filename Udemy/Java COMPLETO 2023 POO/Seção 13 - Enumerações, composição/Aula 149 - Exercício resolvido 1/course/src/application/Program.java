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

import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter department's name: ");
		String departmentName = keyboard.nextLine();
		System.out.print("Enter worker data:");
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

		keyboard.close();

	}

}
