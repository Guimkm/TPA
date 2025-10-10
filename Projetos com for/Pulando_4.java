package com.mycompany.pulando_4;

public class Pulando_4 {

    public static void main(String[] args) {
        
        System.out.print("Esses sao os numeros de 1 a 30 que nao sao divisiveis por tres:");
        
        for(int n = 1;n <= 30;n++){
            if(n % 4 != 0){ // MOD para separar os multiplos de 4
                System.out.println("Numero: " + n);
            }
        }
    }
    
}
