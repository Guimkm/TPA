package com.mycompany.CalculoMedias;
import javax.swing.JOptionPane;

public class CalculoMedias {
    
    public static void main(String[] args) {
        // Primeira média (8,9,7)
        double media1 = (8 + 9 + 7) / 3.0;
        
        // Segunda média (4,5,6)
        double media2 = (4 + 5 + 6) / 3.0;
        
        // Soma das médias
        double somaMedias = media1 + media2;
        
        // Média das médias
        double mediaDasMedias = somaMedias / 2;

        // Resultado formatado
        String resultado = String.format(
            "Média 1 (8,9,7): %.2f%n" +
            "Média 2 (4,5,6): %.2f%n" +
            "Soma das médias: %.2f%n" +
            "Média das médias: %.2f",
            media1, media2, somaMedias, mediaDasMedias);

        JOptionPane.showMessageDialog(null, resultado);
    }
}