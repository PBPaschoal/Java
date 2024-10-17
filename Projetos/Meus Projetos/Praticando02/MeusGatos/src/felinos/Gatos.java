package felinos;

public class Gatos {
	
	public String nome;
	public String cor;
	public char sexo;
	public int idade;
	public int ano;
	public double altura;
	
	public Gatos() {}
	
	public Gatos(String nome, String cor, char sexo, int idade, int ano, double altura) {
		this.nome = nome;
		this.cor = cor;
		this.sexo = sexo;
		this.idade = idade;
		this.ano = ano;
		this.altura = altura;
	}
	
	public void Comer() {
		if(sexo == 'F') {
			System.out.print("A " + nome);
		} else {
			System.out.print("O " + nome);
		}
		System.out.print(" está comendo agora.");
	}

}
