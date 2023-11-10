package financas;

import java.util.Scanner;

public class Contrato {
	
	private Scanner keyboard;
	private double parcela;
	private double prazo;
	private double valorLiquido;
	private double valorSaldoDevedor;
	private double fator;
	private String nomeCliente;
	private String cpfCliente;
	private byte idadeCliente;
	private byte prazoCliente;
	private char sexoCliente;
	private byte operacao;
	
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
		System.out.println("\n::::::::::::::::::::::::");
		System.out.println("Informe os dados abaixo:");
		System.out.print("NOME DO CLIENTE: ");
		
		System.out.print("\nCPF DO CLIENTE: ");
		keyboard.nextLine();
		System.out.println("\nIDADE: ");
		keyboard.nextLine();
		System.out.print("\nSEXO: ");
		keyboard.nextLine();
		System.out.println("\nPRAZO: ");
		keyboard.nextLine();
	}
	
	public void ContratoNovo() {
		System.out.println("\nVOCE SELECIOU CONTRATO NOVO!");
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
		
		operacao = 1;
		
	}
	
	public void ContratoDeRefinanciamento() {
		System.out.println("\nVOCE SELECIOU CONTRATO DE REFINANCIAMENTO!");
		System.out.print("PARCELA: R$");
		System.out.print("SALDO DEVEDOR: R$");
		operacao = 2;
	}
	
	public double CalcularContratoNovo() {
		return valorLiquido = parcela * fator;
	}
	
	public double CalcularContratoRefinanciamento() {
		return valorLiquido = parcela * fator - valorSaldoDevedor;
	}
	
	public void Resultado() {
		System.out.println("NOME DO CLIENTE: " + nomeCliente);
		System.out.println("CPF DO CLIENTE: " + cpfCliente);
		System.out.println("IDADE DO CLIENTE: " + idadeCliente);
		System.out.println("SEXO DO CLIENTE: " + sexoCliente);
		System.out.println("PRAZO DO CONTRATO: " + prazo);
		System.out.println(".......................................");
		if(operacao == 1) {
			System.out.println("VALOR LIBERADO: R$" + CalcularContratoNovo());
		}
		
		else {
			
		}
		
		System.out.println("PORCENTAGEM DA COMISSAO: ");
		System.out.println("VALOR DA COMISSÃO DO CORRETOR: ");
		
	}

}
