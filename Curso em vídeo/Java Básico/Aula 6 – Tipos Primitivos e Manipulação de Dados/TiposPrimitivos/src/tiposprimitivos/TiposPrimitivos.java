package tiposprimitivos;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Bruna Sene
 */
public class TiposPrimitivos {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Informe o nome do aluno: ");
        String nome = keyboard.nextLine();
        System.out.print("Informe a nota do aluno: ");
        float nota = keyboard.nextFloat();
        
        System.out.format("O Aluno %s, tirou a nota %.2f\n",nome, nota);
        
        keyboard.close();
    }
    
}
