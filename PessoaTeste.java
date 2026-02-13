package com.mycompany.exercicio1;

import java.util.Scanner;

public class PessoaTeste {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        System.out.println("Digite o nome: ");
        p1.setNome(input.next());
        System.out.println("Digite o cpf: ");
        p1.setCpf(input.next());
        System.out.println("Digite a idade ");
        p1.setIdade(input.nextInt());
        System.out.println("Pessoa 1 nome: " + p1.getNome());
        System.out.println("Pessoa 1 cpf: " + p1.getCpf());
        System.out.println("Pessoa 1 idade: " + p1.getIdade());
    }
}
