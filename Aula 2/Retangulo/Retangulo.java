package com.mycompany.retangulo;
public class Retangulo {
    private int lado1, lado2;
    
    public void setLado1(int lado1){
        this.lado1 = lado1;
    }
    public void setLado2(int lado2){
        this.lado2 = lado2;
    }
    
    public int getLado1(){
        return this.lado1;
    }

    public int getLado2(){
        return this.lado2;
    }
    
    public int perimetro(){
        return lado1*2 + lado2*2;
    }
    
    public int area(){
        return lado1*lado2;
    }
}
