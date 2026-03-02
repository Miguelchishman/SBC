
package com.mycompany.laser;

import java.util.Scanner;



public class LaserTeste {
    public static final int SIZE = 2;
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Laser[] l = new Laser[SIZE];
        String fabricante;
        double alcance, precisao, medida;
        for (int i = 0; i < SIZE; i++){
            System.out.printf("Digite o fabricante do laser %d \n", i+1);
            fabricante = input.next();
            System.out.printf("Digite o alcance do laser %d. \n", i+1);
            alcance = input.nextDouble();
            System.out.printf("Digite a precisao do laser %d. \n", i+1);
            precisao = input.nextDouble();;
            System.out.printf("Digite a medida do laser %d. \n", i+1);
            medida = input.nextDouble();
            l[i] = new Laser(fabricante, alcance, precisao, medida);
        }
        System.out.println("VALORES OBTIDOS----------------");
        for (int i = 0; i < SIZE; i++){
            //System.out.printf("Fabricante do laser %d: %s \n", i+1, l[i].getFabricante());;;;
            //System.out.printf("Alcance do laser %d: %f \n", i+1, l[i].getAlcance());
            //System.out.printf("Precisao do laser %d: %f \n", i+1, l[i].getPrecisao());
            //System.out.printf("Medida do laser %d: %f \n", i+1, l[i].getMedida());
            
            System.out.println(l[i].toString());
            
            System.out.println("--------------------------------------------");
        }
    }
}
