
package com.mycompany.invoice;

import java.util.Scanner;
public class InvoiceTeste {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Invoice invoice1 = new Invoice();
        Invoice invoice2 = new Invoice();
        
        invoice1.setIdentificador("AB41C0");
        invoice1.setDescricao("Televisão");
        invoice1.setPreco(999);
        invoice1.setQuantidade(2);
        
        invoice2.setIdentificador("934FAC");
        invoice2.setDescricao("Caneta");
        invoice2.setPreco(2);
        invoice2.setQuantidade(10);
        
        System.out.println("Invoice 1: ");
        System.out.println("Identificador: " + invoice1.getIdentificador());
        System.out.println("Descricao: " + invoice1.getDescricao());
        System.out.println("Preço: " + invoice1.getPreco());
        System.out.println("Quantidade: " + invoice1.getQuantidade());
        System.out.println("Valor da fatura: " + invoice1.getInvoiceAmount());
        
        System.out.println("");
        System.out.println("Invoice 2: ");
        System.out.println("Identificador: " + invoice2.getIdentificador());
        System.out.println("Descricao: " + invoice2.getDescricao());
        System.out.println("Preço: " + invoice2.getPreco());
        System.out.println("Quantidade: " + invoice2.getQuantidade());
        System.out.println("Valor da fatura: " + invoice2.getInvoiceAmount());
    }
}
