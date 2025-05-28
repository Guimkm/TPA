package com.mycompany.calculadora_da_media_dos_alunos;

import java.util.Scanner;

public class Calculadora_da_media_dos_alunos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escreva o a primeira nota do aluno:");
        double n1 = scanner.nextDouble();
        System.out.print("Escreva o a segunda nota do aluno:");
        double n2 = scanner.nextDouble();
        System.out.print("Escreva o a terceira nota do aluno:");
        double n3 = scanner.nextDouble();
        System.out.print("Escreva o a ultima nota do aluno:");
        double n4 = scanner.nextDouble();
        
        double resultado = (n1 + n2 + n3 + n4) / 4;
        
        System.out.println("Media do aluno: " +resultado);
                
    }
    
}
