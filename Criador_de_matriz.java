package com.mycompany.calculadora_de_matriz;

import java.util.Scanner;

public class Calculadora_de_matriz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int L = 5, C = 5;
        
        
        int [][] A = new int [L][C];
        int [][] B = new int [L][C];
        int [][] R = new int [L][C];
        
       
        for (int i = 0;i < L; i++){
            for (int j = 0;j < C;j++){   
                System.out.print("Escreva o numero que voce ira utilizar na matriz A  [" + i+ "]["  + j + "] :  ");
               A[i][j] = scanner.nextInt();
            }}
        
            System.out.print("Agora para a Segunda matriz");
            
        for (int i = 0;i < L; i++){
            for (int j = 0;j < C;j++){   
                System.out.print("Escreva o numero que voce ira utilizar na matriz B  [" + i + "]["  + j + "] :  ");
               B[i][j] = scanner.nextInt();
               R[i][j] = A[i][j] + B[i][j];
               System.out.print(R);
            }}
            
            
    }
}
