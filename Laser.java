/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laser;

/**
 *
 * @author unifmchishman
 */
public class Laser {
    private String fabricante;
    private double alcance, precisao, medida;
    
    public Laser(String fabricante, double alcance, double precisao, double medida){
        this.setFabricante(fabricante);
        this.setAlcance(alcance);
        this.setPrecisao(precisao);
        this.setMedida(medida);
    }
    
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    public void setAlcance(double alcance){
        this.alcance = alcance;
    }
    public void setPrecisao(double precisao){
        this.precisao = precisao;
    }
    public void setMedida(double medida){
        this.medida = medida;
    }
    
    public String getFabricante(){
        return this.fabricante;
    }
    
    public double getAlcance(){
        return this.alcance;
    }
    public double getPrecisao(){
        return this.precisao;
    }
    public double getMedida(){
        return this.medida;
    }
    @Override
    public String toString(){
        return "Laser[" + "fabricante: " + fabricante +
                "\n alcance: " + alcance +
                "\n precisao: " + precisao +
                "\n medida: " + medida + "]";
    }
}
