package operadoresaritmeticos;

import java.util.Locale;
/**
 * @author PBPaschoal
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
	int numero = 10;
	int valor = 4 + numero--;
	int x = 4;
	x *= 2;
        
        float v = 8.9f;
        float b = 8.5f;
        
        double ale = Math.random(); // gera um numero aleatorio de 0.0 a 1.0

        int ar = (int) Math.floor(v); // arredonda para baixo
        int ar2 = (int) Math.ceil(v); // arredonda para cima
        int ar3 = (int) Math.round(b); // arredonda
        
        double ale2 = Math.random();
        int nx = (int) (5 + ale2 * (10-5)); // gera um numero aleatorio de 5 a 10
        
	System.out.println(x);
        System.out.println("A media eh igual a " + m);
	System.out.println(valor);
	System.out.println(numero);
        System.out.println("A media eh igual a " + m);
        System.out.println("8.9 Math.floor: " + ar);
        System.out.println("8.9 Math.ceil: " + ar2);
        System.out.println("8.5 Math.round: " + ar3);
        System.out.println("Math.random: " + ale);
        System.out.println("5 a 10 Math.random: " + nx);
    }
}
