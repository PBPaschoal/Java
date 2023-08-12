// Outra versão, mais com algumas coisas diferentes.

package maisbatatas;
import java.util.Scanner;

public class DescascandoBatatas {
    public static void descascarBatatas() {
        int contador = 1;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Continuar? [S/N] ");
        String resposta = scanner.next();
        
        while (resposta.equalsIgnoreCase("s")) {
            System.out.println("Descascando mais batatas... Deseja continuar? [S/N] ");
            resposta = scanner.next();
            contador++;
        }
        
        System.out.println("Você descascou no total: " + contador + " batatas.");
        
        scanner.close();
    }
}