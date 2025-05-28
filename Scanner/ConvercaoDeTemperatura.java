package com.mycompany.convercaodetemperatura;

import java.util.Scanner;

public class ConvercaoDeTemperatura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = entrada.nextDouble();

        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperatura em Celsius: " + celsius);
        System.out.println("Temperatura em Kelvin: " + kelvin);
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
    }
}