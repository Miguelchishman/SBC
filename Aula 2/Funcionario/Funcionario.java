/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionario;

/**
 *
 * @author unifmchishman
 */
public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public void setSalarioMensal(double salarioMensal){
        if (salarioMensal < 0){
            this.salarioMensal = 0;
            return;
        }
        this.salarioMensal = salarioMensal;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public double getSalarioMensal(){
        return this.salarioMensal;
    }
    
    public double getSalarioAnual(){
        return this.salarioMensal * 12;
    }
}
