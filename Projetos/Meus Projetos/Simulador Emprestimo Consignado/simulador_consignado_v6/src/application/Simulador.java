package application;

import java.util.Locale;
import java.util.Scanner;

import financas.Bancos;
import financas.Contrato;
import usuarios.Autenticacao;

public class Simulador {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);

		Autenticacao autenticacao = new Autenticacao(keyboard);
		Bancos bancos = new Bancos();
		Contrato contrato = new Contrato(keyboard, 0, 0, 0, 0);

		System.out.println(":::::::::::::::::::::::::::");
		System.out.println(":::::( CADASTRAMENTO ):::::");
		System.out.println(":::::::::::::::::::::::::::");

		autenticacao.cadastroInicial();

		System.out.println(":::::::::::::::::::::::::::");
		System.out.println("::::: ACESSAR SISTEMA :::::");
		System.out.println(":::::::::::::::::::::::::::");

		autenticacao.acessarSistema();

		int opcaoInvalida = 0;
		for (int i = 0; i <= opcaoInvalida; i++) {
			System.out.println("\n:::::::::::::::::::::::::::");
			System.out.println(":::::::::: BANCO ::::::::::");
			System.out.println(":::::::::::::::::::::::::::");
			System.out.println("SELECIONE O BANCO DESEJADO:");
			System.out.println("[1] BANCO BRADESCO");
			System.out.println("[2] BANCO ITAU");
			System.out.println("[3] BANCO DAYCOVAL");
			System.out.println("[4] BANCO OLE");
			System.out.println("[5] BANCO BMG");
			System.out.println("[6] BANCO PAN");
			byte escolha = keyboard.nextByte();

			switch (escolha) {
			case 1:
				bancos.bancoBradesco();
				break;
			case 2:
				bancos.bancoItau();
				break;
			case 3:
				bancos.bancoDaycoval();
				break;
			case 4:
				bancos.bancoOle();
				break;
			case 5:
				bancos.bancoBMG();
				break;
			case 6:
				bancos.bancoPAN();
				break;
			default:
				System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				System.out.println("Opcao invalida! Informe uma opcao valida:");
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
				opcaoInvalida++;
			}
		}

		for (int i = 0; i <= opcaoInvalida; i++) {
			System.out.println("\n:::::::::::::::::::::::::::");
			System.out.println(":::::::::: OPERACAO ::::::::::");
			System.out.println(":::::::::::::::::::::::::::");
			System.out.println("ESCOLHA O TIPO DE OPERACAO QUE DESEJA SIMULAR:");
			System.out.println("[1] EMPRESTIMO NOVO");
			System.out.println("[2] REFINANCIAMENTO DE DIVIDA");
			byte escolha = keyboard.nextByte();
			
			switch (escolha) {
			case 1:
				contrato.DadosDoCliente();
				contrato.ContratoNovo();
				break;
			case 2:
				contrato.DadosDoCliente();
				contrato.ContratoDeRefinanciamento();
				break;
			default:
				System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				System.out.println("Opcao invalida! Informe uma opcao valida:");
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
				opcaoInvalida++;
			}
		}

		keyboard.close();
	}
}
