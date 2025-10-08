package com.mycompany.criador_de_tabelas;

import java.util.Scanner;

public class Criador_de_tabelas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = 0;
        System.out.println("Escreva o numero que você ira utilizar na tabela:   ");
        double n = scanner.nextDouble();
        System.out.println("Essa é a sua tabela:   ");
        for (double f = 1;f <= 10;f++){
        r = n * f;
        System.out.println(n +" * "+ f +" = "+ r);
        
        
        }
        
        
    }
}
