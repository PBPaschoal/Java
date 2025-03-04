package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = keyboard.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = keyboard.nextDouble();
		System.out.print("Tax: ");
		employee.tax = keyboard.nextDouble();
		
		System.out.println("\nEmployee: " + employee.name + ", $ " + String.format("%.2f", employee.NetSalary()));
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = keyboard.nextDouble();
		employee.IncreaseSalary(percentage);
		
		System.out.println("\nUpdated data: " + employee.name + ", $ " + String.format("%.2f", employee.NetSalary()));
		
		keyboard.close();

	}

}
