// Dia 05/11/2023 às 01:50hrs
// Utilizando IntelliJ IDEA
// Exercício criando pela IA ChatGPT, aonde ela informa o enunciado e eu desenvolvo o programa. Sem pedir/copiar resultado.
// Exercício 7: Verificar um Ano Bissexto
// Desenvolva um programa que peça ao usuário que insira um ano e determine se o ano é bissexto ou não. Um ano bissexto
// é aquele que é divisível por 4, exceto os divisíveis por 100, a menos que sejam divisíveis por 400.

import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Informe um ano: ");
        int inserirAno = keyboard.nextInt();

        if((inserirAno % 4 == 0 && inserirAno % 100 != 0) || (inserirAno % 400 == 0)){
            System.out.print("Ano " + inserirAno + " eh bissexto.");
        } else {
            System.out.println("Esse nao eh um ano bissexto.");
        }

        keyboard.close();
    }
}
