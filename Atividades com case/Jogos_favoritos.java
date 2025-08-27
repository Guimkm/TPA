package com.mycompany.jogos_favoritos;
import java.util.Scanner;
public class Jogos_favoritos {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um numero de 1 a 5:  ");
        
        int resposta = scanner.nextInt();
        switch(resposta){
            case 1:
                System.out.println("Minecraft");
                break;
            case 2:
                System.out.println("Brawl Stars");
                break;
            case 3:
                System.out.println("Call of Duty");
                break;
            case 4:
                System.out.println("Free Fire");
                break;
            case 5:
                System.out.println("FIFA");
                break;
                
            default:
                System.out.println("Jogo nao encontrado");
        }
    }
    
}
