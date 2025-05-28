package com.mycompany.calculosdearea;

/**
 *
 * @author Guilherme Araujo Carneiro Da Silva
 */
public class CalculosDeArea {

    public static void main(String[] args) {
      
        //informações do quadrado
        double BaseDoQuadrado = 42;
        double AlturaDoQuadrado = 42;
        //calculo do quadrado
        double ResultaDaAreadDoQuadrado = BaseDoQuadrado * AlturaDoQuadrado;
        //resultado da area do quadrado
        
          System.out.println("Resultado da area do quadrado:" + ResultaDaAreadDoQuadrado);
        
          //informações do retangulo
        double BaseDoRetangulo = 37;
        double AlturaDoRetangulo = 29;
        //calculo do retangulo
        double ResultaDaAreadDoRetangulo = BaseDoRetangulo * AlturaDoRetangulo;
        //resultado da area do retangulo
        
        System.out.println("Resultado da area do retangulo:" + ResultaDaAreadDoRetangulo);
         
          //informações do Losangulo
        double DiagonalMenorDOLosangulo = 49.2;
        double DiagonalMaiorDoLosangulo = 54.92;
        //calculo do losangulo
        double ResultaDaAreadDoLosangulo = DiagonalMenorDOLosangulo * DiagonalMaiorDoLosangulo  /2;
        //resultado da area do losangulo
        
        System.out.println("Resultado da area do losangulo:" + ResultaDaAreadDoLosangulo);
        
          //informações do triangulo
        double BaseDoTriangulo = 38;
        double AlturaDoTriangulo = 90;
        //calculo do 
        double ResultaDaAreadDoTriangulo = BaseDoTriangulo * AlturaDoTriangulo /2;
        //resultado da area do trangulo
        
       System.out.println("Resultado da area do triangulo:" + ResultaDaAreadDoTriangulo);
        
          //informações da circuferencia
        double Raio = 39;
        //calculo da circuferencia
        double ResultaDaAreadDaCircuferencia = 2 * 3.14 * Raio;
        //resultado da area da circuferencia
        
        System.out.println("Resultado da area do circuferencia:" + ResultaDaAreadDaCircuferencia);

         //informação da média
         double num1 = 27;
         double num2 = 38;
         double num3 = 24;
         double num4 = 14;
         double num5 = 2;
         double num6 = 29;
         double num7 = 35;
         //calculo da média
        double ResultadoDaMedia = (num1 + num2 + num3 + num4 + num5 + num6 + num7) /7;
        //resultado da média
        System.out.println("Resultado da media:" + ResultadoDaMedia);
        
        
        //numeros para a soma 
        double n1 = 57;
        double n2 = 64;
        //calculo da soma 
        double ResultadoDaSoma = n1 + n2;
        //resultado da soma 
        System.out.println("Resultado da soma:" + ResultadoDaSoma);
        
         
        //numeros para a subtração
        double n1sub = 54;
        double n2sub = 22;
        //calculo da soma 
        double ResultadoDaSubitracao = n1sub + n2sub;
        //resultado da soma 
        System.out.println("Resultado da subtracao:" + ResultadoDaSubitracao);
        
        
            
        //numeros para a divisão
        double n1div = 54;
        double n2div = 2;
        //calculo da divisão
        double ResultadoDaDivisao = n1div / n2div;
        //resultado da divisão
        System.out.println("Resultado da divisão:" + ResultadoDaDivisao);
        
            
        //numeros para a multiplicação
        double n1mult = 19.18;
        double n2mult = 4;
        //calculo da multiplicação
        double ResultadoDaMultiplicacao = n1mult / n2mult;
        //resultado da multiplicação
        System.out.println("Resultado da multiplicacao:" + ResultadoDaMultiplicacao);
        
        
        
        
    }
}
