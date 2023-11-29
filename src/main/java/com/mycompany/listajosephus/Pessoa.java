/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listajosephus;

/**
 *
 * @author Usuario
 */
public class Pessoa {
    String nome, cpf, endereco, telefone;
    
    public Pessoa(String nomePessoa, String cpfPessoa, String telPessoa, String endPessoa){
        this.nome = nomePessoa;
        this.cpf = cpfPessoa;
        this.telefone = telPessoa;
        this.endereco = endPessoa;
    }
}
