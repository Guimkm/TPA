package com.mycompany.IdadeParaDias;
import javax.swing.JOptionPane;

public class IdadeParaDias {
    public static void main(String[] args) {
        // Entrada de dados
        int anos = Integer.parseInt(JOptionPane.showInputDialog("Digite os anos:"));
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Digite os meses:"));
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Digite os dias:"));

        // Cálculo
        int totalDias = (anos * 365) + (meses * 30) + dias;

        // Saída
        JOptionPane.showMessageDialog(null, 
            anos + " anos, " + meses + " meses e " + dias + " dias = " + totalDias + " dias");
    }
}