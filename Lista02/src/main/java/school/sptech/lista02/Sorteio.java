
package school.sptech.lista02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        Integer numero;
        Boolean isCondicao = true;
        
        do {
            System.out.println("Informe um número de 0 a 100: ");
            numero = in.nextInt();
        
        if (numero < 0 || numero > 100) {
            System.out.println("O número digitado não é válido!");
        }else {
            isCondicao = false;
        }
        }while (isCondicao);
        
        Integer random = 0;
        Integer vezes = 0;
        Integer pares = 0;
        Integer impares = 0;
        isCondicao = true;
        
        for (int i = 0; i <+ 200; i++) {
            random = ThreadLocalRandom.current().nextInt(0, 101);
            
            if (isCondicao == true){
            if (random == numero) {
                System.out.println("O numero " + numero + " foi sorteado"
                        + ", pela primeira vez, "
                        + "na posição: " + i);
                isCondicao = false;
            }
            }
            if (random % 2 == 0) {
                pares++;
            }else {
                impares++;
            }
        }   
        System.out.println("Quantidade de numeros pares sorteados: "
        + pares + "\n" + "Quantidade de numeros impares sorteados: " + impares);
        
    }
    
}
