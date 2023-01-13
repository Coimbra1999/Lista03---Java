package school.sptech.exercicio.personagem;

import java.util.List;

public abstract class Personagem {
    
    private String codinome;
    private String nome;
    List<SuperPoder> poderes;

    public Personagem(String codinome, String nome, List<SuperPoder> poderes) {
        this.codinome = codinome;
        this.nome = nome;
        this.poderes = poderes;
    }
    
    public void adicionaPoder(String nome, Integer categoria){
        if(nome != null && categoria != null){
        SuperPoder poder = new SuperPoder(nome, categoria);
        poderes.add(poder);
        }
    }
    
    public abstract Double getForcaTotal();

    public String getCodinome() {
        return codinome;
    }

    public String getNome() {
        return nome;
    }

    public List<SuperPoder> getPoderes() {
        return poderes;
    }

    @Override
    public String toString() {
        return "\n"+"-".repeat(30) +
               "\nnome: " + nome + 
               "\ncodinome: " + codinome + 
               "\npoderes:" + poderes.toString() +
               "\n"+"-".repeat(30);
    }
    
}
