
package school.sptech.lista02;

import java.util.Scanner;

public class Tabuada {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        Integer numero = leitor.nextInt();
        
        System.out.println("Tabuda do " + numero);
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " X " + (i) + " = " + numero*i);
        }
        System.out.println("Fim da execução.");
    }
    
}
