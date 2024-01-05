/* Pessoa Class:
 * Crie uma classe Pessoa com atributos como nome, idade e cidade. Utilize um construtor para inicializar esses atributos.
 */
package exercicio01;

public class Pessoa {
	
	private String name;
	public String cidade;
	public int idade;
	
	public Pessoa() {
	}

	public Pessoa(String name, String cidade, int idade) {
		this.name = name;
		this.cidade = cidade;
		this.idade = idade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
