package testeprimitivo;
/**
 * @author PBPaschoal
 */
public class TestePrimitivo {

    public static void main(String[] args) {
        int idade = 30;
        String valor = Integer.toString(idade);
        String valor2 = "50";
        int idade2 = Integer.parseInt(valor2);
        String valor3 = "50.6";
        float idade3 = Float.parseFloat(valor3);
        
        System.out.println(valor);
        System.out.println(idade2);
        System.out.println(idade3);
    }
}
