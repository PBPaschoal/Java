package application;

import java.util.Locale;
import java.util.Scanner;

import usuarios.Autenticacao;

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
        
        keyboard.close();
    }
}
