package com.mycompany.nomes_ordenados;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Nomes_ordenados {
    public static void main(String[] args) {
        System.out.println("Digite a quantidade de nomes que deseja colocar:  ");
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        String[] nomes = new String[n];
        
        System.out.println("Digite "+n+" nomes:  ");
        for (int i = 0;i < n; i++) {
    System.out.print("Nome "+(i + 1)+": ");
        nomes[i] = scanner.nextLine();
    
        }
        
        Arrays.sort(nomes);
        System.out.println("Nomes em ordem crescente:  ");
        for (String nome : nomes) {
            System.out.println(nome);

        }
        System.out.println();

        Arrays.sort(nomes, Collections.reverseOrder());
        System.out.println("Nomes em ordem decrescente:  ");
        for(String nome : nomes) {
            System.out.println(nome);
        }


    }
}