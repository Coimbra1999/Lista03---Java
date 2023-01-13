
package com.mycompany.lista04;

public class AppBolo {
    
    public static void main(String[] args) {
        
        Bolo bolo1 = new Bolo();
        Bolo bolo2 = new Bolo();
        Bolo bolo3 = new Bolo();
        
        bolo1.setSabor("Chocolate");
        bolo1.setValor(50.00);
        bolo1.comprarBolo(40);
        
        bolo2.setSabor("Morango");
        bolo2.setValor(30.00);
        bolo2.comprarBolo(35);
        
        bolo3.setSabor("Abacaxi");
        bolo3.setValor(40.00);
        bolo3.comprarBolo(25);
        bolo3.comprarBolo(110);
        
        bolo1.exibirRelatorio(bolo1.getSabor(), bolo1.getQuantidadeVendida(), 
                bolo1.getValor()); 
        
        bolo2.exibirRelatorio(bolo2.getSabor(), bolo2.getQuantidadeVendida(), 
                bolo2.getValor());
        
        bolo3.exibirRelatorio(bolo3.getSabor(), bolo3.getQuantidadeVendida(), 
                bolo3.getValor());
    }
}
