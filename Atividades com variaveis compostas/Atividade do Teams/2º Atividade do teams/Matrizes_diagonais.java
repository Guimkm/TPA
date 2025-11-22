package com.mycompany.matrizes_diagonais;
import java.util.Scanner;
public class Matrizes_diagonais {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double[][] matriz = new double[4][4];
        
        for(int i = 0;i < 4;i++){
    for(int j = 0;j < 4;j++){
        System.out.print("Digite o valor para as coordenadas ["+ (i + 1) +"] ["+ (j + 1) +"] da matriz: \t");
        matriz[i][j] = scanner.nextInt();
    }
}
        
        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\n<-------------------------------------->");
        
        System.out.println("\nDiagonal principal:");
        for(int i = 0; i < 4; i++) {
        }
        System.out.print("\nValores:     ");
        for(int i = 0; i < 4; i++) {
            System.out.print("\n[" + (i + 1) + "][" + (i + 1) + "] = " + matriz[i][i] + "\t");
        }
        
        System.out.println("\n<-------------------------------------->");
        
        System.out.println("\n Diagonal secundária:");
        for(int i = 0; i < 4; i++) {
        }
        System.out.print("\nValores:     ");
        for(int i = 0; i < 4; i++) {
            System.out.print("\n[" + (i + 1) + "][" + (i + 1) + "] = " + matriz[i][3 - i] + "\t");
        }
        
    }
    
}
