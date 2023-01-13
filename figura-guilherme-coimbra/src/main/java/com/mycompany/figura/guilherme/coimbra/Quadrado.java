package com.mycompany.figura.guilherme.coimbra;

public class Quadrado extends Figura{
    
    private Double lado;

    public Quadrado(Double lado, String cor, Integer espessura) {
        super(cor, espessura);
        this.lado = lado;
    }

    @Override
    public Double calcularArea() {
        return lado*lado;
    }

    @Override
    public String toString() {
        return "\n"+"-".repeat(30) +
                "\nfigura: Quadrado" +
                "\nlado: " + lado +
                "\narea: " + calcularArea() +
                "\ncor: " + super.getCor() + 
                "\nespessura: " + super.getEspessura() +
                "\n"+"-".repeat(30);
    }
    
}
