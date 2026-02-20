/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perfilsaude;

/**
 *
 * @author unifmchishman
 */
public class PerfilSaude {
    private String nome, sobrenome, sexo;
    private int diaNascimento, mesNascimento, anoNascimento;
    private float altura, peso;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public void setDiaNascimento(int diaNascimento){
        this.diaNascimento = diaNascimento;
    }
    public void setMesNascimento(int mesNascimento){
        this.mesNascimento = mesNascimento;
    }
    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public String getSexo(){
        return this.sexo;
    }
    public int getDiaNascimento(){
        return this.diaNascimento;
    }
    public int getMesNascimento(){
        return this.mesNascimento;
    }
    public int getAnoNascimento(){
        return this.anoNascimento;
    }
    public float getAltura(){
        return this.altura;
    }
    public float getPeso(){
        return this.peso;
    }
    public float getIMC(){
        if (this.peso == 0 && this.altura == 0) return 0;
        return this.peso / (this.altura * this.altura);
    }
    
}
