package application;

import java.util.List;

public class FaturamentoMensal {
    private List<FaturamentoDia> faturamentos;

    public FaturamentoMensal(List<FaturamentoDia> faturamentos) {
        this.faturamentos = faturamentos;
    }

    public double calcularMenorFaturamento() {
        return faturamentos.stream()
                .filter(dia -> dia.getFaturamento() > 0) 
                .mapToDouble(FaturamentoDia::getFaturamento)
                .min()
                .orElse(0);
    }

    public double calcularMaiorFaturamento() {
        return faturamentos.stream()
                .filter(dia -> dia.getFaturamento() > 0) 
                .mapToDouble(FaturamentoDia::getFaturamento)
                .max()
                .orElse(0);
    }

    public double calcularMediaMensal() {
        double soma = faturamentos.stream()
                .filter(dia -> dia.getFaturamento() > 0) 
                .mapToDouble(FaturamentoDia::getFaturamento)
                .sum();

        long diasComFaturamento = faturamentos.stream()
                .filter(dia -> dia.getFaturamento() > 0)
                .count();

        return diasComFaturamento > 0 ? soma / diasComFaturamento : 0;
    }

    public long contarDiasAcimaDaMedia() {
        double media = calcularMediaMensal();
        return faturamentos.stream()
                .filter(dia -> dia.getFaturamento() > media)
                .count();
    }
}
