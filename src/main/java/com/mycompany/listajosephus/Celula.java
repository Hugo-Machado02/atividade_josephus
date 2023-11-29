/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listajosephus;

/**
 *
 * @author Usuario
 */
public class Celula {
    Celula proxima;
    Object elemento;
    
    public Celula(Object elem){
        this.elemento = elem;
    }
    
    public Celula(Celula prox, Object elem){
        this.proxima = prox;
        this.elemento = elem;
    }
    
    public void setProxima(Celula prox){
        this.proxima = prox;
    }
    
    public Celula getProxima(){
        return(this.proxima);
    }
    
    public Object getElemento(){
        return(this.elemento);
    }
}
