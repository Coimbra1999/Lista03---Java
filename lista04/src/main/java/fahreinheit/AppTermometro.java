
package fahreinheit;

public class AppTermometro {

    public static void main(String[] args) {
        
        Termometro termometro = new Termometro(11.0, 20.0, 32.0);
        
        termometro.aumentaTemperatura(7.0);
        termometro.diminuiTemperatura(17.0);
        termometro.exibeFahreinheit();
    }
}
