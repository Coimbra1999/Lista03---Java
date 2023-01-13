package com.sptech.atividade.com.testes;

public class Hospital {

    private String nome;
    private Integer quantidadeDePagamentos;
    private Integer quantidadeDeHoraExtra;

    public Hospital(String nome) {
        this.nome = nome;
        this.quantidadeDePagamentos = 0;
        this.quantidadeDeHoraExtra = 0;
    }
    
    public void realizarPagamento(Medico medico, Double valorPago){
        if(medico != null && valorPago != null){
            
            if(medico.getAtivo() == true && valorPago > 0){
                medico.setSalario(medico.getSalario()+valorPago);
                quantidadeDePagamentos++;
            }
            
        }else{
            System.out.println("Não foi possível realizar pagamento!");
        }
    }
    
    public void realizarPagamento(Medico medico, Double valorPago, Double horaExtra){
        if(medico != null && valorPago != null && horaExtra != null){
        
            if(medico.getAtivo() == true && valorPago > 0 && horaExtra > 0){
                medico.setSalario(medico.getSalario()+valorPago+horaExtra);
                quantidadeDeHoraExtra++;
                quantidadeDePagamentos++;
            }
            
        }else{
            System.out.println("Não foi possível realizar pagamento!");
        }
    }
    
    public void desligarMedico(Medico medico){
        if(medico != null){
            if(medico.getAtivo() == true){
                medico.setAtivo(false);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidadeDePagamentos() {
        return quantidadeDePagamentos;
    }

    public Integer getQuantidadeDeHoraExtra() {
        return quantidadeDeHoraExtra;
    }
}
