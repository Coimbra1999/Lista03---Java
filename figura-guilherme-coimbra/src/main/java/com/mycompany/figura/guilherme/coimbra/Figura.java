package com.mycompany.figura.guilherme.coimbra;

public abstract class Figura {
    
    private String cor;
    private Integer espessura;

    public Figura(String cor, Integer espessura) {
        this.cor = cor;
        this.espessura = espessura;
    }
    
    public abstract Double calcularArea();

    @Override
    public String toString() {
        return "\n"+"-".repeat(30) +
               "\ncor: " + cor + 
               "\nespessura: " + espessura +
               "\n"+"-".repeat(30);
    }

    public String getCor() {
        return cor;
    }

    public Integer getEspessura() {
        return espessura;
    }
    
}
