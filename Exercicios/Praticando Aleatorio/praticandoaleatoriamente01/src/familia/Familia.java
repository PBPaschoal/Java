package familia;

import java.util.Scanner;

public class Familia {

	private Scanner scanner;
	private String pai;
	private String mae;
	private String irmao;
	private String sobrinha;
	private String amor;

	public Familia() {
	}
	
	public Familia(Scanner scanner) {
        this.scanner = scanner;
    }

	public Familia(String pai, String mae, String irmao, String sobrinha, String amor) {
		super();
		this.pai = pai;
		this.mae = mae;
		this.irmao = irmao;
		this.sobrinha = sobrinha;
		this.amor = amor;
	}

	public String getMeuPai() {
		return pai;
	}

	public void setMeuPai(String pai) {
		this.pai = pai;
	}

	public String getMinhaMae() {
		return mae;
	}

	public void setMinhaMae(String mae) {
		this.mae = mae;
	}

	public String getMeuIrmao() {
		return irmao;
	}

	public void setMeuIrmao(String irmao) {
		this.irmao = irmao;
	}

	public String getMinhaSobrinha() {
		return sobrinha;
	}

	public void setMinhaSobrinha(String sobrinha) {
		this.sobrinha = sobrinha;
	}

	public String getMeuAmor() {
		return amor;
	}

	public void setMeuAmor(String amor) {
		this.amor = amor;
	}

	public String saudacaoPara(String pergunta, String nome) {
		if (pergunta.toUpperCase().equals("PAI") && nome.toUpperCase().equals("LUIS")) {
			return saudacaoPai();
		} else if (pergunta.toUpperCase().equals("MAE") && nome.toUpperCase().equals("CLAUDIA")) {
			return saudacaoMae();
		} else if ((pergunta.toUpperCase().equals("IRMAO") && nome.toUpperCase().equals("LUIS"))
				|| (nome.toUpperCase().equals("EDUARDO"))) {
			return saudacaoIrmao();
		} else if ((pergunta.toUpperCase().equals("IRMAO") && nome.toUpperCase().equals("GUILHERME"))
				|| (nome.toUpperCase().equals("AUGUSTO"))) {
			return saudacaoIrmao();
		} else if ((pergunta.toUpperCase().equals("SOBRINHA") && nome.toUpperCase().equals("ALICE"))
				|| (nome.toUpperCase().equals("BOLUCHA")) || (nome.toUpperCase().equals("BOBONA"))) {
			return saudacaoSobrinha();
		} else if ((pergunta.toUpperCase().equals("ESPOSA") || pergunta.toUpperCase().equals("NAMORADA")
				|| pergunta.toUpperCase().equals("AMOR"))
				&& (nome.toUpperCase().equals("BRUNA") || nome.toUpperCase().equals("SENE")
						|| nome.toUpperCase().equals("GATA BRANCA"))) {
			return saudacaoAmor();
		} else {
			return "Ola!";
		}
	}

	private String saudacaoPai() {
		System.out.println("Oi Pai! Que bom ter você aqui!");
		System.out.println("O que deseja conversar?");
		System.out.println("[1] Exemplo 1");
		System.out.println("[2] Exemplo 2");
		int resposta03 = scanner.nextInt();
		if(resposta03 == 1) {
			System.out.println("Show, exemplo 1");
		} else {
			System.out.println("Exemplo 2");
		}
		scanner.close();
		return "Programa finalizado.";
	}

	private String saudacaoMae() {
		return "Oi Mae! Que bom ter você aqui!";
	}

	private String saudacaoIrmao() {
		return "Oi Eduardo! Que bom ter você aqui!";
	}

	private String saudacaoSobrinha() {
		return "Oi Alice! Que bom ter você aqui!";
	}

	private String saudacaoAmor() {
		return "Oi Amor! Que bom ter você aqui!";
	}

}
