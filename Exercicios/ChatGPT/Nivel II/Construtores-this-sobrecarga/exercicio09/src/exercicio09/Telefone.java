/* 
 * Telefone:
 * Desenvolva uma classe Telefone com atributos para o código de área e número. Utilize construtores para inicializar esses atributos.
 */

package exercicio09;

public class Telefone {

	private int codigoArea;
	private int numero;
	
	public Telefone() {
	}
	
	public Telefone(int codigoArea, int numero) {
		this.codigoArea = codigoArea;
		this.numero = numero;
	}
	
	public int getCodigoArea() {
		return codigoArea;
	}
	
	public void setCodigoArea(int codigoArea) {
		this.codigoArea = codigoArea;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
