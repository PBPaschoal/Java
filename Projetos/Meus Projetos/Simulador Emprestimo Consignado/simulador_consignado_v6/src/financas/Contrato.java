package financas;

import java.util.Scanner;

public class Contrato {

	private Scanner keyboard;
	private byte idadeCliente;
	private byte operacao;
	public byte resposta = 0;
	private byte prazo;
	public byte limiteDeIdade;
	private double porcentagemComissao;
	private double comissao;
	private double parcela;
	private double valorLiquido;
	private double valorSaldoDevedor;
	private double fator = 0.1521;
	private char sexoCliente;
	private String nomeCliente;
	private String cpfCliente;

	public Contrato(Scanner keyboard) {
		this.keyboard = keyboard;
	}

	public double getParcela() {
		return parcela;
	}

	public byte getPrazo() {
		return prazo;
	}
	
	public double getValorLiquido() {
		return valorLiquido;
	}
	
	public void bancoBradesco() {
		porcentagemComissao = 1.0;
		limiteDeIdade = 72;
		System.out.println("\n[VOCE SELECIONOU O BANCO BRADESCO]");
		ComissaoCorretor();
	}

	public void bancoItau() {
		porcentagemComissao = 4.0;
		limiteDeIdade = 74;
		System.out.println("\n[VOCE SELECIONOU O BANCO ITAU");
		ComissaoCorretor();
	}
	
	public void bancoDaycoval() {
		porcentagemComissao = 3.5;
		limiteDeIdade = 75;
		System.out.println("\n[VOCE SELECIONOU O BANCO DAYCOVAL");
		ComissaoCorretor();
	}
	
	public void bancoOle() {
		porcentagemComissao = 2.8;
		limiteDeIdade = 73;
		System.out.println("\n[VOCE SELECIONOU O BANCO OLE");
		ComissaoCorretor();
	}
	
	public void bancoBMG() {
		porcentagemComissao = 4.5;
		limiteDeIdade = 74;
		System.out.println("\n[VOCE SELECIONOU O BANCO BMG");
		ComissaoCorretor();
	}
	
	public void bancoPAN() {
		porcentagemComissao = 4.0;
		limiteDeIdade = 75;
		System.out.println("\n[VOCE SELECIONOU O BANCO PAN");
		ComissaoCorretor();
	}
	

	public void DadosDoCliente() {
		System.out.println("\n:::::::::::::::::::::::::::::::");
		System.out.println(">>> Informe os dados abaixo <<<");
		System.out.println(":::::::::::::::::::::::::::::::");
		System.out.print("NOME DO CLIENTE: ");
		keyboard.nextLine();
		nomeCliente = keyboard.nextLine();
		System.out.print("\nCPF DO CLIENTE: ");
		cpfCliente = keyboard.nextLine();
		System.out.print("\nIDADE: ");
		idadeCliente = keyboard.nextByte();
		System.out.print("\nSEXO (F/M): ");
		sexoCliente = keyboard.next().charAt(0);
		System.out.print("\nPRAZO: ");
		prazo = keyboard.nextByte();
		System.out.println();
		Resultado();
	}

	public void ContratoNovo() {
		System.out.println("\nVOCE SELECIOU CONTRATO NOVO!");
		System.out.println("DESEJA SIMULAR PELO VALOR DA PARCELA OU PELO VALOR DO CONTRATO?");
		System.out.println("[1] PARCELA");
		System.out.println("[2] CONTRATO");
		System.out.print("\nAguardando entrada de dados - ");
		resposta = keyboard.nextByte();
		if (resposta == 1) {
			System.out.print("PARCELA: R$ ");
			parcela = keyboard.nextDouble();
			valorLiquido = parcela / fator;
		} else {
			System.out.print("VALOR LIBERADO: R$ ");
			valorLiquido = keyboard.nextDouble();
			parcela = valorLiquido * fator;
		}
		DadosDoCliente();
		operacao = 1;

	}

	public void ContratoDeRefinanciamento() {
		System.out.println("\nVOCE SELECIOU CONTRATO DE REFINANCIAMENTO!");
		System.out.print("PARCELA: R$ ");
		parcela = keyboard.nextDouble();
		System.out.print("SALDO DEVEDOR: R$ ");
		keyboard.nextLine();
		valorSaldoDevedor = keyboard.nextDouble();
		DadosDoCliente();
		operacao = 2;
	}

	/*public double CalcularContratoNovo() {
		if(resposta == 1) {
			return valorLiquido = parcela / fator;
		} else {
			return parcela = valorLiquido * fator;
		} 
	}*/

	public double CalcularContratoRefinanciamento() {
		return valorLiquido = parcela / fator - valorSaldoDevedor;
	}
	
	public double ComissaoCorretor() {
		comissao = porcentagemComissao * valorLiquido;
		return comissao;
	}

	public void Resultado() {
		System.out.println();
		System.out.println("::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(">>>>> CONTRATO SIMULADO COM SUCESSO! <<<<<");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::\n");
		System.out.println("NOME DO CLIENTE: " + nomeCliente);
		System.out.println("CPF DO CLIENTE: " + cpfCliente);
		System.out.println("IDADE DO CLIENTE: " + idadeCliente);
		System.out.println("SEXO DO CLIENTE: " + sexoCliente);
		System.out.println("PRAZO DO CONTRATO: " + getPrazo());
		if (operacao == 1) {
			System.out.println(String.format("> PARCELA R$%.2f", getParcela()));
			System.out.println(String.format("> VALOR LIBERADO: R$%.2f", getValorLiquido()));
		}

		else {
			System.out.println(String.format("> PARCELA R$%.2f", getParcela()));
			System.out.println(String.format("> VALOR LIBERADO: R$%.2f", CalcularContratoRefinanciamento()));
		}
		System.out.println("\n..........................................");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("$$$$$$$$$$ [ VALORES CORRETOR ] $$$$$$$$$$");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("..........................................");
		System.out.println("> PORCENTAGEM DA COMISSAO: " + porcentagemComissao);
		System.out.println(String.format("> VALOR DA COMISSÃO DO CORRETOR: R$%.2f", ComissaoCorretor()));
		System.out.println("\n\n:::: FIM DA SIMULACAO ::::");
		keyboard.close();
	}
	
	

}
