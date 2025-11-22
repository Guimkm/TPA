package com.mycompany.matrizes_alteradas;
import java.util.Scanner;
public class Matrizes_alteradas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[][] matriz = new String[4][4];
        
        
        for(int i = 0;i < 4;i++){
    for(int j = 0;j < 4;j++){
        System.out.print("Digite o valor para as coordenadas ["+ (i + 1) +"] ["+ (j + 1) +"] da matriz: \t");
        matriz[i][j] = scanner.nextLine();
    }
}
        
        System.out.println("\n<---------------------------------------------->");
                System.out.println("\nMatriz A)");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        
        
        System.out.println("\n<---------------------------------------------->");
        
        System.out.println("\nMatriz B)");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 || i == 3 || j == 0 || j == 3){
                    System.out.print(matriz[i][j] + "\t");
                } else {
                System.out.print("\t");
                }
            }
            System.out.println();
        }
        
        
        
        System.out.println("\n<---------------------------------------------->");
        
                System.out.println("\nMatriz C)");
                
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matriz[i][j] + "\t");  
            }
            System.out.println();
        
        }
        
        
        
        
        
    }
    
}
