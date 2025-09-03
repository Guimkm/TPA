
package com.mycompany.classificador_de_faixa_eteria;

import java.util.Scanner;

public class Classificador_de_faixa_eteria {

    public static void main(String[] args) {

        double preco = 0;
        String tipo = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva a sua idade aqui:   ");
        
        int idade = scanner.nextInt();
        switch(idade){
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12:

                System.out.println("Voce é uma criança");
                break;
                case 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23 24 25 26 27 28 29 30, :
                System.out.println("voce é um adolescente");
                break;
                case 18 - 59:
                System.out.println("Voce é um adulto");
                break;
                case 60 - 999999999:
                System.out.println("Voce é umidoso");
                break;
                
                default:
                System.out.println("idade invalida");
        }
        
    }
    
}
