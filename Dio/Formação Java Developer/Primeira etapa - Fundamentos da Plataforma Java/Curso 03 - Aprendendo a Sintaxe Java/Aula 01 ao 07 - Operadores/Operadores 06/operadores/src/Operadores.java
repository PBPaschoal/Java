public class Operadores {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        String nomeUm = "BRUNO";
        String nomeDois = new String("BRUNO");
        String nomeTres = "BRUNA";
        String nomeQuatro = new String("BRUNA");

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);
        
        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior a numeroDois? " + simNao);
        
        simNao = numero1 < numero2;

        System.out.println("numeroUm é menor a numeroDois? " + simNao);

        if(numero1 <= numero2){
            System.out.println("Verdadeira!");
        } else {
            System.out.println("Falsa");
        }

        System.out.println("Nome um e dois : " + (nomeUm == nomeDois));
        System.out.println("Nome três e quatro : " + (nomeTres.equals(nomeQuatro)));
    }
}
