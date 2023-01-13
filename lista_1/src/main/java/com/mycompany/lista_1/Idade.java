
package com.mycompany.lista_1;

import java.util.Scanner;

public class Idade {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        String nome = leitor.nextLine();
        
        System.out.println("Ola, " + nome + "! Qual o ano de seu nascimento?");
        Integer ano = leitor.nextInt();
        
        System.out.println("Em 2030 voce tera " + (2030-ano) + " anos.");
    }
    
}
