
package com.mycompany.lista05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inteiros {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        List<Integer> inteiros = new ArrayList();
        
        Integer numeroDigitado;
        Integer soma = 0;
        Integer menor = 9999;
        Integer maior = -9999;
        
        do{
            System.out.println("Informe um número inteiro: ");
            numeroDigitado = in.nextInt();
            if(numeroDigitado != 0){
            inteiros.add(numeroDigitado);
            };
            
            if(numeroDigitado == 0){
            
                System.out.println("Números pares: ");
                
            for (int i = 0; i < inteiros.size(); i++) {
                if(inteiros.get(i) % 2 == 0){
                    System.out.println(inteiros.get(i));
                };
            }
                System.out.println("Números ímpares: ");
                
            for (int j = 0; j < inteiros.size(); j++) {
                if(inteiros.get(j) % 2 != 0){
                    System.out.println(inteiros.get(j));
                };
            }
                
                for (int k = 0; k < inteiros.size(); k++) {
                    soma += inteiros.get(k); 
                    
                    if(inteiros.get(k) > maior){
                        maior = inteiros.get(k);
                    };
                    if(inteiros.get(k) < menor){
                        menor = inteiros.get(k);
                    };
                };
                
                System.out.println("Soma dos números informados: " + soma);
                System.out.println("Menor número da lista: " + menor);
                System.out.println("Maior número da lista: " + maior);
            };
        }while(numeroDigitado != 0);
    }
}
