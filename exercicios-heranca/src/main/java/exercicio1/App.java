package exercicio1;

public class App {

    public static void main(String[] args) {
        
        Consultoria consultoria1 = new Consultoria("TI", 3);
        
        Desenvolvedor dev1 = new Desenvolvedor("Diego", 40, 150.0);
        DesenvolvedorMobile dev2 = new DesenvolvedorMobile("Guilherme", 
                10, 50.0, 40, 
                100.0);
        DesenvolvedorMobile dev3 = new DesenvolvedorMobile("Frizza", 
                5, 150.0, 40, 
                200.0);
        Desenvolvedor dev4 = new Desenvolvedor("Raissa", 40, 150.0);
        
        consultoria1.contratar(dev1);
        consultoria1.contratar(dev2);
        consultoria1.contratar(dev3);
        consultoria1.contratar(dev4);
        
        System.out.println(consultoria1.getQuantidadeDesenvolvedores());
        
        System.out.println(consultoria1.getQuantidadeDesenvolvedoresMobile());
        
        System.out.println(consultoria1.getTotalSalarios());
        
        System.out.println(consultoria1.buscarDesenvolvedorPorNome("guilherme"));
        
        System.out.println(consultoria1.toString());
        System.out.println(dev1.toString());
        System.out.println(dev2.toString());
        System.out.println(dev3.toString());
        
        
    }
}
