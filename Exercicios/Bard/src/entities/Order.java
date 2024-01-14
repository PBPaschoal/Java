package entities;

public class Order {
	
	private Integer maior = Integer.MIN_VALUE;
	private Integer menor = Integer.MAX_VALUE;
	
	public Order(){
	}
	
	public Order(Integer maior, Integer menor) {
		this.maior = maior;
		this.menor = menor;
	}
	
	public Integer getMaior() {
		return maior;
	}
	
	public void setMaior(Integer maior) {
		this.maior = maior;
	}
	
	public Integer getMenor() {
		return menor;
	}
	
	public void setMenor(Integer menor) {
		this.menor = menor;
	}
}
