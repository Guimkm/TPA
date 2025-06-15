package com.mycompany.calculopecasipi;
import javax.swing.JOptionPane;

public class CalculoPecasIPI {
    public static void main(String[] args) {
        // Entrada de dados
        double ipi = Double.parseDouble(
            JOptionPane.showInputDialog("Digite a porcentagem do IPI:"));
        
        // Peça 1
        int codigo1 = Integer.parseInt(
            JOptionPane.showInputDialog("Código da peça 1:"));
        double valor1 = Double.parseDouble(
            JOptionPane.showInputDialog("Valor unitário da peça 1:"));
        int quant1 = Integer.parseInt(
            JOptionPane.showInputDialog("Quantidade da peça 1:"));
        
        // Peça 2
        int codigo2 = Integer.parseInt(
            JOptionPane.showInputDialog("Código da peça 2:"));
        double valor2 = Double.parseDouble(
            JOptionPane.showInputDialog("Valor unitário da peça 2:"));
        int quant2 = Integer.parseInt(
            JOptionPane.showInputDialog("Quantidade da peça 2:"));

        // Cálculo do valor total
        double valorTotal = (valor1 * quant1 + valor2 * quant2) * (ipi/100 + 1);

        // Saída formatada
        String resultado = String.format(
            "Peça %d: %d x R$ %.2f = R$ %.2f%n" +
            "Peça %d: %d x R$ %.2f = R$ %.2f%n" +
            "IPI: %.2f%%%n" +
            "VALOR TOTAL: R$ %.2f",
            codigo1, quant1, valor1, valor1*quant1,
            codigo2, quant2, valor2, valor2*quant2,
            ipi, valorTotal);

        JOptionPane.showMessageDialog(null, resultado);
    }
}