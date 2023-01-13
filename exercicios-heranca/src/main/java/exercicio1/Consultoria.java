package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {
    
    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> desenvolvedores;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedores = new ArrayList<>();
    }
    
    public Boolean existePornome(String nome){
        for (Desenvolvedor devs : desenvolvedores) {
            if(devs.getNome().equalsIgnoreCase(nome)){
               return true;
            }
        }
        
        return false;
    }
    
    public void contratar(Desenvolvedor desenvolvedor){
            if(desenvolvedores.size() < vagas){
                desenvolvedores.add(desenvolvedor);
            }else{
                System.out.println("Sem vagas disponíveis!");
            }
    }
    
    public Integer getQuantidadeDesenvolvedores(){
        return desenvolvedores.size();
    }
    
    public Integer getQuantidadeDesenvolvedoresMobile(){
        Integer qtdMobile = 0;
        for (Desenvolvedor devs : desenvolvedores) {
            if(devs instanceof DesenvolvedorMobile){
                qtdMobile++;
            }
        }
        return qtdMobile;
    }
    
    public Double getTotalSalarios(){
        Double total = 0.0;
        for (Desenvolvedor devs : desenvolvedores) {
            total+=devs.getSalario();
        }
        return total;
    }
    
    public Desenvolvedor buscarDesenvolvedorPorNome(String nome){
        for (Desenvolvedor devs : desenvolvedores) {
            if(devs.getNome().equalsIgnoreCase(nome)){
                return devs;
        }
        }
        return null;
    }

    @Override
    public String toString() {
        return "\n"+"-".repeat(50) +
               "\nnome: " + nome +
               "\nvagas: " + vagas + 
               "\ndesenvolvedores: " + desenvolvedores +
               "\n"+"-".repeat(50);
    }
}