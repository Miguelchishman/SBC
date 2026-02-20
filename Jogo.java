/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;
import java.util.Random;
/**
 *
 * @author unifmchishman
 */
public class Jogo {
    private int numeroAdivinhacoes = 0;
    private static final Random randomNumbers = new Random();
    private int numeroSorteado = 1 + randomNumbers.nextInt( 1000 );
    private boolean ganhou = false;
    
    public boolean getGanhou(){
        return this.ganhou;
    }
    
    public void setGanhou(boolean ganhou){
        this.ganhou = ganhou;
    }
    
    public void adivinhacao(int tentativa){
        this.numeroAdivinhacoes++;
        if (tentativa > this.numeroSorteado){
            System.out.println("Muito alto. Tente novamente");
        } else if (tentativa < this.numeroSorteado){
            System.out.println("Muito baixo. Tente novamente");
        } else{
            vitoria();
        }
    }

    public void vitoria(){
        setGanhou(true);
        if (this.numeroAdivinhacoes <= 10){
            System.out.println("Parabéns, você adivinhou o número em " + this.numeroAdivinhacoes + " tentativas!");
            System.out.println("Você sabe o segredo ou tem muita sorte!");
        } else if (this.numeroAdivinhacoes > 10) {
            System.out.println("Você deve ser capaz de fazer melhor.");
        }
    }
}
