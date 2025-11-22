package com.mycompany.criador_de_matriz;

import java.util.Scanner;

public class Criador_de_matriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//-------------------------------------------//-------------------------------//


        String[][] a = new String[5][4];
        
        for(int i = 0;i < 5;i++){
    for(int j = 0;j < 4;j++){
        System.out.print("Digite a letra para as coordenadas ["+ (i + 1) +"] ["+ (j + 1) +"] da matriz: \t");
        a[i][j] = scanner.nextLine();
    }
}
        
//-------------------------------------------------


        System.out.print("<--------------------------------------------------->");
        int[][] b = new int[4][3];
        System.out.println();
        for(int i = 0;i < 4;i++){
    for(int j = 0;j < 3;j++){
        System.out.print("Digite o valor para as coordenadas ["+ (i + 1) +"] ["+ (j + 1) +"] da matriz: \t");
        b[i][j] = scanner.nextInt();
    }
}
        
        
//-------------------------------------------------


        System.out.print("<--------------------------------------------------->");
        double[][] c = new double[4][3];
        System.out.println();
        for(int i = 0;i < 3;i++){
    for(int j = 0;j < 3;j++){
        System.out.print("Digite o valor para as coordenadas ["+ (i + 1) +"] ["+ (j + 1) +"] da matriz: \t");
        c[i][j] = scanner.nextDouble();
    }
}
        
        
//-------------------------------------//-------------------------------------//

        System.out.println("\nA)");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    //----------------------------------------------//
        System.out.println("\nB)");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    //---------------------------------------------//
        System.out.println("\nC)");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }

    }
    
}

