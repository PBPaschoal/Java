// Dia 05/11/2023 às 01:25hrs
// Utilizando IntelliJ IDEA
// Exercício criando pela IA ChatGPT, aonde ela informa o enunciado e eu desenvolvo o programa. Sem pedir/copiar resultado.
// Exercício 5: Conversor de Temperatura
// Crie um programa que permita ao usuário converter uma temperatura de graus Celsius para graus Fahrenheit. A fórmula para a conversão é:
// Fahrenheit = (Celsius × 9/5) + 32.

import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Informe a temperatura em graus Celsius: ");
        double temperaturaCelsius = keyboard.nextDouble();

        double temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;

        System.out.printf("TEMPERATURA CONVERTIDA EM FAHRENHEIT: %.2f", temperaturaFahrenheit);

        keyboard.close();
    }
}
