package entities;

import java.util.Scanner;

public class DadosVet {
    private String[] vetorName;
    private int[] vetorIdade;
    private int maisvelho;
    private Scanner keyboard = new Scanner(System.in);

    public DadosVet(String[] vetorName, int[] vetorIdade, int maisvelho) {
        this.vetorName = vetorName;
        this.vetorIdade = vetorIdade;
        this.maisvelho = maisvelho;
    }

    public void EntradaDosDados() {
        for (int i = 0; i < vetorName.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            vetorName[i] = keyboard.nextLine();
            System.out.print("Idade: ");
            vetorIdade[i] = keyboard.nextInt();
            keyboard.nextLine();
        }
    }

    public int ObterPessoaMaisVelha() {
        for (int i = 1; i < vetorIdade.length; i++) {
            if (vetorIdade[i] > vetorIdade[maisvelho]) {
                maisvelho = i;
            }
        }
        return maisvelho;
    }
}
