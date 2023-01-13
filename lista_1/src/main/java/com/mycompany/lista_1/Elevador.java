
package com.mycompany.lista_1;

import java.util.Scanner;

public class Elevador {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe  o limite de peso de um elevador: ");
        Double peso = leitor.nextDouble();
        
        System.out.println("Informe  o limite de pessoas do elevador: ");
        Integer pessoas = leitor.nextInt();
        
        System.out.println("Informe o peso da 1 pessoa que entrou "
                + "no elevador: ");
        Double primeira = leitor.nextDouble();
        
        System.out.println("Informe o peso da 2 pessoa que entrou "
                + "no elevador: ");
        Double segunda = leitor.nextDouble();
        
        System.out.println("Informe o peso da 3 pessoa que entrou "
                + "no elevador: ");
        Double terceira = leitor.nextDouble();
        
        System.out.println("Entraram 3 pessoas no elevador, no qual "
                + "cabem " + pessoas + " pessoas.");
        
        System.out.println("O peso total no elevador é de " + (primeira+
                segunda+terceira)
                + ", sendo que ele suporta " + peso);
        
        
    }
    
}
