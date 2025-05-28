package com.mycompany.dados_do_usuario;
import java.util.Scanner;
public class Dados_do_usuario {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Escreva seu nome:");
        String Nome = scanner.nextLine();
        
        System.out.print("Escreva seu nome:");
        String nascimento = scanner.nextLine();
        
        System.out.print("Escreva seu curso:");
        String Curso = scanner.nextLine();
        
        System.out.print("Escreva sua serie:");
        double Serie = scanner.nextDouble();
        
        System.out.print("Escreva seu altura:");
        double Altura = scanner.nextDouble();
        
        System.out.print("Escreva seu peso:");
        double Peso = scanner.nextDouble();
        
        //dados completos
        System.out.print("Seu nome e: " +Nome);
        System.out.print("Nasceu em: " +nascimento);
        System.out.print("Esta do curso: " +Curso);
        System.out.print("Esta na serie: " +Serie);
        System.out.print("Tem de altura: " +Altura);
        System.out.print("Pesa: " +Peso);
        
        
        
        
    }
    
}
