/* Funcionário:
 * Desenvolva uma classe Funcionario com atributos como nome, cargo e salário. Utilize construtores para inicializar esses atributos.
 */

package exercicio06;

public class Funcionario {
	
	private String nome;
	private String cargo;
	private Double salario;
	
	public Funcionario() {
	}
	
	public Funcionario(String nome, String cargo, Double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	

}
