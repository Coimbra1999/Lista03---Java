package school.sptech.desafio.nome.sobrenome.poo;

public class RecursosHumanos {
    
    private Integer quantidadePromovidos = 0;
    private Integer quantidadeReajustes = 0;
    
    public void reajustarSalario(Colaborador colaborador, Double porcentagem){
        
        if(colaborador.getNome() != null && porcentagem != null && porcentagem > 0){
        colaborador.setSalario(colaborador.getSalario() + ((porcentagem/100) * colaborador.getSalario()));
        quantidadeReajustes++;
            System.out.println("Salario reajustado!");
        }else{
            System.out.println("Não foi possível reajustar o salário!");
        }
    };

    
    
    public void promoverColaborador(Colaborador colaborador, String novoCargo, 
            Double novoSalario){
        if(colaborador != null && novoCargo != null && novoSalario > colaborador.getSalario()){
        quantidadePromovidos++;
        colaborador.setCargo(novoCargo);
        colaborador.setSalario(novoSalario);
        
        System.out.println("Promoção realizada!");
            
        }else{
            System.out.println("Não foi possível realizar a promoção!");
        }
    };
    
    public Integer getQuantidadePromovidos() {
        return quantidadePromovidos;
    }

    public Integer getQuantidadeReajustes() {
        return quantidadeReajustes;
    }
}
