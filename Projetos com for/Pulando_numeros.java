package com.mycompany.pulando_numeros;

import java.util.Scanner;

public class Pulando_numeros {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva o numero:  ");
        double n = scanner.nextDouble();
        int c = 1;
        for(double r = 1;r <= 100; r += n) {
            
            System.out.println(c + "º numero: " + r);
            c++;
        }
        
    }
}
