
package transportadora;

public class Encomenda {
    
    private String tamanho;
    private String tamanhoEtiqueta;
    private String enderecoRemetente;
    private String enderecoDestinatario; 
    private Double distancia; 
    private Double valorEncomenda = 0.0;
    private Double valorFrete = 0.0;
    private Double total = 0.0;
    
    public Encomenda(String tamanho, String enderecoRemetente, 
            String enderecoDestinatario, Double distancia, 
            Double valorEncomenda) {
        this.tamanho = tamanho;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.distancia = distancia;
        this.valorEncomenda = valorEncomenda;
    }
    public Double calcularFrete(){
        if(tamanho.equals("P")){
            valorFrete = valorFrete+(1/100)*valorEncomenda;
            tamanhoEtiqueta = "Pequeno";
            
        }else if(tamanho.equals("M")){
            valorFrete = valorFrete+(3/100)*valorEncomenda;
            tamanhoEtiqueta = "Médio";
            
        }else if(tamanho.equals("G")){
            valorFrete = valorFrete+(5/100)*valorEncomenda;
            tamanhoEtiqueta = "Grande";
        }
        if(distancia < 50){
            valorFrete += 3.0;
        }else if(distancia < 200){
            valorFrete += 5.0;
        }else{
            valorFrete += 7.0;
        }
        total = valorFrete+valorEncomenda;
        return valorFrete;
    }
    public void emitirEquiqueta(){
        System.out.println("***** ETIQUETA PARA ENVIO *****");
        System.out.println("Endereço do remetente: " + enderecoRemetente);
        System.out.println("Endereço do destinatário: " + enderecoDestinatario);
        System.out.println("Tamanho: " + tamanhoEtiqueta);
        System.out.println("-".repeat(50));
        System.out.println("Valor encomenda: R$ " + valorEncomenda);
        System.out.println("Valor frete: R$ " + valorFrete);
        System.out.println("-".repeat(50));
        System.out.println("Valor total: R$ " + total);
    };
}
