
package com.mycompany.quantas_questoes_voce_acertou;
 import java.util.Scanner;
public class Calculadora_para_ano_bissexto {


    public static void main(String[] args) {
        
        
        Scanner inUser = new Scanner(System.in);
        System.out.println("Quantas questões você acertou ?");
        int resposta = inUser.nextInt();
        
        switch(resposta){
            case 1:
            case 2:
            case 3:
            case 4:
            System.out.println("voce tirou um I");
            break;
            
            case 5:
            case 6:
                System.out.println("Voce tirou um R");
                break;
            case 7:
            case 8:
                System.out.println("Voce tirou um B");
                break;
            case 9:
            case 10:
                System.out.println("Voce tirou um MB");
                break;
                
                default:
                System.out.println("Valor de entrada invalido");
            
        }
        
        
    }
    
}
