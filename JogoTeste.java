/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * @author unifmchishman
 */

import java.util.Scanner;
public class JogoTeste {
    public static void main(String[] args){
        Jogo jogo1 = new Jogo();
        Scanner input = new Scanner(System.in);
        while (!jogo1.getGanhou()){
            System.out.println("Advinhe um número entre 1 e 1.000");
            jogo1.adivinhacao(input.nextInt());
        }
    }
}
