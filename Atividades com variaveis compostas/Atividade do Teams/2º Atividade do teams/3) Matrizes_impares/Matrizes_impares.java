package com.mycompany.matrizes_impares;
import java.util.Scanner;
public class Matrizes_impares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
int[][] n = new int[5][5];
int soma = 0;

for(int i = 0;i < 5;i++){
    for(int j = 0;j < 5;j++){
        System.out.print("Digite o valor para a posição ["+ (i + 1) +"] ["+ (j + 1) +"] da matriz:\t");
        n[i][j] = scanner.nextInt();
        
        if(n[i][j] % 2 != 0){
            soma += n[i][j];
        }
    }
}

//----------------------------------------------------------------------------//

System.out.println("\nMatriz digitada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(n[i][j] + "\t");
            }
            System.out.println();
        }
        
//----------------------------------------------------------------------------//
        
for(int j = 0;j < 5; j++){
    int soma_colunas = 0;
    for(int i = 0; i < 5; i++){
        soma_colunas += n[i][j];
    }
    
    System.out.print("\nColuna "+ (j + 1) +" : \t"+ soma_colunas);
}

System.out.println();

//----------------------------------------------------------------------------//

for(int i = 0;i < 5; i++){
    int soma_linhas = 0;
    for(int j = 0; j < 5; j++){
        soma_linhas += n[i][j];
    }
    
    System.out.print("\nLinha "+ (i + 1) +" :\t"+ soma_linhas);
    
}scanner.close();

    }
    
}

