
package com.mycompany.switch_case_com_frutas;
import java.util.Scanner;
public class Switch_case_com_frutas {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um numero de 1 a 3:  ");
        
        int resposta = scanner.nextInt();
        switch(resposta){
            case 1:
                System.out.println("Abacaxi");
                break;
            case 2:
                System.out.println("pitaya");
                break;
            case 3:
                System.out.println("acerola");
                break;
                
                
            default:
                System.out.println("Fruta invalida!");
        }
    }
}
