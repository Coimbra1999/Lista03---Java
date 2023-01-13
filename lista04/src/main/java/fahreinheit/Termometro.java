
package fahreinheit;

public class Termometro {
    
    private Double temperaturaMin = 0.0;
    private Double temperaturaAtual = 0.0;
    private Double temperaturaMax = 0.0;
    private Double fahreinheit = 0.0;

    public Termometro(Double temperaturaMin, Double temperaturaAtual, Double temperaturaMax) {
        this.temperaturaMin = temperaturaMin;
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaMax = temperaturaMax;
    }
    
    public void aumentaTemperatura(Double aumentarTemp){
        temperaturaAtual += aumentarTemp;
        
        if(temperaturaAtual > temperaturaMax){
        temperaturaAtual = temperaturaMax;
        }
    };
    public void diminuiTemperatura(Double diminuirTemp){
        temperaturaAtual -= diminuirTemp;
        
        if(temperaturaAtual < temperaturaMin){
        temperaturaAtual = temperaturaMin;
        }
    };
    public void exibeFahreinheit(){
        fahreinheit = (temperaturaAtual * 1.8) + 32;
        System.out.println("Temperatura atual em Fahreinheit: " + fahreinheit);
    };
}
