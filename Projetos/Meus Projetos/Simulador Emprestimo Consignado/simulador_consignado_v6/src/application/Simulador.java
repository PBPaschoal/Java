package application;

import java.util.Locale;
import java.util.Scanner;

import usuarios.Autenticacao;
import financas.Bancos;

public class Simulador {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);
        
        Autenticacao autenticacao = new Autenticacao(keyboard);
        
        System.out.println(":::::::::::::::::::::::::::");
        System.out.println(":::::( CADASTRAMENTO ):::::");
        System.out.println(":::::::::::::::::::::::::::");
        
        autenticacao.cadastroInicial();
        
        System.out.println(":::::::::::::::::::::::::::");
        System.out.println("::::: ACESSAR SISTEMA :::::");
        System.out.println(":::::::::::::::::::::::::::");
        
        autenticacao.acessarSistema();
        
        System.out.println("\n:::::::::::::::::::::::::::");
        System.out.println(":::::::::: BANCO ::::::::::");
        System.out.println(":::::::::::::::::::::::::::");
        System.out.println("SELECIONE O BANCO DESEJADO:");
        System.out.println("[1] BANCO BRADESCO");
        System.out.println("[2] BANCO ITAU");
        System.out.println("[3] BANCO DAYCOVAL");
        System.out.println("[4] BANCO OLE");
        System.out.println("[5] BANCO BMG");
        System.out.println("[6] BANCO PAN");
        
        
        keyboard.close();
    }
}
