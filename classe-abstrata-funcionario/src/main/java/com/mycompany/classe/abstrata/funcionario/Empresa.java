package com.mycompany.classe.abstrata.funcionario;

import java.util.List;

public class Empresa {
    
    private String nome;
    private List<Funcionario> funcionarios;

    public Empresa(String nome, List<Funcionario> funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }
    
    public void adicionaFunc(Funcionario funcionario){
        if(funcionario != null){
            funcionarios.add(funcionario);
        }
    }
    
    public void exibeTodos(){
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.toString());
        }
    }
    
    public void exibeTotalSalario(){
        Double total = 0.0; 
        
        for (Funcionario funcionario : funcionarios) {
            total+=funcionario.calcSalario();
        }
        System.out.printf("Total salario: %.2f", total);
    }
}
