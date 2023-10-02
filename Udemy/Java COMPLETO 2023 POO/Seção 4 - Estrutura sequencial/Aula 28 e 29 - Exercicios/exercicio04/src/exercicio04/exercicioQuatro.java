// Aula 28 e 29
// Exercicio 04
// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
// decimais.
// Exemplos:
// Entrada: Saída:
// 25
// 100
// 5.50
// NUMBER = 25
// SALARY = U$ 550.00
// Variaveis:
// numeroDoFuncionario = employeeNumber
// horasTrabalhadas = workedHours
// valorQueRecebePorHoras = amountYouReceivePerHour
// salarioFuncionario = employeeSalary

package exercicio04;
import java.util.Locale;
import java.util.Scanner;

public class exercicioQuatro {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int employeeNumber = teclado.nextInt();
		int workedHours = teclado.nextInt();
		double amountYouReceivePerHour = teclado.nextDouble();
		
		double employeeSalary = amountYouReceivePerHour * workedHours;
		
		System.out.println("NUMBER = " + employeeNumber);
		System.out.printf("SALARY = U$ %.2f%n", employeeSalary);
		
		
		teclado.close();

	}

}
