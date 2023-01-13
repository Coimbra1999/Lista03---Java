package school.sptech.exercicio.personagem;

public class SuperPoder {
    
    private String nome;
    private Integer categoria;

    public SuperPoder(String nome, Integer categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "\n"+"-".repeat(30) +
               "\nnome do poder: " + nome + 
               "\ncategoria: " + categoria + 
               "\n"+"-".repeat(30);
    }

    public String getNome() {
        return nome;
    }

    public Integer getCategoria() {
        return categoria;
    }
    
    
    
}
