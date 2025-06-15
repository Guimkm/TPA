package com.mycompany.reajustesaldo;
import javax.swing.JOptionPane;

public class ReajusteSaldo {
    public static void main(String[] args) {
        // Entrada do saldo
        double saldo = Double.parseDouble(
            JOptionPane.showInputDialog("Digite o saldo:"));

        // Cálculo do reajuste
        double saldoReajustado = saldo * 1.01;

        // Saída formatada
        JOptionPane.showMessageDialog(null,
            String.format("Saldo original: R$ %.2f%nSaldo com reajuste: R$ %.2f",
                saldo, saldoReajustado));
    }
}