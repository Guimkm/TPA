
package com.mycompany.criador_de_matriz;
import java.util.Scanner;
public class Criador_de_matriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int L,C;
        
         System.out.print("Escreva a quantidade de linhas que voce ira usar na matriz:  ");
        L = scanner.nextInt();
        
        System.out.print("Escreva a quantidade de colunas que voce ira usar na matriz:  ");
        C = scanner.nextInt();
        
        int [][] A = new int [L][C];
        int [][] B = new int [L][C];
        int [][] R = new int [L][C];
        
       
        for (int i = 0;i < L; i++){
            for (int j = 0;j < C;j++){   
                System.out.print("Escreva o numero que voce ira utilizar na matriz A  [" + (i)+ "]["  + (j) + "] :  ");
               A[i][j] = scanner.nextInt();
            }}
            
        for (int i = 0;i < L; i++){
            for (int j = 0;j < C;j++){   
                System.out.print("Escreva o numero que voce ira utilizar na matriz B  [" + (i)+ "]["  + (j) + "] :  ");
               B[i][j] = scanner.nextInt();
            }}
            
            C[i][j] = A[i][j] + B[i][j];
    }
    
}
