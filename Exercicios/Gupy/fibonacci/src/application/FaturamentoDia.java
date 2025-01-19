package application;

public class FaturamentoDia {
    private int dia;
    private double faturamento;

    public FaturamentoDia(int dia, double faturamento) {
        this.dia = dia;
        this.faturamento = faturamento;
    }

    public int getDia() {
        return dia;
    }

    public double getFaturamento() {
        return faturamento;
    }
}

