package exercicio2;

public class Ator {
    
    private String nome;
    private Integer qtdHorasTrabalhadas;
    private Double valorHoraTrabalhada;

    public Ator(String nome, Integer qtdHorasTrabalhadas, 
            Double valorHoraTrabalhada) {
        this.nome = nome;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }
    
    public Double getSalario(){
        return qtdHorasTrabalhadas*valorHoraTrabalhada;
    }

    @Override
    public String toString() {
        return "\n"+"-".repeat(50) +
               "\nnome: " + nome + 
               "\nqtdHorasTrabalhadas: " + qtdHorasTrabalhadas +
               "\nvalorHoraTrabalhada: " + valorHoraTrabalhada +
               "\nsalario: " + getSalario() +
               "\n"+"-".repeat(50);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHorasTrabalhadas() {
        return qtdHorasTrabalhadas;
    }

    public void setQtdHorasTrabalhadas(Integer qtdHorasTrabalhadas) {
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
    }

    public Double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(Double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }
    
}
