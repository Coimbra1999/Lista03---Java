
package com.mycompany.avaliacao.continuada1.guilherme.coimbra;

import java.util.Scanner;

public class GuilhermeCoimbra {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Integer operacao;
        Double saldo = 0.0;
        
        do{
        Double saldoSimulacao = 0.0;
        System.out.println("-".repeat(30));
        System.out.println("SPTech Investimentos");
        System.out.println("-".repeat(30));
        System.out.println("Olá, o que deseja fazer?");
        System.out.println("-".repeat(30));
        System.out.println("1 - Depositar \n"
                         + "2 - Sacar \n"
                         + "3 - Simular rendimentos \n"
                         + "0 - Sair");
        operacao = in.nextInt();
        
        if(operacao < 0 || operacao > 3){
            
            System.out.println("-".repeat(30));
            System.out.println("A opção digitada não existe."
                    + " Selecione uma opção válida!");
        }
        if(operacao == 1){
        
            System.out.println("Informe o valor que deseja depositar: ");
            Double deposito = in.nextDouble();
            
            if(deposito <= 0){
                System.out.println("-".repeat(30));
                System.out.println("Valor inválido!");
            }else{
                saldo += deposito;
                System.out.println("-".repeat(30));
                System.out.println("Deposito realizado!");
                System.out.printf("Saldo atual: %.2f \n", saldo);
            }
        }
        if(operacao == 2){
        
            System.out.println("Informe o valor que deseja sacar: ");
            Double saque = in.nextDouble();
            
            if(saque <= 0){
                System.out.println("-".repeat(30));
                System.out.println("Valor inválido!");
                
            }else if(saque > saldo){
                System.out.println("Saldo insuficiente!");
                
            }else{
                saldo-=saque;
                System.out.println("-".repeat(30));
                System.out.println("Saque realizado com sucesso!");
                System.out.printf("Saldo atual: %.2f \n", saldo);
            }
        }
        if(operacao == 3){
            if(saldo == 0){
                System.out.println("-".repeat(30));
                System.out.println("Saldo zerado, opção inválida!");
                
            }else {
                
                saldoSimulacao = saldo;
            
                System.out.println("-".repeat(30));
                System.out.printf("Saldo atual: %.2f \n", saldoSimulacao);
                System.out.println("-".repeat(30));
                
                for (int i = 1; i <= 12; i++) {
                    
                    System.out.printf("mês %d | saldo: R$%.2f\n", i,
                            saldoSimulacao+=(saldoSimulacao*0.1));
                    System.out.println("-".repeat(30));
                }
            }
        }
        
        }while(operacao != 0);
    }
}
