/*Conta Bancária:
 * Desenvolva uma classe ContaBancaria com atributos como número da conta, saldo e titular. Crie construtores apropriados.
 */
package exercicio02;

public class ContaBancario {
	
	private int numeroConta;
	private Double saldo;
	private String titular;
	
	public ContaBancario() {
	}
	
	public ContaBancario(int numeroConta, Double saldo, String titular) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.titular = titular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
}
