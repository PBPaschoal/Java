import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class Program {
    public static void main(String[] args) {	
        // Simulando um JSON de faturamento diário
        String jsonFaturamento = """
                [
                    {"dia": 1, "faturamento": 200.0},
                    {"dia": 2, "faturamento": 300.0},
                    {"dia": 3, "faturamento": 0.0},
                    {"dia": 4, "faturamento": 450.0},
                    {"dia": 5, "faturamento": 0.0},
                    {"dia": 6, "faturamento": 600.0},
                    {"dia": 7, "faturamento": 0.0},
                    {"dia": 8, "faturamento": 700.0},
                    {"dia": 9, "faturamento": 0.0}
                ]
                """;

        // Parse do JSON para lista de objetos
        Gson gson = new Gson();
        Type listType = new TypeToken<List<FaturamentoDia>>() {}.getType();
        List<FaturamentoDia> faturamentos = gson.fromJson(jsonFaturamento, listType);

        // Instancia FaturamentoMensal
        FaturamentoMensal faturamentoMensal = new FaturamentoMensal(faturamentos);

        // Cálculos
        double menorFaturamento = faturamentoMensal.calcularMenorFaturamento();
        double maiorFaturamento = faturamentoMensal.calcularMaiorFaturamento();
        double mediaMensal = faturamentoMensal.calcularMediaMensal();
        long diasAcimaDaMedia = faturamentoMensal.contarDiasAcimaDaMedia();

        // Exibição dos resultados
        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Média mensal: " + mediaMensal);
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}
