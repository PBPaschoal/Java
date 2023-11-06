// Dia 06/11/2023 às 15:10hrs: Refiz o exercicio da aula 81 e vale ressaltar que fiz sem consulta a resposta, no maximo pesquisando
// auxilio para relembrar e resolver as minhas duvidas.
// Relembrando o exercicio:
// Aula 81 - Exercício de Fixação
//
// Em um banco, para se cadastrar em uma conta bancária, é necessário informar o número da conta, 
// o nome do titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. 
// Este valor de depósito inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a 
// depositar no momento de abrir sua conta, o depósito inicial não será feito e o saldo inicial da 
// conta será, naturalmente, zero.
// 
// Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. 
// Já o nome do titular ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, 
// por exemplo).
//
// Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para 
// proteger isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. 
// Para cada saque realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo 
// negativo se o saldo não for suficiente para realizar o saque e/ou pagar a taxa.
//
// Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não 
// informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre 
// mostrando os dados da conta após cada operação.
//
// Exemplo 01:
//
// Enter account number: 8532
// Enter account holder: Alex Green
// Is there na initial deposit (y/n) y
// Enter initial deposit value: 500.00
// 
// Account data:
// Account 8532, Holder: Alex Green, Balance: $ 500.00
// 
// Enter a deposit value: 200.00
// Updated account data:
// Account 8532, Holder: Alex Green, Balance: $ 700.00
// 
// Enter a withdraw value: 300.00
// Updated account data:
// Account 8532, Holder: Alex Green, Balance: $ 395.00
// 
// Exemplo 02:
// 
// Enter account number: 7801
// Enter account holder: Maria Brown
// Is there na initial deposit (y/n) n
// 
// Account data:
// Account 7801, Holder: Maria Brown, Balance: $ 0.00
// 
// Enter a deposit value: 200.00
// Updated account data:
// Account 7801, Holder: Maria Brown, Balance: $ 200.00
//
// Enter a withdraw value: 198.00
// Updated account data:
// Account 7801, Holder: Alex Green, Balance: $ -3.00
// Link: https://github.com/PBPaschoal/Java/blob/main/Udemy/Java%20COMPLETO%202023%20POO/Se%C3%A7%C3%A3o%209%20-%20Construtores%2C%20palavra%20this%2C%20sobrecarga%2C%20encapsulamento/Aula%2081%2C%2082%20e%2083%20-%20Exerc%C3%ADcio%20de%20fixa%C3%A7%C3%A3o/course/src/application/Program.java

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Bank;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		double deposito = 0.0;
		
		System.out.print("Digite o número da conta: ");
		int numeroConta = keyboard.nextInt();
		System.out.print("Insira o titular da conta: ");
		keyboard.nextLine();
		String nomeTitular = keyboard.nextLine();
		System.out.print("Existe deposito inicial (s/n)? ");
		char resposta = keyboard.next().charAt(0);
		if(resposta == 's') {
			System.out.print("Insira o valor do depósito inicial: ");
			deposito = keyboard.nextDouble();
		}
		
		Bank banco = new Bank(numeroConta, nomeTitular, deposito);
		
		System.out.println("\nDados da conta:");
		System.out.println(banco);
		
		System.out.print("\nDeseja atualizar o nome do titular? (s/n) "); 
		// A correção do professor não tem essa parte, mas no enunciado do exercicio é solicitado, por isso coloquei.
		resposta = keyboard.next().charAt(0);
		if(resposta == 's') {
			System.out.print("Informe o nome atualizado: ");
			keyboard.nextLine();
			banco.setNomeTitular(keyboard.nextLine());
		}
		
		System.out.print("\nInsira um valor de depósito: ");
		banco.addDeposito(keyboard.nextDouble());
		System.out.println("Dados da conta atualizados:");
		System.out.println(banco);
		
		System.out.print("\nInsira um valor de retirada: ");
		banco.removeSaque(keyboard.nextDouble());
		System.out.println("Dados da conta atualizados:");
		System.out.println(banco);
		
		
		keyboard.close();
		
	}

}
