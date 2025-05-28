/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.calculosmatematicos;

/**
 *
 * @author FATEC ZONA LESTE
 */
  // Eu Guilherme Araujo Carneiro Da Silva desenvolvi esses calculos matemáticos

public class CalculosMatematicos {
    public static void main(String[] args) {
        // Definição de dois numeros
        double num1 = 10.75;
        double num2 = 14.60;
        
        // Realização das operações matematicas
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num2 != 0 ? num1 / num2 : Double.NaN;//serve prar evitar a evitar divisao por zero
        double resto = num1 % num2;
        
        //exibição dos resultados dados
        
        System.out.println("Resultado das operações:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisao: " + (num2 != 0 ? divisao : "Indefinida (divisisão por zero"));
        System.out.println("Resto da divisão: " + resto);
        
        
    }
    
}
