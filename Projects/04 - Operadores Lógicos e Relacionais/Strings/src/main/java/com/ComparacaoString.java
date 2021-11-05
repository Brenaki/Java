/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author victo
 */
public class ComparacaoString {
    
    public static void main(String[] args) {
        
        /**
         * Ainda em Operações Relacionais 
         * agora vamos ver em String se funciona a comparação.
         */
        
        String nome1 = "Victor";
        
        String nome2 = "Victor";
        
        String nome3 = new String("Victor");
        
        //String res = (nome1==nome2)?"igual":"diferente"; Resultado é igual
        
        //String res = (nome1==nome3)?"igual":"diferente"; Resultado é diferente
        
        String res = (nome1.equals(nome3))?"igual":"diferente"; // Resultado é igual
        
        System.out.println(res);
        
    }
    
}
