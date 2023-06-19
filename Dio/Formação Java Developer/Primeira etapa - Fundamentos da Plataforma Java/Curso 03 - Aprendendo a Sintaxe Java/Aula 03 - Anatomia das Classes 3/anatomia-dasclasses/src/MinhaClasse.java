public class MinhaClasse {

    public static void main(String[] args){
        String primeiroNome = "Bruno";
        String segndoNome = "Paschoal";

        String nomeCompleto = nomeCompleto(primeiroNome, segndoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}