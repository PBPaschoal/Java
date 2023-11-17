/*
 * Aula 99 - Exercício proposto: Listas
 * 
 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários. Não deve haver repetição de id.
 * 
 * Em seguida, efetuar o aumento de X por cento e no salário de um determinado funcionário.
 * Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários, conforme exemplos.
 * 
 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.
 * 
 * Exemplo um:
 * 
 * How many emplouees will be registered? 3
 * 
 * Emplyoee #1:
 * Id: 333
 * Name: Maria Brown
 * Salary: 4000.00
 * 
 * Emplyoee #2:
 * Id: 536
 * Name: Alex Grey
 * Salary: 3000.00
 * 
 * Emplyoee #3:
 * Id: 772
 * Name: Bob Green
 * Salary: 5000.00
 * 
 * Enter the employee id that will have salary increase : 536
 * Enter the percentage: 10.0
 * 
 * List of employees:
 * 33, Maria Brown, 400.00
 * 536, Alex Grey, 3300.00
 * 772, Bob Gren, 5000.00
 * 
 * Exemplo dois, com id errado de proposito:
 * 
 * How many employees will be registered? 2
 * 
 * Employee #1:
 * Id: 333
 * Name: Maria Brown
 * Salary: 4000.00
 * 
 * Employee #2:
 * Id: 536
 * Name: Alex Grey
 * Salary: 3000.00
 * 
 * Enter the employee id that will have salary increase: 776
 * This id does not exist!
 * 
 * List of employees:
 * 333, Maria Brown, 4000.00
 * 536, Alex Grey, 3000.00
 */

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many emplouees will be registered? ");
		int N = keyboard.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println();
			System.out.println("Emplyoee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = keyboard.nextInt();
			while (hasId(list, id)){
				System.out.println("Id already taken! Try again: ");
				id = keyboard.nextInt();
			}
			System.out.print("Name: ");
			keyboard.nextLine();
			String name = keyboard.nextLine();
			System.out.print("Salary: ");
			Double salary = keyboard.nextDouble();

			Employee emp = new Employee(id, name, salary);

			list.add(emp);
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int idsalary = keyboard.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		
		// Integer pos = position(list, idsalary);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = keyboard.nextDouble();
			emp.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for(Employee e : list) {
			System.out.println(e);
		}

		keyboard.close();

	}

	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Employee> list, int id){
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
