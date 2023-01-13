package com.mycompany.exemplo.agregacao;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    
    private String nome;
    private List<Contato> contatos;

    
    public Grupo(String nome, List<Contato> contatos) {
        this.nome = nome;
        this.contatos = contatos;
    }
    
    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList();
    }
    
    public void adicionar(Contato contato){
        this.contatos.add(contato);
    }
    
    public void remover(Contato contato){
        this.contatos.remove(contato);
    }
    
    public void remover(String telefone){
        
        for (int i = 0; i < contatos.size(); i++) {
            if(contatos.get(i).getTelefone().equals(telefone)){
                contatos.remove(i);
            }
        }
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }
    
    
    
}
