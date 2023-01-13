package exercicio2;

public class Protagonista extends Ator{
    
    private String nome;
    private Integer qtdHorasTrabalhadasProtagonista;
    private Double valorHoraTrabalhadaProtagonista;

    public Protagonista(String nome, Integer qtdHorasTrabalhadasProtagonista, 
            Double valorHoraTrabalhadaProtagonista, 
            Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.nome = nome;
        this.qtdHorasTrabalhadasProtagonista = qtdHorasTrabalhadasProtagonista;
        this.valorHoraTrabalhadaProtagonista = valorHoraTrabalhadaProtagonista;
    }

    @Override
    public Double getSalario() {
        return super.getSalario()+(qtdHorasTrabalhadasProtagonista*valorHoraTrabalhadaProtagonista);
    }

    @Override
    public String toString() {
        return "\n"+"-".repeat(50) +
               "\nnome: " + nome + 
               "\nqtdHorasTrabalhadasProtagonista: " + qtdHorasTrabalhadasProtagonista + 
               "\nvalorHoraTrabalhadaProtagonista: " + valorHoraTrabalhadaProtagonista +
               "\nqtdHorasTrabalhadas: " + super.getQtdHorasTrabalhadas() +
               "\nvalorHoraTrabalhada: " + super.getValorHoraTrabalhada() +
               "\nsalario: " + getSalario() +
               "\n"+"-".repeat(50);
    }
    
}
