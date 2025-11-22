/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.matrizes_pares;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Matrizes_pares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

int[][] n = new int[4][4];
int soma = 0;
double média = 0;
int Quantidade_de_pares = 0;


//------------------------------------

for(int i = 0;i < 4;i++){
    for(int j = 0;j < 4;j++){
        System.out.print("Digite o valor para a posição ["+ i +"] ["+ j +"] da matriz:\t");
        n[i][j] = scanner.nextInt();
        
        if (n[i][j] % 2 == 0) {
                    soma += n[i][j];
                    Quantidade_de_pares++;
                }
    }
}

if (Quantidade_de_pares > 0){
    média = (double) soma / Quantidade_de_pares;
}

//-------------------------------------

System.out.println("\nMatriz digitada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(n[i][j] + "\t");
            }
            System.out.println();
        }
        
System.out.println("Resultado da soma dos numeros pares digitados:\t" + soma);
System.out.println("Resultado da média dos numeros pares digitados:\t" + média);


scanner.close();
    }
    
}
