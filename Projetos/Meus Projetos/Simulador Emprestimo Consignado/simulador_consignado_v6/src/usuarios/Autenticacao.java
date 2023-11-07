package usuarios;
import java.util.Scanner;

public class Autenticacao {
	
	private Scanner keyboard;
	private String nome;
	private String usuario;
	private String senha;
	private String repetirUsuario;
	private String repetirSenha;
	private byte erros;
	
	public Autenticacao(Scanner scanner) {
        this.keyboard = scanner;
        this.erros = 0;
    }
	
	public void cadastroInicial() {
		System.out.println("___________________________");
		System.out.println(":::::::::::::::::::::::::::");
		System.out.print("NOME DO USUARIO: ");
		nome = keyboard.nextLine();
		System.out.print("USUARIO: ");
		usuario = keyboard.nextLine();
		System.out.print("SENHA: ");
		senha = keyboard.nextLine();
		System.out.println("\n:::::::::::::::::::::::::::");
		System.out.println("  CADASTRADO COM SUCESSO!  ");
		System.out.println(":::::::::::::::::::::::::::");
		System.out.println("___________________________");
	}
	
	public void acessarSistema() {
		System.out.print("USUARIO: ");
		repetirUsuario = keyboard.nextLine();
		System.out.print("SENHA: ");
		repetirSenha = keyboard.nextLine();
		
		while (!repetirUsuario.equals(usuario) || !repetirSenha.equals(senha)) {
			erros++;
			System.out.println(":::::::::::::::::::::::::::");
			System.out.println("  DADOS INVALIDOS!  ");
			System.out.println(":::::::::::::::::::::::::::");
			System.out.println("INFORME OS DADOS CORRETOS: ");
			System.out.print("USUARIO: ");
			repetirUsuario = keyboard.nextLine();
			System.out.print("SENHA: ");
			repetirSenha = keyboard.nextLine();
			
			if (erros >= 3) {
				System.out.println("\n\n:::::::::::::::::::::::::::");
				System.out.println("MAXIMO DE ERROS ATINGIDO!");
				System.out.println("CADASTRAR NOVAMENTE");
				System.out.println(":::::::::::::::::::::::::::");
				System.out.println("___________________________");
				reiniciarCadastro();
				return;
			}
		}
		
		System.out.println(":::::::::::::::::::::::::::");
		System.out.println(nome + ", VOCE LOGOU COM SUCESSO!");
	}
	
	public void reiniciarCadastro() {
		cadastroInicial();
		erros = 0; 
	}
}
