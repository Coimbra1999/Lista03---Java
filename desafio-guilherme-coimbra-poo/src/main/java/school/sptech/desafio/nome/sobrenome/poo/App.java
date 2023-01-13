
package school.sptech.desafio.nome.sobrenome.poo;

public class App {

    public static void main(String[] args) {
        
        Colaborador colaborador1 = new Colaborador("Guilherme", "Estagiário", 2000.00);
        RecursosHumanos rh = new RecursosHumanos();
        
        System.out.println(colaborador1.toString());
        
        rh.reajustarSalario(colaborador1, 40.0);
        
        System.out.println(colaborador1.toString());
        
        Colaborador colaborador2 = new Colaborador("Ivan", "Dev Junior", 5000.00);
        
        System.out.println(colaborador2.toString());
        
        rh.reajustarSalario(colaborador2, 20.0);
        
        System.out.println(colaborador2.toString());
        
        rh.promoverColaborador(colaborador1, "Engenheiro de Cloud", 1500.00);
        
        rh.promoverColaborador(colaborador1, "Engenheiro de Cloud", 15_000.00);
        
        System.out.println(colaborador1.toString());
        
        System.out.println("Quantidade de salarios reajustados: " + rh.getQuantidadeReajustes());
        System.out.println("Quantidade de colaboradores promovidos: " + rh.getQuantidadePromovidos());
    }
}
