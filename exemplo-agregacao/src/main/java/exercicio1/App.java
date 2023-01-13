package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        
        Carrinho carrinho1 = new Carrinho("Guilherme");
        
        Produto produto1 = new Produto("Frango", "Alimento", 20.0);
        Produto produto2 = new Produto("Pão", "Alimento", 4.0);
        Produto produto3 = new Produto("Sabão", "Limpeza", 10.0);
        
        carrinho1.adicionar(produto1);
        carrinho1.adicionar(produto2);
        carrinho1.adicionar(produto3);
        
        List<Produto> produtos = new ArrayList<>();
        
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        
        Carrinho carrinho2 = new Carrinho("Diego", produtos);
        
        System.out.println(carrinho1.getQuantidade());
        
        System.out.println(carrinho1.existsPorNome("Sabão"));
        
        System.out.println(carrinho1.getQuantidadePorCategoria("Alimento"));
        
        carrinho1.getPorNome("Frango");
        
        System.out.println(carrinho1.getValorTotal());
        
        carrinho1.removerPorNome("Pão");
        
        carrinho1.limpar();
    }
    
}
