package app;

public class ExemploSemEnum {
    public static void main(String[] args) {
        String hoje = "QUARTA";

        if (hoje.equals("SABADO") || hoje.equals("DOMINGO")) {
            System.out.println("É fim de semana!");
        } else {
            System.out.println("Não é fim de semana.");
        }
    }
}

