/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.televisao;

/**
 *
 * @author unifmchishman
 */
public class Televisao {
    private String modelo;
    private float preco, tamanho;
    private int volume, canal;
    private boolean ligada;
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    
    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }
    public String getModelo(){
        return this.modelo;
    }
    
    public float getPreco(){
        return this.preco;
    }
    
    public float getTamanho(){
        return this.tamanho;
    }
    
    public int getVolume(){
        return this.volume;
    }
    
    public int getCanal(){
        return this.canal;
    }
    
    public boolean estado(){
        return this.ligada;
    }
    
    public void desligarTv() {
        this.ligada = !this.ligada;
    }
    public void alteraVolume(int delta){
        this.volume += delta;
    }
    public void diminuiCanal(){
        this.canal--;
    }
    public void aumentaCanal(){
        this.canal++;
    }
}
