package com.mycompany.salariosminimos;

import javax.swing.JOptionPane;

public class SalariosMinimos {
    public static void main(String[] args) {
        // Entrada de dados
        double salarioMinimo = Double.parseDouble(
            JOptionPane.showInputDialog("Digite o valor do salário mínimo:"));
        double salarioUsuario = Double.parseDouble(
            JOptionPane.showInputDialog("Digite o valor do seu salário:"));

        // Cálculo
        double qtdSalariosMinimos = salarioUsuario / salarioMinimo;

        // Saída formatada
        JOptionPane.showMessageDialog(null,
            String.format("Você recebe %.2f salários mínimos (R$ %.2f / R$ %.2f)",
                qtdSalariosMinimos, salarioUsuario, salarioMinimo));
    }
}