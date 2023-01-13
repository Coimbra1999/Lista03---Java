package com.mycompany.figura.guilherme.coimbra;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    
    private List<Figura> figuras;

    public Imagem(List<Figura> figuras) {
        this.figuras = figuras;
    }
    
    public void adicionaFigura(Figura figura){
        if(figura != null){
            figuras.add(figura);
        }
    };
    
    public void exibeFiguras(){
        for (Figura figura : figuras) {
            System.out.println(figura.toString());
        }
    }
    
    public void exibeSomaArea(){
        Double soma = 0.0;
        for (Figura figura : figuras) {
            soma+=figura.calcularArea();
        }
        System.out.printf("Soma das areas: %.2f\n",soma);
    }
    
    public void exibeFiguraAreaMaior20(){
        for (int i = 0; i < figuras.size(); i++) {
            if(figuras.get(i).calcularArea() > 20){
                System.out.println("Figura com area maior que 20 " + figuras.get(i).toString());
            }
        }
    }
    
    public void exibeQuadrado(){
        for (Figura figura : figuras) {
            if(figura instanceof Quadrado){
                System.out.println("Essa figura é um quadrado: " + figura.toString());
            }
        }
    }
    
}
