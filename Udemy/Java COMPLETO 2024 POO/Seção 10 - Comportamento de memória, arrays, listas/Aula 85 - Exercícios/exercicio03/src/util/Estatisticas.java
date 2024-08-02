package util;
import entities.Pessoa;

public class Estatisticas {
    private Pessoa[] pessoas;

    public Estatisticas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public double calcularAlturaMedia() {
        double somaAlturas = 0;
        for (Pessoa pessoa : pessoas) {
            somaAlturas += pessoa.getAltura();
        }
        return somaAlturas / pessoas.length;
    }

    public double calcularPorcentagemMenoresDe16() {
        int countMenoresDe16 = 0;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() < 16) {
                countMenoresDe16++;
            }
        }
        return (double) countMenoresDe16 / pessoas.length * 100;
    }

    public void mostrarEstatisticas() {
        double alturaMedia = calcularAlturaMedia();
        double porcentagemMenoresDe16 = calcularPorcentagemMenoresDe16();

        System.out.printf("Altura media: %.2f%n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagemMenoresDe16);

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() < 16) {
                System.out.println(pessoa.getNome());
            }
        }
    }
}
