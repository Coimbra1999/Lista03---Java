package com.mycompany.classe.abstrata.funcionario;

public class Vendedor extends Funcionario{
    
    private Double vendas;
    private Double taxa;

    public Vendedor(String cpf, String nome, Double vendas, Double taxa) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxa = taxa;
    }

    @Override
    public Double calcSalario() {
        return (taxa/100)*vendas;
    }

    @Override
    public String toString() {
        return  "\n" + "-".repeat(30) +
                "\ncpf: " + super.getCpf() + 
                "\nnome: " + super.getNome() +
                "\nvendas: " + vendas + 
                "\ntaxa: " + taxa +
                "\nsalario: " + calcSalario() +
                "\n" + "-".repeat(30);
    }
}
