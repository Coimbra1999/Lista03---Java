package com.bandtec.projeto.lista.desafio;

import java.util.List;
import java.util.ArrayList;

public class ListaUtil {

  private List<Integer> inteiros;

  public ListaUtil() {
    this.inteiros = new ArrayList<>();
  }

  public void add(Integer valor) {
   if(valor != null){
       inteiros.add(valor);
   }
  }

  public void remove(Integer valor) {
   if(valor != null){
       inteiros.remove(valor);
   }
  }

  public Integer count() {
      Integer count = 0;
      
      if(!inteiros.isEmpty()){
          for (Integer inteiro : inteiros) {
          count++;
          }
      }
    return count;
  }

  public Integer countPares() {
      Integer countPares = 0;
      
      for (int i = 0; i < inteiros.size(); i++) {
          
          if(inteiros.get(i) % 2 == 0){
              countPares++;
          }
      }
    return countPares;
  }

  public Integer countImpares() {
      Integer countImpares = 0;
      
      for (int i = 0; i < inteiros.size(); i++) {
          
          if(inteiros.get(i) % 2 != 0){
              countImpares++;
          }
      }
    return countImpares;
  }

  public Integer somar() {
      Integer soma = 0;
      
      for (int i = 0; i < inteiros.size(); i++) {
          soma += inteiros.get(i);
      }
    return soma;
  }

  public Integer getMaior() {
      Integer maior = -9999;
      
      if(inteiros.isEmpty()){
          maior = 0;
      }else{
      for (int i = 0; i < inteiros.size(); i++) {
          if(inteiros.get(i) > maior){
              maior = inteiros.get(i);
          }
      }
      }
      return maior;
  }

  public Integer getMenor() {
      Integer menor = 9999; 
      
      if(inteiros.isEmpty()){
          menor = 0;
      }else{
      for (int i = 0; i < inteiros.size(); i++) {
          if(inteiros.get(i) < menor){
              menor = inteiros.get(i);
          }
      }
      }
    return menor;
  }

  public Boolean hasDuplicidade() {
      Boolean hasDuplicidade = false;
      
      Integer countDuplo = 0;
      for (int i = 0; i < inteiros.size(); i++) {
          
          for (int j = 0; j < inteiros.size(); j++) {
      
              
              if(inteiros.get(i) == inteiros.get(j)){
                      countDuplo++;
                  if(countDuplo > inteiros.size()){
                      hasDuplicidade = true;
                  }
                  
              }
          }
      }
          return hasDuplicidade;
  }
}
