/* 10 exercicios simples: Estrutura condicional.
 * 
 * Exercicio 01) Par ou Ímpar:
 * Solicite um número ao usuário e determine se é par ou ímpar.
 * Exercicio 02) Maior entre Três Números:
 * Peça ao usuário para inserir três números e determine qual é o maior.
 * Exercicio 03) Dia da Semana:
 * Solicite ao usuário um número de 1 a 7 e exiba o dia da semana correspondente (1 para Domingo, 2 para Segunda, etc.).
 * Exercicio 04) Aprovação ou Reprovação:
 * Solicite a nota de um aluno e determine se ele foi aprovado (nota maior ou igual a 7) ou reprovado.
 * Exercicio 05) Idade em Categorias:
 * Peça a idade do usuário e classifique-a em categorias: criança (0-12), adolescente (13-17), adulto (18-64) e idoso (65 ou mais).
 * Exercicio 06) Triângulo:
 * Solicite ao usuário os três lados de um triângulo e determine se é equilátero, isósceles ou escaleno.
 * Exercicio 07) Bônus Salarial:
 * Solicite o salário de um funcionário e seu tempo de serviço. Se o tempo de serviço for superior a 5 anos, conceda um bônus de 10% ao salário.
 * Exercicio 08) Tipo de Número:
 * Solicite um número e determine se é positivo, negativo ou zero.
 * Exercicio 09) Calculadora Simples:
 * Solicite dois números e uma operação (adição, subtração, multiplicação ou divisão) e exiba o resultado da operação.
 * Exercicio 10) Mês do Ano:
 * Solicite ao usuário um número de 1 a 12 e exiba o mês correspondente.
 * */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);

		int diadasemana, idade, escolha, mes = 0;

		System.out.println("EXERCICIO 01:");
		System.out.print("Informe um numero: ");
		int numero = keyboard.nextInt();
		System.out.println();
		System.out.println("RESULTADO: ");
		if (numero % 2 == 0) {
			System.out.println(numero + " Eh PAR");
		} else {
			System.out.println(numero + " Eh IMPAR");
		}

		System.out.println();
		System.out.println("-------------------");
		System.out.println("EXERCICIO 02:");
		System.out.println("Informe 3 numeros: ");
		System.out.print("Primeiro numero: ");
		int primeiro = keyboard.nextInt();
		System.out.print("Segundo numero: ");
		int segundo = keyboard.nextInt();
		System.out.print("Terceiro numero: ");
		int terceiro = keyboard.nextInt();
		System.out.println();
		System.out.println("RESULTADO: ");
		if (primeiro > segundo && primeiro > terceiro) {
			System.out.print("O maior numero: " + primeiro);
		} else if (segundo > terceiro) {
			System.out.print("O maior numero: " + segundo);
		} else {
			System.out.print("O maior numero: " + terceiro);
		}

		do {
			System.out.println();
			System.out.println("-------------------");
			System.out.println("EXERCICIO 03:");
			System.out.print("Informe um numero de 1 a 7: ");
			diadasemana = keyboard.nextInt();
			System.out.println();
			System.out.println("RESULTADO: ");
			switch (diadasemana) {
			case 1:
				System.out.println("Hoje eh domingo!");
				break;
			case 2:
				System.out.println("Hoje eh segunda-feira!");
				break;
			case 3:
				System.out.println("Hoje eh terceira-feira!");
				break;
			case 4:
				System.out.println("Hoje eh quarta-feira!");
				break;
			case 5:
				System.out.println("Hoje eh quinta-feira!");
				break;
			case 6:
				System.out.println("Hoje eh sexta-feira!");
				break;
			case 7:
				System.out.println("Hoje eh sabado!");
				break;
			default:
				System.out.println("Numero invalido");
				break;
			}
		} while (diadasemana < 1 || diadasemana > 7);

		System.out.println();
		System.out.println("-------------------");
		System.out.println("EXERCICIO 04:");
		System.out.print("Informe a nota do aluno: ");
		int nota = keyboard.nextInt();
		System.out.println();
		System.out.println("RESULTADO: ");
		if (nota >= 7) {
			System.out.println("APROVADO!");
		} else {
			System.out.println("REPROVADO!");
		}

		do {
			System.out.println();
			System.out.println("-------------------");
			System.out.println("EXERCICIO 05:");
			System.out.print("Informe a sua idade: ");
			idade = keyboard.nextInt();
			System.out.println();
			System.out.println("RESULTADO: ");
			if (idade >= 0 && idade <= 12) {
				System.out.println("Classificacao: crianca");
			} else if (idade >= 13 && idade <= 17) {
				System.out.println("Classificacao: adolescente");
			} else if (idade >= 18 && idade <= 64) {
				System.out.println("Classificacao: adulto");
			} else if (idade >= 65) {
				System.out.println("Classificacao: idoso");
			} else {
				System.out.println("Idade invalida.");
			}
		} while (idade < 0);

		System.out.println();
		System.out.println("-------------------");
		System.out.println("EXERCICIO 06:");
		System.out.println("Informe os 3 lados de um triangulo: ");
		System.out.print("Primeiro: ");
		int trianguloPrimeiroLado = keyboard.nextInt();
		System.out.print("Segundo: ");
		int trianguloSegundoLado = keyboard.nextInt();
		System.out.print("Terceiro: ");
		int trianguloTerceiroLado = keyboard.nextInt();
		System.out.println();
		System.out.println("RESULTADO: ");
		if (trianguloPrimeiroLado == trianguloSegundoLado && trianguloPrimeiroLado == trianguloTerceiroLado) {
			System.out.println("Esse triangulo eh Equilatero.");
		} else if (trianguloPrimeiroLado != trianguloSegundoLado && trianguloPrimeiroLado != trianguloTerceiroLado) {
			System.out.println("Esse triangulo eh Escaleno.");
		} else {
			System.out.println("Esse triangulo eh Isosceles.");
		}

		System.out.println();
		System.out.println("-------------------");
		System.out.println("EXERCICIO 07:");
		System.out.print("Informe o seu salario: R$ ");
		double salario = keyboard.nextDouble();
		System.out.print("Informe o tempo de servico: ");
		int tempoSerico = keyboard.nextInt();
		System.out.println();
		System.out.println("RESULTADO: ");
		if (tempoSerico >= 5) {
			double aumentoSalario = salario * 0.10;
			double novoSalario = salario + aumentoSalario;
			System.out.printf("Ajuste de 10%% = R$ %.2f%n", aumentoSalario);
			System.out.printf("Novo salario R$ %.2f%n", novoSalario);
		} else {
			System.out.println("Voce possui menos de 5 anos de serivo, por isso nao tera aumento de 10% no momento.");
		}

		System.out.println();
		System.out.println("-------------------");
		System.out.println("EXERCICIO 08:");
		System.out.print("Informe um numero: ");
		int umNumero = keyboard.nextInt();
		System.out.println();
		System.out.println("RESULTADO: ");
		if (umNumero >= 1) {
			System.out.println("Numero POSITIVO!");
		} else if (umNumero < 0) {
			System.out.println("Numero NEGATIVO!");
		} else {
			System.out.println("Numero " + umNumero);
		}

		System.out.println();
		System.out.println("-------------------");
		System.out.println("EXERCICIO 09:");
		System.out.print("Informe um valor: ");
		int valorUm = keyboard.nextInt();
		System.out.print("Informe outro valor: ");
		int valorDois = keyboard.nextInt();
		do {
			System.out.println("Escolha qual tipo de operacao deseja calcular:");
			System.out.println("[1] Adicao");
			System.out.println("[2] Subtracao");
			System.out.println("[3] Multiplicacao ");
			System.out.println("[4] Divisao");
			escolha = keyboard.nextInt();
			System.out.println();
			System.out.println("RESULTADO: ");
			switch (escolha) {
			case 1:
				int soma = valorUm + valorDois;
				System.out.println(valorUm + " + " + valorDois + " = " + soma);
				break;
			case 2:
				int subtracao = valorUm - valorDois;
				System.out.println(valorUm + " - " + valorDois + " = " + subtracao);
				break;
			case 3:
				int multiplicacao = valorUm * valorDois;
				System.out.println(valorUm + " * " + valorDois + " = " + multiplicacao);
				break;
			case 4:
				int divisao = valorUm / valorDois;
				System.out.println(valorUm + " / " + valorDois + " = " + divisao);
				break;
			default:
				System.out.println("Opcao invalida!");
				break;
			}
		} while (escolha < 1 || escolha > 4);

		System.out.println();
		System.out.println("-------------------");
		System.out.println("EXERCICIO 10:");
		do {
			System.out.print("Informe um numero de 1 a 12: ");
			mes = keyboard.nextInt();
			System.out.println();
			System.out.println("RESULTADO: ");
			switch (mes) {
			case 1:
				System.out.println("Mes Janeiro");
				break;
			case 2:
				System.out.println("Mes Fevereiro");
				break;
			case 3:
				System.out.println("Mes Marco");
				break;
			case 4:
				System.out.println("Mes Abril");
				break;
			case 5:
				System.out.println("Mes Maio");
				break;
			case 6:
				System.out.println("Mes Junho");
				break;
			case 7:
				System.out.println("Mes Julho");
				break;
			case 8:
				System.out.println("Mes Agosto");
				break;
			case 9:
				System.out.println("Mes Setembro");
				break;
			case 10:
				System.out.println("Mes Outubro");
				break;
			case 11:
				System.out.println("Mes Novembro");
				break;
			case 12:
				System.out.println("Mes Dezembro");
				break;
			default:
				System.out.println("Numero invalido.");
				break;
			}
		} while (mes < 1 || mes > 12);
		
		System.out.println("FIM");

		keyboard.close();

	}

}
