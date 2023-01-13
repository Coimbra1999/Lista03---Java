package exercicio1;

public class DesenvolvedorMobile extends Desenvolvedor{
    
    private String nome;
    private Integer qtdHorasTrabalhadasMobile;
    private Double valorHoraTrabalhadaMobile;

    public DesenvolvedorMobile(String nome, Integer qtdHorasTrabalhadasMobile, 
            Double valorHoraTrabalhadaMobile, Integer qtdHorasTrabalhadas, 
            Double valorHoraTrabalhada) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.nome = nome;
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }

    @Override
    public Double getSalario() {
        return super.getSalario()+(qtdHorasTrabalhadasMobile*valorHoraTrabalhadaMobile);
    }

    @Override
    public String toString() {
        return "\n"+"-".repeat(50) +
               "\nnome: " + nome + 
               "\nqtdHorasTrabalhadasMobile: " + qtdHorasTrabalhadasMobile + 
               "\nvalorHoraTrabalhadaMobile: " + valorHoraTrabalhadaMobile +
               "\nqtdHorasTrabalhadas: " + super.getQtdHorasTrabalhadas() +
               "\nvalorHoraTrabalhada: " + super.getValorHoraTrabalhada() +
               "\nsalario: " + getSalario() +
               "\n"+"-".repeat(50);
    }
    
}
