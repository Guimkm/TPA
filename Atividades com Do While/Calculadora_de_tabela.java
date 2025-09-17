package com.mycompany.calculadora_de_tabela;
import java.util.Scanner;

public class Calculadora_de_tabela {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escreva o o numero que deseja utilizar: ");
        double numero = scanner.nextDouble();
        
         System.out.print("Escreva o simbolo do tipo de operacao voce vai querer   (* || / || + || - :  ");
        char operacao = scanner.next().charAt(0);
        scanner.close();
        int Fixo = 1;
        double r;
        switch (operacao){
            case '-':
            System.out.println("Essa e a tabela: ");
                do {
            r = numero - Fixo;
            System.out.println(numero+" "+operacao+" "+ Fixo + " = " + r);
            Fixo += 1;
                } while(Fixo <= 10);
            break;
            
            case '+':
                            System.out.println("Essa e a tabela: ");
                do {
            r = numero + Fixo;
            System.out.println(numero+" "+operacao+" "+ Fixo + " = " + r);
            Fixo += 1;
                } while(Fixo <= 10);
                break;
            case '*':
                        System.out.println("Essa e a tabela: ");
                do {
            r = numero * Fixo;
            System.out.println(numero+" "+operacao+" "+ Fixo + " = " + r);
            Fixo += 1;
                } while(Fixo <= 10);
                break;
            case '/':
            System.out.println("Essa e a tabela: ");
                do {
            r = numero / Fixo;
            System.out.println(numero+" "+operacao+" "+ Fixo + " = " + r);
            Fixo += 1;
                } while(Fixo <= 10);
            break;
            
            
        }
        
    }
    
}
