package school.sptech.exercicio.personagem;

public class Confronto {
    
    public static void lutar(Heroi heroi, Vilao vilao){
        if(heroi != null && vilao != null){
            if(heroi.getForcaTotal() > vilao.getForcaTotal()){
                System.out.println("O vencedor é: " + heroi.toString());
            }else if(heroi.getForcaTotal() < vilao.getForcaTotal()){
                System.out.println("O vencedor é: " + vilao.toString());
            }else{
                System.out.println("O confronto terminou empatado!");
            }
        }
    }
    
}
