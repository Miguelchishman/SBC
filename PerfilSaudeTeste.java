/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perfilsaude;

import java.util.Scanner;
public class PerfilSaudeTeste {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        PerfilSaude perfil = new PerfilSaude();
        
        System.out.println("Digite as informações sobre seu perfil de Saúde: ");
        System.out.println("Digite seu nome: ");
        perfil.setNome(input.next());
        System.out.println("Digite seu sobrenome: ");
        perfil.setSobrenome(input.next());
        System.out.println("Digite seu sexo: ");
        perfil.setSexo(input.next());
        System.out.println("Digite seu dia de nascimento: ");
        perfil.setDiaNascimento(input.nextInt());
        System.out.println("Digite seu mes de nascimento: ");
        perfil.setMesNascimento(input.nextInt());
        System.out.println("Digite seu ano de nascimento: ");
        perfil.setAnoNascimento(input.nextInt());
        System.out.println("Digite sua altura: (m) ");
        perfil.setAltura(input.nextFloat());
        System.out.println("Digite seu peso: (kg) ");
        perfil.setPeso(input.nextFloat());
        
        System.out.println("");
        System.out.println("INFORMACOES: ");
        System.out.println("Nome: " + perfil.getNome());
        System.out.println("Sobrenome: " + perfil.getSobrenome());
        System.out.println("Sexo: " + perfil.getSexo());
        System.out.println("Data de nascimento: " +  + perfil.getDiaNascimento() + "/" + perfil.getMesNascimento() + "/" + perfil.getAnoNascimento());
        System.out.printf("Idade: %d \n", 2026 - perfil.getAnoNascimento());
        System.out.println("Altura: " + perfil.getAltura());
        System.out.println("Peso: " + perfil.getPeso());
        System.out.println("IMC: " + perfil.getIMC());
        
        
    }
}
