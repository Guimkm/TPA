/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tiposprimitivos;

/**
 *
 * @author Guilherme Araujo
 */
public class TiposPrimitivos {
    public static void main(String[] args) {
         //
       byte idade = 24; //idade em anos da padaria     
       short AnoDeCriação = 2001; //ano em que a padaria foi criada
       int ClientesPorDia = 120; // Média da quantidade de clintes
       long QuantidadeDeFuncionarios = 21; //quantidade de funcinarios na padaria           
       
       float AlturaMédiaDoFuncinarios = 1.75f; 
       double PesoMédioDosFuncionarios = 72.2; 
       
       char InicialDaPadaria = 'P'; //letra inicial da padaria
       boolean ativo = true; // diz se o fato é verdadeiro ou falso
       
       //Exibição dos valores
       System.out.println ("Idade: " + idade ); 
       System.out.println ("Ano de criação: " + AnoDeCriação ) ;
       System.out.println ("Clientes por dia: " + ClientesPorDia) ;       
       System.out.println ("quantidade de funcionarios: " + QuantidadeDeFuncionarios) ;
       System.out.println ("Altura média: " + AlturaMédiaDoFuncinarios + "m") ;
       System.out.println ("Peso médio: " + PesoMédioDosFuncionarios + "kg") ;
       System.out.println ("Inicial do nome: " + InicialDaPadaria) ; 
       System.out.println ("Está ativo?" + ativo) ;
    }
    
}