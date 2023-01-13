package com.mycompany.classe.abstrata.funcionario;

public abstract class Funcionario {
    
    private String cpf;
    private String nome;

    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public abstract Double calcSalario();

    @Override
    public String toString() {
        return "\n" + "-".repeat(30) +
               "\ncpf: " + cpf + 
               "\nnome: " + nome +
               "\n" + "-".repeat(30);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
