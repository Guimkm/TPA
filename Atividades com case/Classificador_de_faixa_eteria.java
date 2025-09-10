package com.mycompany.classificador_de_faixa_eteria;

import java.util.Scanner;

public class Classificador_de_faixa_eteria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva a sua idade aqui:   ");
        
        int idade = scanner.nextInt();
        switch(idade){
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12:

                System.out.println("Voce é uma criança");
                break;
                case 13, 14, 15, 16, 17:
                System.out.println("voce é um adolescente");
                break;
                case 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59:
                System.out.println("Voce é um adulto");
                break;
                
                default:
                if (idade >= 60 && idade <= 999999){
                System.out.println("Você é um idoso");
                } else {System.out.println("Numero invalido!");}
        }
        
    }
    
}
