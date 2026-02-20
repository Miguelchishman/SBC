/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.invoice;

/**
 *
 * @author unifmchishman
 */
public class Invoice {
    private String identificador;
    private String descricao;
    private int quantidade;
    private float preco;
    
    public void setIdentificador(String identificador){
        this.identificador = identificador;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setQuantidade(int quantidade){
        if (quantidade < 0) quantidade = 0;
        this.quantidade = quantidade;
    }
    
    public void setPreco(float preco){
        if (preco < 0) preco = 0;
        this.preco = preco;
    }
    
    public String getIdentificador(){
        return this.identificador;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
    public float getPreco(){
        return this.preco;
    }
    
    public double getInvoiceAmount(){
        return this.quantidade * this.preco;
    }

    
}
