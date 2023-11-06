package entities;

public class Bank {

	private int numeroConta;
	private String nomeTitular;
	private double deposito;
	
	public Bank(int numeroConta, String nomeTitular, double deposito) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.deposito = deposito;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public double getDeposito() {
		return deposito;
	}
	
	public void addDeposito(double deposito) {
		this.deposito += deposito;
	}
	
	public void removeSaque(double deposito) {
		this.deposito -= deposito + 5.00;
	}
	
	public String toString() {
		return "Conta " 
				+ numeroConta 
				+ ", Titular: " 
				+ nomeTitular 
				+ ", Saldo: $ " 
				+ String.format("%.2f", getDeposito());
	}
	
	
}
