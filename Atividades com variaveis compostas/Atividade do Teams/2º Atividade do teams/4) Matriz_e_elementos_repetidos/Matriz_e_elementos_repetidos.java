package com.mycompany.matriz_e_elementos_repetidos;

import java.util.Scanner;

public class Matriz_e_elementos_repetidos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[3][5];
        int impares = 0;
        int pares = 0;
        boolean possuiRepetidos = false;

        // Leitura da matriz
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("Digite o valor para a posição ["+ (i + 1) +"] ["+ (j + 1) +"] da matriz:\t");
                matriz[i][j] = scanner.nextInt();
                
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else { 
                    impares++;
                }        
            }
        }

        // Verificação de elementos repetidos (corrigido)
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                int elementoAtual = matriz[i][j];
                int contador = 0;
                
                for(int x = 0; x < 3; x++){
                    for(int y = 0; y < 5; y++){
                        if(matriz[x][y] == elementoAtual){ 
                            contador++;
                        }
                    }
                }  
                
                if(contador > 1){ 
                    possuiRepetidos = true;
                    break;
                } 
            }
            if (possuiRepetidos) {
                break;
            }
        }

        // Exibição dos resultados
        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 5; j++) { 
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\n<---------------------------------------------------------->");
        
        if(possuiRepetidos){
            System.out.println("Sim, a matriz tem números repetidos.");
        } else {
            System.out.println("Não, a matriz não tem números repetidos.");
        }
        
        System.out.println("\n<---------------------------------------------------------->");
        
        System.out.println("A matriz tem "+ impares +" números ímpares.");
        
        System.out.println("\n<---------------------------------------------------------->");
        
        System.out.println("A matriz tem "+ pares +" números pares.");
        
        scanner.close();
    }
    
}
