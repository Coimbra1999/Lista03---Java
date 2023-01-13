
package transportadora;

public class AppEncomenda {
    
    public static void main(String[] args) {
        
        Encomenda encomenda = new Encomenda("G", "Rua Santos da Glória, 18", 
                "Av Dr. Pedro, 255", 201.00, 87.50);
        encomenda.calcularFrete();
        encomenda.emitirEquiqueta();
    }
}
