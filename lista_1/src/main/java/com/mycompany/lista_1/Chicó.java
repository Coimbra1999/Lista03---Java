
package com.mycompany.lista_1;

import java.util.Scanner;

public class Chicó {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe seu salario bruto: ");
        Double salario = leitor.nextDouble();
        
        Double inss = salario*(10/100);
        
        Double ir = salario*(20/100);
        
        System.out.println("Informe o valor da sua conducao de ida: ");
        Double ida = leitor.nextDouble();
        
        Double vt = (ida*2)*(22);
        
        Double bruto = salario-inss-ir-vt;
        
        System.out.println("Seu salario bruto: R$" + salario + ", tem um "
                + "total " + "de R$" + (inss+ir+vt) + " em descontos e recebera "
                        + "um liquido de R$ " + bruto);
    }
    
}
