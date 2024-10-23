package animais;

public class Gatos {
	
	private String nome;
	private char sexo;
	private int ano;
	private double quilos;
	
	public Gatos() {
	}
	
	public Gatos(String nome) {
		this.nome = nome;
	}
	
	public Gatos(String nome, char sexo, int ano, double quilos) {
		this.nome = nome;
		this.sexo = sexo;
		this.ano = ano;
		this.quilos = quilos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public double getQuilos() {
		return quilos;
	}
	
	public void setQuilos(double quilos) {
		this.quilos = quilos;
	}
	
	public int idadeGato(int ano) {
		return 2024 - getAno();
	}
	
	public String bebendoAgua() {
		if(getSexo() == 'F') {
			System.out.print("A ");
		} else {
			System.out.print("O ");
		}
		return getNome() + " está bebendo agua!";
	}
	
	public String quantosQuilos() {
		if(getSexo() == 'F') {
			System.out.print("Ela ");
		} else {
			System.out.print("Ele ");
		}
		return "tem " + String.format("%.3f", getQuilos()) + "Kg.";
	}
	
	public String machoOuFemea() {
		if(getSexo() == 'F') {
			return "Fêmea";
		} else {
			return "Macho";
		}
	}
	
	public String aIdadeESexo() {
		return "Tem " + idadeGato(ano) + " anos e é " + machoOuFemea() + ".";
	}

}
