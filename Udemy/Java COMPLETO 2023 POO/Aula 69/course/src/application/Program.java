// Aula 69
// Exercício 03
// Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). 
// Em seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o salário 
// do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) 
// e mostrar novamente os dados do funcionário. Use a classe projetada abaixo.
// 
// Employee
// - Name: string
// - GrossSalary: double
// - Tax: double
// -----------------------------
// + NetSalary(): double
// + IncreaseSalary(percentage: double): void
// 
// Exemplo: 
// 
// Name: Paulo Silva
// Gross salary: 6000.00
// Tax: 1000.00
// 
// Employee: Paulo Silva, $ 5000.00
// 
// Which percentage to increase salary? 10.0
// 
// Updated data: Paulo Silva, 5600.00

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
        System.out.print("Gross salary: ");
        employee.grossSalary = keyboard.nextDouble();
        System.out.print("Tax: ");
        employee.tax = keyboard.nextDouble();

        System.out.println();
        System.out.println("Employee: " + employee);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double porcentagem = keyboard.nextDouble();
        employee.IncreaseSalary(porcentagem);

        System.out.println();
        System.out.print("Updated data: ");
        System.out.println(employee);

        keyboard.close();
    }
}