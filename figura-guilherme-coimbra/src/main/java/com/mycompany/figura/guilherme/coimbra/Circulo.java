package com.mycompany.figura.guilherme.coimbra;

public class Circulo extends Figura{
    
    private Double raio;

    public Circulo(Double raio, String cor, Integer espessura) {
        super(cor, espessura);
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        return (raio*raio)*3.14;
    }
    
    @Override
    public String toString() {
        return "\n"+"-".repeat(30) +
                "\nfigura: Circulo" +
                "\nraio: " + raio +
                "\narea: " + calcularArea() +
                "\ncor: " + super.getCor() + 
                "\nespessura: " + super.getEspessura() +
                "\n"+"-".repeat(30);
    }
    
}
