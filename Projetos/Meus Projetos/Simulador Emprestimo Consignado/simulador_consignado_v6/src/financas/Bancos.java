package financas;

import java.util.Scanner;

public class Bancos {

	private Scanner keyboard;
	public byte limiteDeIdade;
	private int escolha;
	private int porcentagemComissao;
	private double comissao;

	public Bancos(Scanner keyboard, byte limiteDeIdade, int escolha, int porcentagemComissao, double comissao) {
		this.keyboard = keyboard;
		this.limiteDeIdade = limiteDeIdade;
		this.escolha = escolha;
		this.porcentagemComissao = porcentagemComissao;
		this.comissao = comissao;
	}

	public Bancos() {
		limiteDeIdade = 0;
		escolha = 0;
		porcentagemComissao = 0;
		comissao = 0.0;
	}
	
	public byte getLimiteDeIdade() {
		return limiteDeIdade;
	}

	public void bancoBradesco() {
		comissao = 1.0;
		limiteDeIdade = 72;
		System.out.println("\n Voce selecionou: Banco Bradesco");
	}

	public void bancoItau() {
		comissao = 4.0;
		limiteDeIdade = 74;
		System.out.println("\n Voce selecionou: Banco Itau");
	}
	
	public void bancoDaycoval() {
		comissao = 3.5;
		limiteDeIdade = 75;
		System.out.println("\n Voce selecionou: Banco Daycoval");
	}
	
	public void bancoOle() {
		comissao = 2.8;
		limiteDeIdade = 73;
		System.out.println("\n Voce selecionou: Banco Ole");
	}
	
	public void bancoBMG() {
		comissao = 4.5;
		limiteDeIdade = 74;
		System.out.println("\n Voce selecionou: Banco BMG");
	}
	
	public void bancoPAN() {
		comissao = 4.0;
		limiteDeIdade = 75;
		System.out.println("\n Voce selecionou: Banco PAN");
	}
	
	

}
