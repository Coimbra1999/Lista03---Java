package school.sptech.exercicio.personagem;

import java.util.ArrayList;
import java.util.List;

public class App {
    
    public static void main(String[] args) {
        
        SuperPoder h1 = new SuperPoder("Byakugan", 8);
        SuperPoder h2 = new SuperPoder("Oito Trigramas", 8);
        List<SuperPoder> poderesHinata = new ArrayList<>();
        poderesHinata.add(h1);
        poderesHinata.add(h2);
        Heroi hinata = new Heroi("Hinata", "Hinata Hyuga", poderesHinata);
        
        SuperPoder k1 = new SuperPoder("Chidori", 7);
        SuperPoder k2 = new SuperPoder("Sharingan", 8);
        List<SuperPoder> poderesKakashi = new ArrayList<>();
        poderesKakashi.add(k1);
        poderesKakashi.add(k2);
        Heroi kakashi = new Heroi("Kakashi", "Kakashi Hatake", poderesKakashi);
        
        SuperPoder p1 = new SuperPoder("Shinra Tensei", 9);
        SuperPoder p2 = new SuperPoder("Banshô Ten'in", 9);
        List<SuperPoder> poderesPain = new ArrayList<>();
        poderesPain.add(p1);
        poderesPain.add(p2);
        Vilao pain = new Vilao("Pain", "Pain Tenso", poderesPain);
        
        SuperPoder T1 = new SuperPoder("Fuinjutsu", 8);
        SuperPoder T2 = new SuperPoder("Drenagem de Chakra", 7);
        List<SuperPoder> poderesTobi = new ArrayList<>();
        poderesTobi.add(T1);
        poderesTobi.add(T2);
        Vilao tobi = new Vilao("Tobi", "Obito", poderesTobi);
        
        Confronto.lutar(hinata, pain);
        Confronto.lutar(kakashi, tobi);
        
    }
    
}
