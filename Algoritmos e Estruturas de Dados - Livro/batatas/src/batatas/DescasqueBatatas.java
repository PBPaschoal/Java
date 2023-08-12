// Dia 11 de agosto de 2023
// Livro Algoritmos e Estruturas de Dados 17º TIRAGEM - Guimarães / Lages
// Ciência de Computação -Livros Técnicos e Cientificos Editora S.A
// Praticando Lógica de Programação inspirado em exemplos exercicios do livro, utilizando Java

package batatas;
import java.util.Scanner;

public class DescasqueBatatas {
    public static void main(String[] args) {
    	int contador = 1;
    	
        System.out.println("Traga a cesta com batatas do porão");
        System.out.println("Traga a panela do armário");
        System.out.print("A sua roupa é clara ou escura: [C/E]? ");
        
        Scanner scanner = new Scanner(System.in); // Criar um objeto Scanner
        
        String resposta = scanner.next(); // Lê a resposta do usuário como String
        
        if (resposta.equals("c") || resposta.equals("C")) {
            System.out.println("Descascando a batata... ");
        } else {
            System.out.println("Coloque o avental!");
            System.out.println("Descascando a batata... ");
        }
        
        System.out.print("Continuar? [S/N] ");
        resposta = scanner.next();
        // Se a resposta for "s" ou "S", irá acessar a estrutura de repetição while e no if para acrescentar
        // mais uma batata e irá perguntar novamente se deseja continuar e caso sim, o mesmo procedimento vai
        // repetir até que a resposta seja diferente:
        while(resposta.equals("s") || resposta.equals("S")) {
        	if(resposta.equals("s") || resposta.equals("S")) {
        		System.out.println("Descascando mais batatas... Deseja continuar? [S/N] ");
        		resposta = scanner.next();
        		contador++;
        	}
        }
        // Após o termino, será apresentado quantas batatas você descascou!
        System.out.println("Você descascou no total: " + contador + " batatas.");
        
        scanner.close(); 
    }
}

