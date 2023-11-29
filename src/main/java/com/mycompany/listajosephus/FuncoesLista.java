/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listajosephus;

/**
 *
 * @author Usuario
 */
public class FuncoesLista {
    Celula primeira;
    Celula ultima;
    int totalCelulas = 0;
    
    public void addComeco(Object elem){
        Celula nc = new Celula(this.primeira, elem);
        this.primeira = nc;
        
        if(this.totalCelulas == 0){
            this.ultima = this.primeira;
        }
        
        this.totalCelulas++;
    }
    
    public void add(Object elem){
        if(this.totalCelulas == 0){
            this.addComeco(elem);
        } else{
            Celula nc = new Celula(elem);
            this.ultima.setProxima(nc);
            this.ultima = nc;
            
            this.totalCelulas++;
        }
    }
    
    public void removeDoComeco(){
        if(!this.posicaoOcupada(0)){
            throw new IllegalArgumentException("Posição Inexistente");
        }else{
            this.primeira = this.primeira.getProxima();
            this.totalCelulas--;
            if(this.totalCelulas == 0){
                this.ultima = null;
            }           
        }
    }
    
    public void remover(int pos){
        if(pos == 0){
            removeDoComeco();
        }else{
            Celula anterior = this.pegaCelula(pos-1);
            anterior.proxima = this.pegaCelula(pos+1);
            this.totalCelulas--;
            if(this.totalCelulas == 0){
                this.ultima = null;                        
            }
        }
    }
    
    public Celula pegaCelula(int pos){
        Celula atual = this.primeira;
        for(int i=0; i< pos; i++){
            atual = atual.getProxima();
        }
            
        return(atual);
    }
    
    public Object getPegaCelula(int posicao){
        return(this.pegaCelula(posicao).getElemento());
    }
    
    public boolean posicaoOcupada(int pos){
        return((pos>=0)&&(pos < this.totalCelulas));
    }
    
    public int tamanho(){
        return(this.totalCelulas);
    }
}
