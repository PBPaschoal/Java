// Dia 05/11/2023 às 13:09hrs
// Utilizando IntelliJ IDEA
// Exercício criando pela IA ChatGPT, aonde ela informa o enunciado e eu desenvolvo o programa. Sem pedir/copiar resultado.
// Exercício 12: Palíndromo
// Crie um programa que peça ao usuário uma palavra ou frase e determine se ela é um palíndromo, ou seja, se pode ser lida
// da mesma forma de trás para frente.

import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String textoOriginal = keyboard.nextLine();

        textoOriginal = textoOriginal.replaceAll(" ", "").toLowerCase();

        String textoReverso = new StringBuilder(textoOriginal).reverse().toString();

        if(textoReverso.equals(textoOriginal)){
            System.out.println("Eh um Palindromo.");
        } else {
            System.out.println("Nao eh um Palindromo.");
        }

        keyboard.close();
    }
}
