
package com.mycompany.calculadora_de_tarifa_de_transportes;

import java.util.Scanner;

public class Calculadora_de_tarifa_de_transportes {

    public static void main(String[] args) {
        double preco = 0;
        String tipo = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o numero para escolher o tipo de bilhete ");
        System.out.println("1 para onibus urbano");
        System.out.println("2 para metrô");
        System.out.println("3 para trem intermunicipal");
        System.out.println("4 para onibus rodoviario");
        System.out.println("Escreva aqui:   ");
        
        int tipodebihete = scanner.nextInt();
        switch(tipodebihete){
            case 1:
                preco = 4.40;
                tipo = "Onibus urbano";
                System.out.println("Onibus urbano");
                break;
                case 2:
                preco = 5.00;
                tipo = "Metrô";
                System.out.println("Metrô");
                break;
                case 3:
                preco = 6.50;
                tipo = "Trem intermunicipal";
                System.out.println("Trem intermunicipal");
                break;
                case 4:
                preco = 12.00;
                tipo = "Onibus rodoviario";
                System.out.println("Onibus rodoviario");
                break;
                
                default:
                System.out.println("Numero invalido");
        }
        System.out.println("Escreva a quantidade de bilhetes que voce comprara:   ");
        double total = scanner.nextInt();
        double resultado = total * preco;
        System.out.println("Voce ira comprar bilhetes para o " + tipo + " que iram custar  R$" + resultado + "0");
       
    }
    
}
