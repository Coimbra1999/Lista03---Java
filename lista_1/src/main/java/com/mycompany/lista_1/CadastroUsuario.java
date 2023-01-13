
package com.mycompany.lista_1;

import java.util.Scanner;

public class CadastroUsuario {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe seu login: ");
        String login = leitor.nextLine();
        
        System.out.println("Informe sua senha ");
        String senha = leitor.nextLine();
        
        System.out.println("Informe a quantidade de vezes que "
                + "você aceita errar a senha antes do bloqueio");
        String erros = leitor.nextLine();
        
        System.out.println("Seu login é: " + login + "\n" + "Sua senha é: "
                + senha + "\n" + "Você tem " + erros + " tentativas antes de ser bloqueado");
        
    }
    
}
