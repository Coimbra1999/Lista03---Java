package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private String cliente;
    private List<Produto> produtos;

    public Carrinho(String cliente, List<Produto> produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
    }
    
    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }
    
    public Integer getQuantidade(){
    return produtos.size();
    }
    
    public void adicionar(Produto produto){
        produtos.add(produto);
    }
    
    public Boolean existsPorNome(String nome){
        for (Produto produto : produtos) {
            if(produto.getNome().equals(nome)){
                return true;
            }
        }
        return false;
    }
    
    public Integer getQuantidadePorCategoria(String nome){
        Integer quantidade = 0;
        for (Produto produto : produtos) {
            if(produto.getCategoria().equals(nome)){
                quantidade++;
            }
        }
    return quantidade;
    }
    
    public void limpar(){
        produtos.clear();
        System.out.println(produtos.size());
    }
    
    public void removerPorNome(String nome){
        for (Produto produto : produtos) {
            if(produto.getNome().equals(nome)){
                System.out.println("Produto removido: " + produto.getNome());
                produtos.remove(produto);
            }
        }
    }
    
    public Produto getPorNome(String nome){
        for (Produto produto : produtos) {
            if(produto.getNome().equals(nome)){
                System.out.println("Produto: " + produto.getNome()
                + "\nCategoria: " + produto.getCategoria() + "\nValor: " + produto.getPreco());
            }
        }
    return null;
    }
    
    public Double getValorTotal(){
        Double total = 0.0;
        for (Produto produto : produtos) {
            total+=produto.getPreco();
        }
    return total;
    }

}
