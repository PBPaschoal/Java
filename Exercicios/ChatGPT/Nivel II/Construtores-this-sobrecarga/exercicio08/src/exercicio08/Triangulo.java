/* 
 * Triângulo:
 * Implemente uma classe Triangulo com atributos para os lados. Use construtores para inicializar esses valores.
 */

package exercicio08;

public class Triangulo {
	
	public Double ladoA;
	public Double ladoB;
	public Double ladoC;
	
	public Triangulo() {
	}
	
	public Triangulo(Double ladoA, Double ladoB, Double ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	public Double getLadoA() {
		return ladoA;
	}

	public void setLadoA(Double ladoA) {
		this.ladoA = ladoA;
	}

	public Double getLadoB() {
		return ladoB;
	}

	public void setLadoB(Double ladoB) {
		this.ladoB = ladoB;
	}

	public Double getLadoC() {
		return ladoC;
	}

	public void setLadoC(Double ladoC) {
		this.ladoC = ladoC;
	}
	
	
	
	

}
