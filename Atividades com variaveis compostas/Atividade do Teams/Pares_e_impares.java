package com.mycompany.pares_e_impares;
import java.util.Scanner;
public class Pares_e_impares {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] impares = new int[10];
        int[] pares = new int[10];
        
        
        int contadorimpares = 0;
        int contadorpares = 0;
        
        
        System.out.println("Digite 10 numeros:  ");
        for (int i = 0;i < numeros.length; i++) {
    
            System.out.print("Número "+(i + 1)+": ");
    
            numeros[i] = input.nextInt();

            if (numeros[i] % 2 != 0){
        impares[contadorimpares] = numeros[i];
        contadorimpares++;
    } else {
             pares[contadorpares] = numeros[i];
        contadorpares++;   
            }
        }
        
        System.out.println("\nNúmeros impares:  ");
        for(int i = 0; i < contadorimpares; i++)
            System.out.println(impares[i]);
        
        System.out.println("\nNúmeros pares:  ");
        for(int i = 0; i < contadorpares; i++)
            System.out.println(pares[i]);
    }
    
}
