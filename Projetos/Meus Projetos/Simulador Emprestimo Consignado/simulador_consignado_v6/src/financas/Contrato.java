package financas;

import java.util.Scanner;

public class Contrato {
	
	private Scanner keyboard;
	private double parcela;
	private double prazo;
	private double valorLiquido;
	private double valorSaldoDevedor;
	private String nomeCliente;
	private String cpfCliente;
	private byte idadeCliente;
	private byte prazoCliente;
	private char sexoCliente;
	
	public Contrato(Scanner keyboard, double parcela, double prazo, double valorLiquido, double valorSaldoDevedor) {
		this.keyboard = keyboard;
		this.parcela = parcela;
		this.prazo = prazo;
		this.valorLiquido = valorLiquido;
		this.valorSaldoDevedor = valorSaldoDevedor;
	}

	public double getParcela() {
		return parcela;
	}

	public double getPrazo() {
		return prazo;
	}

	public double getValorLiquido() {
		return valorLiquido;
	}

	public double getValorSaldoDevedor() {
		return valorSaldoDevedor;
	}
	
	public void DadosDoCliente() {
		System.out.println("\nVOCE SELECIOU CONTRATO NOVO!");
		System.out.println("Informe os dados abaixo:");
		System.out.print("NOME DO CLIENTE: ");
		
		System.out.print("CPF DO CLIENTE: ");
		keyboard.nextLine();
		System.out.println("IDADE: ");
		keyboard.nextLine();
		System.out.print("SEXO: ");
		keyboard.nextLine();
		System.out.println("PRAZO: ");
		keyboard.nextLine();
	}
	
	public void ContratoNovo() {
		System.out.println("DESEJA SIMULAR PELO VALOR DA PARCELA OU PELO VALOR DO CONTRATO?");
		System.out.println("[1] PARCELA");
		System.out.println("[2] CONTRATO");
		int resposta = 0;
		resposta = keyboard.nextInt();
		if(resposta == 1) {
			System.out.print("PARCELA: R$");
		} else {
			System.out.print("VALOR LIBERADO: R$");
		}
		
	}
	
	public void ContratoDeRefinanciamento() {
		System.out.print("PARCELA: R$");
		System.out.print("SALDO DEVEDOR: R$");
	}
	
	

}
