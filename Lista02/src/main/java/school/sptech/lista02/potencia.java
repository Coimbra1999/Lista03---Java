
package school.sptech.lista02;

import java.util.Scanner;

public class potencia {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Integer base, potencia, res = 1;
        
        System.out.println("Informe a base: ");
        base = input.nextInt();
        
        System.out.println("Informe a potencia: ");
        potencia = input.nextInt();
        
        for (int i = potencia; i >= 1; i--) {
            res = res * base;
        }
        System.out.println("Resultado: " + res);
    }
    
}
