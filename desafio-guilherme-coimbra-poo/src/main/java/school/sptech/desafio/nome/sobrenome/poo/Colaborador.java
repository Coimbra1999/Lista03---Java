package school.sptech.desafio.nome.sobrenome.poo;

public class Colaborador {

    private String nome;
    private String cargo;
    private Double salario = 0.0;

    public Colaborador(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public Colaborador(){
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "-".repeat(50)+"\n"
                + "Colaborador: " + this.nome + "\n"
                + "cargo: " + this.cargo + "\n"
                + "salario : " + this.salario + "\n"
                + "-".repeat(50);
    }
    
}
