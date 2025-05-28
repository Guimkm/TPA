package com.mycompany.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner (System.in);
        System.out.print("Escreva o primeiro numero que deseja");
        double n1 = scanner.nextDouble();
        System.out.print("Escreva o segundo numero que deseja");
        double n2 = scanner.nextDouble();
        
         System.out.print("Digite o simbolo da operacao que deseja fazer:");
        char operacao = scanner.next().charAt(0);
        scanner.close();
        double result;
        switch (operacao){
            case '-':
            result = n1 - n2;
            break;
            case '+':
                result = n1 + n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
            result = n1 / n2;
            break;
            default:
            System.out.println("Essa operação é invalida.");
            return;
            
        }
        System.out.println(n1+" "+operacao+" "+n2+"; "+result);
        
    }
}
