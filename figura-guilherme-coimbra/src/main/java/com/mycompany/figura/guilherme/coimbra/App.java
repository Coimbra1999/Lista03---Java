package com.mycompany.figura.guilherme.coimbra;

import java.util.ArrayList;
import java.util.List;

public class App {
    
    public static void main(String[] args) {
        
        Quadrado quad1 = new Quadrado(2.0, "azul", 3);
        Quadrado quad2 = new Quadrado(5.0 , "rosa", 4);
        Triangulo tri1 = new Triangulo(3.0, 4.0, "amarelo", 3);
        Retangulo ret1 = new Retangulo(5.0, 10.0, "vermelho", 5);
        Circulo circ1 = new Circulo(4.0, "verde", 7);
        Circulo circ2 = new Circulo(6.0, "roxo", 2);
        
        List<Figura> figuras = new ArrayList<>();
        figuras.add(quad1);
        figuras.add(quad2);
        figuras.add(tri1);
        figuras.add(ret1);
        figuras.add(circ1);
        
        Imagem img1 = new Imagem(figuras);
        
        img1.adicionaFigura(circ2);
        img1.exibeFiguras();
        img1.exibeSomaArea();
        img1.exibeFiguraAreaMaior20();
        img1.exibeQuadrado();
        
    }
    
}
