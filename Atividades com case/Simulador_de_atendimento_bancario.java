package com.mycompany.simulador_de_atendimento_bancario;

import java.util.Scanner;

public class Simulador_de_atendimento_bancario {

    public static void main(String[] args) {
        double saldo = 1000.00;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o numero para escolher o tipo ação ");
        System.out.println("1 para consultar saldo");
        System.out.println("2 para sacar dinherio");
        System.out.println("3 para depositar dinheiro");
        System.out.println("4 para encerrar atendimento");
        System.out.println("Escreva aqui:   ");
        int acao = scanner.nextInt();
        switch(acao){
            case 1:
                System.out.println("Seu saldo disponivel é: RS 1000.00");
                break;
                case 2:
                System.out.println("Digite a quantidade de dinheiro que voce ira sacar:   ");
                int saque = scanner.nextInt();
                saldo = saldo - saque;
                System.out.println("Agora voce tem RS " + saldo + " de saldo na sua conta");
                break;
                case 3:
                System.out.println("Digite aquantiadade de dinheiro que voce quer depositar:   ");
                 int deposito = scanner.nextInt();
                saldo = saldo + deposito;
                break;
                case 4:
                System.out.println("Seu atendimento foi encerrado");
                break;
                default:
                System.out.println("Numero invalido");
        }
        
    }
    
}
