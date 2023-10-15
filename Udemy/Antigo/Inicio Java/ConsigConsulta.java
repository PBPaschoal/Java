/*
* Aquele programinha de Consignado mas dessa vez em Java. Logo estarei postando uma nova versão dela em Java de novo mas
* com algumas melhorias. Da uma olhada nos posts anteriores em C++
*/

package javaconsigmenor;

import java.util.Scanner;

public class JavaConsigMenor {

    public static void main(String[] args) {
        
        int val1, parcl;
	double brut, comiss, sald, lib;
	String nom = null, cepf = null;
        
        Scanner tecle = new Scanner (System.in);
        
        System.out.println("Escolha o orgao para cadastramento: ");
        System.out.println("[1] = [INSS]: ");
        System.out.println("[2] = [SIAPE]: ");
        System.out.println("[3] = [EXERCITO]: ");
        val1 = tecle.nextInt();
        switch (val1) {
            case 1:
                System.out.println("Voce selecionou INSS");
                comiss = 15;
                break;
            case 2:
                System.out.println("Voce selecionou SIAPE");
                comiss = 18;
                break;
            default:
                System.out.println("Voce seleciomou EXERCITO");
                comiss = 20;
                break;
        }
        System.out.println("Escolha o tipo de operacao para cadastramento: ");
        System.out.println("[1] = [NOVO]: ");
        System.out.println("[2] = [REFINANCIAMENTO]: ");
        val1 = tecle.nextInt();
        if(val1 == 1){
            System.out.println("------------------------------");
            System.out.println("CADASTRAMENTO DE OPERACAO NOVA");
            System.out.println("------------------------------");
            System.out.println("Informe o nome do cliente: ");
            nom = tecle.next();
            System.out.println("Informe o CPF do cliente: ");
            cepf = tecle.next();
            System.out.println("Informe o valor Bruto: ");
            brut = tecle.nextDouble();
            System.out.println("Informe o valor da parcela: ");
            parcl = tecle.nextInt();
            System.out.println("Informe o prazo: ");
            val1 = tecle.nextInt();
            System.out.println("------------------------------");
            System.out.println("------------------------------");
            System.out.println(" RESULTADO DA PROPOSTA ");
            System.out.println("------------------------------");
            System.out.println("------------------------------");
            System.out.println("CLIENTE: " + nom);
            System.out.println("CPF: " + cepf);
            System.out.println("Valor Bruto: " + brut);
            System.out.println("Parcela: " + parcl);
            System.out.println("Prazo: " + val1);
            System.out.println("Porcentagem da Comissao: " + comiss + "%");
            comiss = brut * comiss/100;
            System.out.println("Valor da Comissao: " + comiss);

        } else {
            System.out.println("------------------------------");
            System.out.println("CADASTRAMENTO DE REFINANCIAMENTO");
            System.out.println("------------------------------");
            System.out.println("Informe o nome do cliente: ");
            nom = tecle.next();
            System.out.println("Informe o CPF do cliente: ");
            cepf = tecle.next();
            System.out.println("Informe o valor Bruto: ");
            brut = tecle.nextDouble();
            System.out.println("Informe o valor do Saldo: ");
            sald = tecle.nextDouble();
            System.out.println("Informe o valor da parcela: ");
            parcl = tecle.nextInt();
            System.out.println("Informe o prazo: ");
            val1 = tecle.nextInt();
            System.out.println("------------------------------");
            System.out.println("------------------------------");
            System.out.println(" RESULTADO DA PROPOSTA ");
            System.out.println("------------------------------");
            System.out.println("------------------------------");
            System.out.println("CLIENTE: " + nom);
            System.out.println("CPF: " + cepf);
            System.out.println("Valor Bruto: " + brut);
            System.out.println("Valor do Saldo: " + sald);
            lib = brut - sald;
            System.out.println("Valor Liberado: " + lib);
            System.out.println("Parcela: " + parcl);
            System.out.println("Prazo: " + val1);
            System.out.println("Porcentagem da Comissao: " + (comiss-3) + "%");
            comiss = (brut - sald) * (comiss-3)/100;
            System.out.println("Valor da Comissao: " + comiss);
        }
    }
    
}