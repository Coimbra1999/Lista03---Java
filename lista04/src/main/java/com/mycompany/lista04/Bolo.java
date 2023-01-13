
package com.mycompany.lista04;

public class Bolo {

    private String sabor;
    private Double valor = 0.0;
    private Integer quantidadeVendida = 0;

    void comprarBolo(Integer quantidade){
        if(quantidade > 100 || quantidadeVendida > 100){ 
        System.out.println("Seu pedido ultrapassou nosso limite "
                + "diário para esse bolo.");
    }else{
        quantidadeVendida += quantidade;
        }
    }
    void exibirRelatorio(String sabor, Integer quantidade, Double valor){
        System.out.println("O bolo sabor " + sabor + " foi comprado " + quantidade +
                " vezes hoje, totalizando R$ " + valor*quantidade);
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(Integer quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }
    
}
