// Employee
// - Name: string
// - GrossSalary: double
// - Tax: double
// -----------------------------
// + NetSalary(): double
// + IncreaseSalary(percentage: double): void

package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary() {
        return grossSalary - tax;
    }

    public void IncreaseSalary(double percentage) {
        double aumento = grossSalary * (percentage / 100.0);
        grossSalary += aumento;
    }

    @Override
    public String toString() {
        return name + ", $" + String.format("%.2f", NetSalary());
    }
}

