
package com.mycompany.lista_1;

import java.util.Scanner;

public class Calorias {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o tempo, em minutos que voce passou se aquecendo: ");
        Integer aquecimento = leitor.nextInt();
        
        System.out.println("Informe o tempo, em minutos que voce passou em aerobico: ");
        Integer aerobico = leitor.nextInt();
        
        System.out.println("Informe o tempo, em minutos que voce passou em musculacao: ");
        Integer musculacao = leitor.nextInt();
        
        Integer minutos = aquecimento + aerobico + musculacao;
        
        Integer total = (aquecimento*12) + (aerobico*50) + (musculacao*25);
        
        System.out.println("Olá. Você fez um total de " + minutos + " minutos de exercícios e "
                + "perdeu cerca de " + total + " calorias");
    }
    
}
