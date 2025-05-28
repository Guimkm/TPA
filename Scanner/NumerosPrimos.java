package com.mycompany.numerosprimos;

import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        if (verificaPrimo(numero)) {
            System.out.println(numero + " é um numero primo.");
        } else {
            System.out.println(numero + " nao e um numero primo.");
        }

    }
    // Função para verificar se um número é primo
    public static boolean verificaPrimo(int numero) {
        // 1 não é primo, 2 é o único primo par
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        // Verifica se é divisível por 2 ou 3 (para otimizar)
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }

        // Testar divisibilidade até a raiz quadrada do número
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}