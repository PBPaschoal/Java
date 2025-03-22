package application;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudUsuarios {
	static ArrayList<String> usuarios = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		while(true) {
			System.out.println("\n=== CRUD de Usuários ===");
			System.out.println("1 - Criar Usuário");
			System.out.println("2 - Listar Usuários");
			System.out.println("3 - Atualizar Usuário");
			System.out.println("4 - Deletar Usuário");
			System.out.println("5 - Sair");
			System.out.println("Escolha uma opção: ");
			
			String opcao = scanner.nextLine();
			System.out.println();
			
			switch (opcao) {
				case "1": criarUsuario(); break;
				case "2": listarUsuarios(); break;
				case "3": atualizarUsuario(); break;
				case "4": deletarUsuario(); break;
				case "5": return;
				default: System.out.println("Opção inválida!"); break;
			}
		}

	}
	
	static void criarUsuario() {
		System.out.print("Digite o nome do usuário: ");
		String nome = scanner.nextLine();
		usuarios.add(nome);
		System.out.println("Usuário ' " + nome + "' adicionado com sucesso!");
	}
	
	static void listarUsuarios() {
		if(usuarios.isEmpty()) {
			System.out.println("Nenhum usuário cadastrado.");
			return;
		}
		
		System.out.println("\nLista de Usuários:");
		for(int i = 0; i < usuarios.size(); i++) {
			System.out.println((i + 1) + ". " + usuarios.get(i));
		}
	}
	
	static void atualizarUsuario() {
		listarUsuarios();
		System.out.print("\nDigite o número do usuário que deseja atualizar: ");
		int index = Integer.parseInt(scanner.nextLine()) - 1;
		
		if(index < 0 || index >= usuarios.size()) {
			System.out.println("Número inválido!");
			return;
		}
		
		System.out.print("Digite o novo nome: ");
		String novoNome = scanner.nextLine();
		usuarios.set(index, novoNome);
		System.out.println("Usuários atualizado com sucesso!");
	}
	
	static void deletarUsuario() {
		listarUsuarios();
		System.out.print("\nDigite o número do usuário que deseja deletar: ");
		int index = Integer.parseInt(scanner.nextLine()) - 1;
		
		if(index < 0 || index >= usuarios.size()) {
			System.out.println("Números inválido!");
		}
		
		System.out.println("Usuário '" + usuarios.get(index) + "' removido.");
		usuarios.remove(index);
	}

}
