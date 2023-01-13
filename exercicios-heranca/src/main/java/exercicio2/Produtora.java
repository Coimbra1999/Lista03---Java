package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Produtora {
    
    private String nome;
    private Integer vagas;
    private List<Ator> atores;

    public Produtora(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.atores = new ArrayList<>();
    }
    
    public Boolean existePornome(String nome){
        for (Ator ator : atores) {
            if(ator.getNome().equalsIgnoreCase(nome)){
               return true;
            }
        }
        
        return false;
    }
    
    public void contratar(Ator ator){
            if(atores.size() < vagas){
                atores.add(ator);
            }else{
                System.out.println("Sem vagas disponíveis!");
            }
    }
    
    public Integer getQuantidadeAtores(){
        return atores.size();
    }
    
    public Integer getQuantidadeProtagonistas(){
        Integer qtdProtagonista = 0;
        for (Ator ator : atores) {
            if(ator instanceof Protagonista){
                qtdProtagonista++;
            }
        }
        return qtdProtagonista;
    }
    
    public Double getTotalSalarios(){
        Double total = 0.0;
        for (Ator ator : atores) {
            total+=ator.getSalario();
        }
        return total;
    }
    
    public Ator buscarAtorPorNome(String nome){
        for (Ator ator : atores) {
            if(ator.getNome().equalsIgnoreCase(nome)){
                return ator;
        }
        }
        return null;
    }

    @Override
    public String toString() {
        return "\n"+"-".repeat(50) +
               "\nnome: " + nome +
               "\nvagas: " + vagas + 
               "\natores: " + atores +
               "\n"+"-".repeat(50);
    }
    
}
