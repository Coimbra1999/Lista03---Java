package com.mycompany.classe.abstrata.funcionario;

import java.util.ArrayList;
import java.util.List;

public class App {
    
    public static void main(String[] args) {
        
        Vendedor func1 = new Vendedor("462.558.124-52", "Diego", 40000.0, 10.0);
        Horista func2 = new Horista("461.546.135-45", "Guilherme", 40, 20.0);
        Horista func3 = new Horista("561.546.545-15", "Raissa", 40, 20.0);
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(func1);
        funcionarios.add(func2);
        
        Empresa empresa1 = new Empresa("SPTech", funcionarios);
        
        empresa1.adicionaFunc(func3);
        
        empresa1.exibeTodos();
        
        empresa1.exibeTotalSalario();
        
    }
    
}
