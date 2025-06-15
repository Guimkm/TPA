package com.mycompany.antecessorsucessor;

import javax.swing.JOptionPane;

public class AntecessorSucessor {
    public static void main(String[] args) {
        // Entrada do número
        int numero = Integer.parseInt(
            JOptionPane.showInputDialog("Digite um número inteiro:"));

        // Cálculos
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        // Saída
        JOptionPane.showMessageDialog(null,
            "Número: " + numero + "\n" +
            "Antecessor: " + antecessor + "\n" +
            "Sucessor: " + sucessor);
    }
}