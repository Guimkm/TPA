package com.mycompany.dia_da_semana;
import java.util.Scanner;
public class Dia_da_semana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um numero de 1 a 7:  ");
        
        int resposta = scanner.nextInt();
        switch(resposta){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terca-feira");
                break;
            case 4:
                System.out.println("Quarta-feria");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
                
                
            default:
                System.out.println("Dia invalido");
        }
    }
}
