package com.mycompany.figura.guilherme.coimbra;

public class Triangulo extends Figura{
    
    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura, String cor, Integer espessura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return (base*altura)/2;
    }
    
    @Override
    public String toString() {
        return "\n"+"-".repeat(30) +
                "\nfigura: Triangulo" +
                "\nbase: " + base +
                "\naltura: " + altura +
                "\narea: " + calcularArea() +
                "\ncor: " + super.getCor() + 
                "\nespessura: " + super.getEspessura() +
                "\n"+"-".repeat(30);
    }
    
}
