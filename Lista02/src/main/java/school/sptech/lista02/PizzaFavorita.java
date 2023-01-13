
package school.sptech.lista02;

import java.util.Scanner;


public class PizzaFavorita {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        Integer digitado;
        Integer vezes = 0;
        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroQueijos = 0;
        
        do {
        System.out.println("\n" +
                "[5] - Mussarela \n"
                + "[25] - Calabresa \n"
                + "[50] - Quatro queijos \n \n"
                + "Dígite o número que corresponde à sua pizza favorita: ");
        digitado = in.nextInt();
        
        if (digitado != 5 && digitado != 25 && digitado != 50) {
            System.out.println("Informe um numero valido!");
        }else {
            
             switch (digitado) {
                case 5:
                    mussarela++;
                    break;
                case 25:
                    calabresa++;
                    break;
                default:
                    quatroQueijos++;
                    break;
            }   
            vezes++;
        }                   
        } while(vezes < 10);
        
        System.out.println("Quantidade de votos no sabor mussarela: " + 
                mussarela + "\n"
        + "Quantidade de votos no sabor calabresa: " + calabresa + "\n"
        + "Quantidade de votos no sabor quatro queijos: " + quatroQueijos);
        
        if (mussarela > calabresa && mussarela > quatroQueijos) {
            System.out.println("O sabor mais votado foi mussarela!");
        }
        if (calabresa > mussarela && calabresa > quatroQueijos) {
            System.out.println("O sabor mais votado foi calabresa!");
        }
        if (quatroQueijos > calabresa && quatroQueijos > mussarela) {
            System.out.println("O sabor mais votado foi quatro queijos!");
        }
    }
}
