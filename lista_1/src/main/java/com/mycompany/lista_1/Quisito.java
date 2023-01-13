
package com.mycompany.lista_1;

import java.util.Scanner;

public class Quisito {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe quantos filhos de 0 a 3 anos possui.");
        Integer zeroTres = leitor.nextInt();
        
        System.out.println("Informe quantos filhos de 4 a 16 anos possui.");
        Integer quatroDezesseis = leitor.nextInt();
        
        System.out.println("Informe quantos filhos de 17 a 18 anos possui.");
        Integer dezesseteDezoito = leitor.nextInt();
        
        Integer soma = zeroTres + quatroDezesseis + dezesseteDezoito;
        
        Double calculo = (zeroTres*25.12) + (quatroDezesseis*15.88) + 
                (dezesseteDezoito*12.44); 
        
        System.out.println("Você tem um total de: " + soma 
                + " filhos e vai receber R$" + calculo + " de bolsa");
        
    }
    
}
