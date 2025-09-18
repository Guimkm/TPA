package com.mycompany.numeros_existentes_entre_100_e_125;


public class Numeros_existentes_entre_100_e_125 {

    public static void main(String[] args) {
        int n1 = 101;
        int n2 = 124;
        int c = 0;
        int r = n1;
        
        System.out.println("resultado de " + n1 + " e " + n2 + ":");
        
        do {
            c++;
            System.out.println("Número " + r + " - Total: " + c);
            r++;
        } while (r <= n2);
        
        System.out.println("\nQuantidade total de números entre " + n1 + " e " + n2 + ": " + c);
    }
    
}
