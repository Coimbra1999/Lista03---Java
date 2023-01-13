
package school.sptech.lista02;

import java.util.Scanner;

public class Acumulador {
    
    public static void main(String[] args) {
    
    Scanner leitor = new Scanner(System.in);
          
    Integer numero = 0;
    Integer Soma = 0;
          
    System.out.println("Digite um número");
    Integer Digitado = leitor.nextInt();
    Soma += Digitado;
    
    do {
          System.out.println("Acerte o número");
              Digitado = leitor.nextInt();
              Soma += Digitado;
          } while (Digitado != numero);
    
          System.out.println("Soma dos números digitados: " + Soma);
}
}