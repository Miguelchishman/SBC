package com.mycompany.swapper;

import java.util.Scanner;
public class SwapperDemo {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Swapper troca = new Swapper();
        System.out.println("Digite o valor de x: ");
        troca.setX(input.nextFloat());
        System.out.println("Digite o valor de y: ");
        troca.setY(input.nextFloat());
        
        System.out.println("Valor de x: " + troca.getX());
        System.out.println("Valor de y: " + troca.getY());
        troca.swap();
        
        System.out.println("Valor de x: " + troca.getX());
        System.out.println("Valor de y: " + troca.getY());
        
    }
}
