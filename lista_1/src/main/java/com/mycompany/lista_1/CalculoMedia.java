
package com.mycompany.lista_1;

import java.util.Scanner;

public class CalculoMedia {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o nome: ");
        String nome = leitor.nextLine();
        
        System.out.println("Informe a primeira nota :");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Informe a segunda nota :");
        Double nota2 = leitor.nextDouble();
        
        Double media = (nota1+nota2)/2;
        
        System.out.println("Ola, " + nome + ". Sua media foi de " + media);
    }
    
}
