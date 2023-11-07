package financas;

import java.util.Scanner;

public class Bancos {
	
	private Scanner keyboard;
	public byte limiteDeIdade;
	private byte prazo;
	private int porcentagemComissao;
	private double parcela;
	private double valorBruto;
	private double valorLiquido;
	private double valorDoSaldoDevedor;
	private double comissao;
	
	public Bancos(Scanner keyboard, byte limiteDeIdade, byte prazo, int porcentagemComissao, double parcela,
			double valorBruto, double valorLiquido, double valorDoSaldoDevedor, double comissao) {
		this.keyboard = keyboard;
		this.limiteDeIdade = limiteDeIdade;
		this.prazo = prazo;
		this.porcentagemComissao = porcentagemComissao;
		this.parcela = parcela;
		this.valorBruto = valorBruto;
		this.valorLiquido = valorLiquido;
		this.valorDoSaldoDevedor = valorDoSaldoDevedor;
		this.comissao = comissao;
	}
	
	
	

}
