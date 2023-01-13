package exercicio2;

public class App {

    public static void main(String[] args) {
        
        Produtora produtora1 = new Produtora("Disney", 3);
        
        Ator ator1 = new Ator("Diego", 40, 150.0);
        Protagonista ator2 = new Protagonista("Guilherme", 5, 100.0, 
                30, 150.0);
        Protagonista ator3 = new Protagonista("Ana", 5, 100.0, 
                30, 200.0);
        Ator ator4 = new Ator("Raissa", 40, 150.0);
        
        produtora1.contratar(ator1);
        produtora1.contratar(ator2);
        produtora1.contratar(ator3);
        produtora1.contratar(ator4);
        
        System.out.println(produtora1.getQuantidadeAtores());
        
        System.out.println(produtora1.getQuantidadeProtagonistas());
        
        System.out.println(produtora1.getTotalSalarios());
        
        System.out.println(produtora1.buscarAtorPorNome("guilherme"));
        
        System.out.println(produtora1.toString());
        System.out.println(ator1.toString());
        System.out.println(ator2.toString());
        System.out.println(ator3.toString());
        
    }
}
