package com.mycompany.conometro;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Conometro {

    public static void main(String[] args) throws InterruptedException {  // "Avisa" que este método pode ser interrompido durante waits/sleeps
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tempo que o conometro irá ter:  ");
        int n = scanner.nextInt();
        

        for (int t = 0;t <= n;t++){
            
            System.out.println("Segundos: " + t);
            TimeUnit.SECONDS.sleep(1);// Esse código serve para esperar um segundo até a proxima ação
        }
                
            
            
    }
}
