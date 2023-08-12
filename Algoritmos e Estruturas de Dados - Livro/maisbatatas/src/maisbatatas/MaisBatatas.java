// Dia 11 de agosto de 2023
// Livro Algoritmos e Estruturas de Dados 17º TIRAGEM - Guimarães / Lages
// Ciência de Computação -Livros Técnicos e Cientificos Editora S.A
// Praticando Lógica de Programação inspirado em exemplos exercicios do livro, utilizando Java
// Outra versão, mais com algumas coisas diferentes.

package maisbatatas;
import java.util.Scanner;

public class MaisBatatas {
    public static void main(String[] args) {
        System.out.println("Traga a cesta com batatas do porão");
        System.out.println("Traga a panela do armário");
        System.out.print("A sua roupa é clara ou escura: [C/E]? ");
        
        Scanner scanner = new Scanner(System.in);
        String resposta = scanner.next();
        
        if (resposta.equalsIgnoreCase("c")) {
            System.out.println("Descascando a batata... ");
        } else {
            System.out.println("Coloque o avental!");
            System.out.println("Descascando a batata... ");
        }
        
        DescascandoBatatas.descascarBatatas(); // Chamando o método da outra classe
        
        scanner.close(); 
    }
}