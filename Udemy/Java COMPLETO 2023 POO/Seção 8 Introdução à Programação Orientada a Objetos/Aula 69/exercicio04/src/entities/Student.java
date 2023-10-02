// Aula 69
// Exercício 04
// 
// Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres 
// do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual 
// a nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em 
// caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota).
// Você deve criar uma classe Student para resolver este problema.
// 
// Exemplos:
// 
// Entrada:        Saída:
// Alex Green      FINAL GRADE = 90.00
// 27.00           PASS
// 31.00 
// 32.00
// 
// Entrada:        Saída:
// 17.00           FINAL GRADE = 52.00
// 20.00           FAILED
// 15.00           MISSING 8.00 POINTS

package entities;

public class Student {

    public String aluno;
    public double notaPrimeiro;
    public double notaSegundo;
    public double notaTerceiro;

    public double notaTotal() {
        return notaPrimeiro + notaSegundo + notaTerceiro;
    }

    public double restante() {
        return 60.00 - notaTotal();
    }

    @Override
    public String toString() {
        double notaTotal = notaTotal();
        if (notaTotal >= 60.00) {
            return String.format("%.2f", notaTotal) + "\nPASS";
        } else {
            return String.format("%.2f", notaTotal) + "\nFAILED\nMISSING " + String.format("%.2f", restante()) + " POINTS";
        }
    }
}
