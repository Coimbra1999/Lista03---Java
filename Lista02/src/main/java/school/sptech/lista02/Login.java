
package school.sptech.lista02;

import java.util.Scanner;

public class Login {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Nome: ");
        String nome = leitor.nextLine();
        
        System.out.println("Senha");
        String senha = leitor.nextLine();
        
        do {
            System.out.println("Login e/ou senha inválidos");
            
            System.out.println("Nome: ");
            nome = leitor.nextLine();
        
            System.out.println("Senha");
            senha = leitor.nextLine();
        } while (!nome.equals("admin") && !senha.equals("#SPtech2022"));
        
        System.out.println("Login realizado com sucesso");
    }
    
}
