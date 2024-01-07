/*
 * Carro:
 * Crie uma classe Carro com atributos como modelo, ano e cor. Utilize construtores para inicializar esses atributos.
 */
package exercicio07;

public class Carro {
	
	public String modelo;
	public String cor;
	public int ano;
	
	public Carro() {
	}
	
	public Carro(String modelo, String cor, int ano) {
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}

}
