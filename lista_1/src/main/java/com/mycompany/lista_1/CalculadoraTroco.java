
package com.mycompany.lista_1;

import java.util.Scanner;

public class CalculadoraTroco {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o valor unitario do seu produto: ");
        Double valor = leitor.nextDouble();
        
        System.out.println("Informe a quantidade vendida: ");
        Integer quantidade = leitor.nextInt();
        
        System.out.println("Informe o valor pago pelo cliente: ");
        Double pago = leitor.nextDouble();
        
        Double preco = quantidade*valor;
        
        Double troco = pago-preco;
        
        System.out.println("Seu troco sera de R$" + troco);
    }
    
}
