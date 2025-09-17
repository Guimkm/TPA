
package com.mycompany.numeros_impares_existentes_entre_dois_numeros;
import java.util.Scanner;
public class Numeros_impares_existentes_entre_dois_numeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Escreva o primeiro numero:  ");
        int n1 = scanner.nextInt();
        System.out.println("Escreva o segundo numero:  ");
        int n2 = scanner.nextInt();
         
        
        if (n1 % 2 != 0){
            n1 += 2;
        }
        else {
        n1 += 1;
    }
        
            if (n2 % 2 != 0) {
                n2 -= 2;
                
            } else {
                n2 -= 1;
            }
                    
            
            int n = n2 / n1;
            int r = ((n1 + n2) * n) / 2;
            
    System.out.println("A soma dos numeros impares existentes entre eles e igual:  " + r);
    }
    
}
