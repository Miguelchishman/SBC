package com.mycompany.exercicio1;

import java.util.Scanner;

public class PessoaTeste {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        Pessoa p1 = new Pessoa();
        System.out.println("Digite o nome da pessoa 1: ");
        p1.setNome(input.next());
        System.out.println("Digite o cpf da pessoa 1: ");
        p1.setCpf(input.next());
        System.out.println("Digite a idade da pessoa 1: ");
        p1.setIdade(input.nextInt());
        
        Pessoa p2 = new Pessoa();
        System.out.println("Digite o nome da pessoa 2: ");
        p2.setNome(input.next());
        System.out.println("Digite o cpf da pessoa 2: ");
        p2.setCpf(input.next());
        System.out.println("Digite a idade da pessoa 2:");
        p2.setIdade(input.nextInt());
        
        Pessoa p3 = new Pessoa();
        System.out.println("Digite o nome da pessoa 3: ");
        p3.setNome(input.next());
        System.out.println("Digite o cpf da pessoa 3: ");
        p3.setCpf(input.next());
        System.out.println("Digite a idade da pessoa 2: ");
        p3.setIdade(input.nextInt());
        
        System.out.println("Pessoa 1 nome: " + p1.getNome());
        System.out.println("Pessoa 1 cpf: " + p1.getCpf());
        System.out.println("Pessoa 1 idade: " + p1.getIdade());
        
        System.out.println("Pessoa 2 nome: " + p2.getNome());
        System.out.println("Pessoa 2 cpf: " + p2.getCpf());
        System.out.println("Pessoa 2 idade: " + p2.getIdade());
        
        System.out.println("Pessoa 3 nome: " + p3.getNome());
        System.out.println("Pessoa 3 cpf: " + p3.getCpf());
        System.out.println("Pessoa 3 idade: " + p3.getIdade());
    }
}
