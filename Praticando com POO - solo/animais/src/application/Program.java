package application;

import especie.Mamiferos;

public class Program {

    public static void main(String[] args) {

        Mamiferos mamifero = new Mamiferos();

        mamifero.setNome("Jenna");
        mamifero.setIdade(10);
        mamifero.setSexo('F');

        System.out.println(mamifero.beberAgua());
        System.out.println(mamifero.idadeDoAnimal());
    }
}
