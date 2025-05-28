
package com.mycompany.criador_de_tabuadas;

import java.util.Scanner;

public class Criador_de_tabuadas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escreva o o numero que deseja utilizar: ");
        double numero = scanner.nextDouble();
        
        
         System.out.print("Escreva o simbolo do tipo de operacao voce vai querer: ");
        char operacao = scanner.next().charAt(0);
        scanner.close();
        double r1;
        double r2;
        double r3;
        double r4;
        double r5;
        double r6;
        double r7;
        double r8;
        double r9;
        double r10;
        switch (operacao){
            case '-':
            r1 = numero - 1;
            r2 = numero - 2;
            r3 = numero - 3;
            r4 = numero - 4;
            r5 = numero - 5;
            r6 = numero - 6;
            r7 = numero - 7;
            r8 = numero - 8;
            r9 = numero - 9;
            r10 = numero - 10;
            break;
            
            case '+':
            r1 = numero + 1;
            r2 = numero + 2;
            r3 = numero + 3;
            r4 = numero + 4;
            r5 = numero + 5;
            r6 = numero + 6;
            r7 = numero + 7;
            r8 = numero + 8;
            r9 = numero + 9;
            r10 = numero + 10;
                break;
            case '*':
            r1 = numero * 1;
            r2 = numero * 2;
            r3 = numero * 3;
            r4 = numero * 4;
            r5 = numero * 5;
            r6 = numero * 6;
            r7 = numero * 7;
            r8 = numero * 8;
            r9 = numero * 9;
            r10 = numero * 10;
                break;
            case '/':
            r1 = numero / 1;
            r2 = numero / 2;
            r3 = numero / 3;
            r4 = numero / 4;
            r5 = numero / 5;
            r6 = numero / 6;
            r7 = numero / 7;
            r8 = numero / 8;
            r9 = numero / 9;
            r10 = numero / 10;
            break;
            
            default:
            System.out.println("Essa operação é invalida.");
            return;
            
        }
        
        
        
        System.out.println("Essa e a tabela: ");
        System.out.println(numero+" "+operacao+" 1 = "+r1);
        System.out.println(numero+" "+operacao+" 2 = "+r2);
        System.out.println(numero+" "+operacao+" 3 = "+r3);
        System.out.println(numero+" "+operacao+" 4 = "+r4);
        System.out.println(numero+" "+operacao+" 5 = "+r5);
        System.out.println(numero+" "+operacao+" 6 = "+r6);
        System.out.println(numero+" "+operacao+" 7 = "+r7);
        System.out.println(numero+" "+operacao+" 8 = "+r8);
        System.out.println(numero+" "+operacao+" 9 = "+r9);
        System.out.println(numero+" "+operacao+" 10 = "+r10);

    }
    
}
