package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public Employee() {
	}
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public void IncreaseSalary(double percentage) {
		grossSalary += (grossSalary * percentage / 100.0);
	}

}
