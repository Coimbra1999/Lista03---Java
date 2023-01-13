
package com.mycompany.lista_1;

import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o primeiro numero: ");
        Float priNum = leitor.nextFloat();
        
        System.out.println("Informe o segundo numero: ");
        Float segNum = leitor.nextFloat();
        
        System.out.println("Resultado da soma: " + (priNum + segNum));
        System.out.println("Resultado da subtracao: " + (priNum - segNum));
        System.out.println("Resultado da multiplicacao: " + (priNum * segNum));
        System.out.println("Resultado da divisao: " + (priNum / segNum));
    }
    
}
