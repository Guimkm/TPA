package com.mycompany.calculadora_para_ano_bissexto;

import javax.swing.JOptionPane;

public class Calculadora_para_ano_bissexto {

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Digite um ano para verificar se é bissexto:");
        
        try {  // Define um bloco de código q será monitorado para possiveis exceções. Se uma exceção ocorrer dentro de um bloco try o fluxo de execução é interrompido e o controle passa para um bloco catch corresponde que é usado para tratar a exceção.
            // Converte a entrada para número inteiro
            int anoescrito = Integer.parseInt(input);
            
            // Verifica se é um ano bissexto
            boolean Ano = false; // "boolean" declara uma variável que pode armazenar apenas dois valores: true (verdadeiro) ou false (falso). É usada para representar condições lógicas e controlar o fluxo de execução do programa. 
            
            if (anoescrito % 4 != 0) {
                Ano = false;} // Não é divisível por 4
             else if (anoescrito % 100 != 0) {
                Ano = true;} // Divisível por 4 mas não por 100
             else if (anoescrito % 400 == 0) {
                Ano = true;} // Divisível por 400
             else {
                Ano = false;} // Divisível por 100 mas não por 400
            
            
            // Exibe o resultado
            if (Ano) {
                JOptionPane.showMessageDialog(null, "O ano " + anoescrito + " É bissexto!");
            } else {
                JOptionPane.showMessageDialog(null, "O ano " + anoescrito + " NÃO é bissexto!");
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um número válido para o ano.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
