package com.mycompany.criador_de_tabelas;

import java.util.Scanner;

public class Criador_de_tabelas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = 0;
        System.out.println("Escreva o numero que você ira utilizar na tabela:   ");
        double n = scanner.nextDouble();
        System.out.println("Escreva o numero para ecolher o tipo de conta que você ira utilizar na tabela");
        System.out.println("1 - para uma tabela de soma");
        System.out.println("2 - para uma tabela de subtracao");
        System.out.println("3 - para uma tabela de multiplicacao");
        System.out.println("4 - para uma tabela de divisao");
        int t = scanner.nextInt();
        
        System.out.println("Essa é a sua tabela:   ");
        
        // Parte para fazer a tabela de soma
        if (t == 1) {
        for (double f = 1;f <= 10;f++){
        r = n + f;
        System.out.println(n +" * "+ f +" = "+ r);
        }}
        
        //Parte para fazer a tabela de Subtração
        if (t == 2) {
        for (double f = 1;f <= 10;f++){
        r = n - f;
        System.out.println(n +" * "+ f +" = "+ r);
        }}
        
        //Parte para fazer a tabela de multiplcação
        if (t == 3) {
        for (double f = 1;f <= 10;f++){
        r = n * f;
        System.out.println(n +" * "+ f +" = "+ r);
        }}
        
        //Parte para fazer a tabela de divisão
        if (t == 4) {
        for (double f = 1;f <= 10;f++){
        r = n / f;
        System.out.println(n +" * "+ f +" = "+ r);
        }}
    }
}
