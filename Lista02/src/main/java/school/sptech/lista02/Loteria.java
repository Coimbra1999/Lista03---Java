
package school.sptech.lista02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
      
        Integer Digitado;
        Boolean isCondicao = true;
            
            do {
                System.out.println("Informe um número de 0 a 10: ");
                Digitado = leitor.nextInt();
                
            if (Digitado < 0 || Digitado > 10) {                    
                System.out.println("O número digitado não é válido!"); 
            }else {
            isCondicao = false;
            }     
            }while (isCondicao);
                    
        Integer Random = 0;
        Integer Vezes = 0;
        
        do {
        Random = ThreadLocalRandom.current().nextInt(0, 11);
            System.out.println(Random);
            Vezes++;
        }while (Random != Digitado);
        
        if (Vezes <= 3) {
            System.out.println("Você é MUITO sortudo");
        }else if (Vezes <= 10) {
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
        }        
    }
