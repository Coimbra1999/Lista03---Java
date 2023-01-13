
package empregado;

public class TesteEmpregado {

    public static void main(String[] args) {
        
        Empregado empregado = new Empregado("João", "Analista de Sistemas", 5_400.00);
        
        empregado.reajustarSalario(15.0);
        empregado.exibir();
    }
}

