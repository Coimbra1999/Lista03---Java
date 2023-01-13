package school.sptech.exercicio.personagem;

import java.util.List;

public class Vilao extends Personagem{

    public Vilao(String codinome, String nome, List<SuperPoder> poderes) {
        super(codinome, nome, poderes);
    }
    
    @Override
    public Double getForcaTotal() {
        Double total = 0.0;
        for (SuperPoder poder : poderes) {
            total+=poder.getCategoria();
        }
        return total;
    }
    
}
