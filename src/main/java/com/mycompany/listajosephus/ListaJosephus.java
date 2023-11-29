/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listajosephus;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class ListaJosephus {

    public static void main(String[] args) {
        int i, posicao, tamanho, teste = 20;
        FuncoesLista fl = new FuncoesLista();
        Random gposicao = new Random();
        
        Pessoa p1 = new Pessoa("Hugo", "504.486.965-87", "(64) 99632-5874", "Avenida José Dias Guimarães - 75667-000");
        Pessoa p2 = new Pessoa("Shayra", "478.624.693-45", "(64) 99325-4258", "Rua dos Pintassilgos - 75667-000");
        Pessoa p3 = new Pessoa("Igor", "256.471.935-78", "(64) 99425-9935", "Rua Limiro Venancio de Lima - 75667-000");
        Pessoa p4 = new Pessoa("Pedro", "056.898.147-99", "(64) 99344-0022", "Avenida José Dias Guimarães - 75667-000");
        Pessoa p5 = new Pessoa("Marcos", "418.458.325-02", "(64) 99336-9764", "Rua dos Pintassilgos - 75667-000");
        Pessoa p6 = new Pessoa("José", "935.421.962-15", "(64) 99342-9438", "Avenida José Dias Guimarães - 75667-000");
        Pessoa p7 = new Pessoa("Antônio", "222.964.555-95", "(64) 99288-3495", "Rua dos Pintassilgos - 75667-000");
        Pessoa p8 = new Pessoa("Mathias", "852.852.852-64", "(64) 99248-8585", "Avenida José Dias Guimarães - 75667-000");
        Pessoa p9 = new Pessoa("Heitor", "456.888.888-96", "(64) 99345-4468", "Rua Limiro Venancio de Lima - 75667-000");
        Pessoa p10 = new Pessoa("Junior", "158.896.147-93", "(64) 99348-5474", "Setor Aeroporto - 75667-000");
        Pessoa p11 = new Pessoa("Helectro", "504.486.965-87", "(64) 99632-5874", "Avenida José Dias Guimarães - 75667-000");
        Pessoa p12 = new Pessoa("Neo", "458.528.369-57", "(64) 99632-5874", "Setor Aeroporto - 75667-000");
        Pessoa p13 = new Pessoa("Morpheus", "158.435.952-11", "(64) 99632-5874", "Avenida José Dias Guimarães - 75667-000");
        Pessoa p14 = new Pessoa("Eliane", "125.896.364-87", "(64) 99632-5874", "Avenida José Dias Guimarães - 75667-000");
        Pessoa p15 = new Pessoa("Edmilson", "127.856.369-87", "(64) 99632-5874", "Setor Aeroporto - 75667-000");
        Pessoa p16 = new Pessoa("Eric", "501.584.999-87", "(64) 99632-5874", "Avenida José Dias Guimarães - 75667-000");
        Pessoa p17 = new Pessoa("Henrique", "044.899.655-91", "(64) 99632-5874", "Rua Limiro Venancio de Lima - 75667-000");
        Pessoa p18 = new Pessoa("Matheus", "000.486.741-67", "(64) 99632-5874", "Rua Limiro Venancio de Lima - 75667-000");
        Pessoa p19 = new Pessoa("Jason", "026.333.159-46", "(64) 99632-5874", "Avenida José Dias Guimarães - 75667-000");
        Pessoa p20 = new Pessoa("West", "045.452.056-00", "(64) 99632-5874", "Setor Aeroporto - 75667-000");

        
        
        fl.add(p1);
        fl.add(p2);
        fl.add(p3);
        fl.add(p4);
        fl.add(p5);
        fl.add(p6);
        fl.add(p7);
        fl.add(p8);
        fl.add(p9);
        fl.add(p10);
        fl.add(p11);
        fl.add(p12);
        fl.add(p13);
        fl.add(p14);
        fl.add(p15);
        fl.add(p16);
        fl.add(p17);
        fl.add(p18);
        fl.add(p19);
        fl.add(p20);
        
        Pessoa atual;
        
        do{
            tamanho = fl.tamanho() - 1;
            posicao = gposicao.nextInt(tamanho + 1) + 0;
            fl.remover(posicao);
            
        }
        while(fl.tamanho() > 1);
        
        System.out.println("=================Sobrevivente=================");
        atual = (Pessoa)fl.getPegaCelula((fl.tamanho() - 1));
        System.out.println("Nome: "+atual.nome);
        System.out.println("CPF: "+atual.cpf);
        System.out.println("Telefone: "+atual.telefone);
        System.out.println("Endereco: "+atual.endereco);
        System.out.println("----------");
    }
}
