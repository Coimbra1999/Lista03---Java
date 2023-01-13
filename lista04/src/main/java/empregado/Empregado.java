
package empregado;

public class Empregado {
    
    private String nome;
    private String cargo;
    private Double salario = 0.0;
    
    public Empregado(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public Double reajustarSalario(Double reajuste){
        salario = (salario + (reajuste/100*salario));
        
        return salario;
    }
    
    public void exibir(){
        System.out.printf("Nome do funcionário: %s, cargo: %s, salario: %.2f", 
                nome, cargo, salario);
    }

}
