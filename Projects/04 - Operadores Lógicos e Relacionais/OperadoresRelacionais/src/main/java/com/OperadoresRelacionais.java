/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLEditorKit.Parser;

/**
 *
 * @author victo
 */
public class OperadoresRelacionais {
        public static void main(String args[]) {
    
        /***
         * Todos os Operadores Relacionais
         */

        JOptionPane.showMessageDialog(null, "Carregando......", "Todos os Operadores Relacionais", JOptionPane.INFORMATION_MESSAGE);
        
        String nu1 = JOptionPane.showInputDialog(null, 
        "Digite o primeiro valor: ", "Número 1", JOptionPane.QUESTION_MESSAGE);

        String nu2 = JOptionPane.showInputDialog(null, "Digite o segundo valor: ",
        "Número 2", JOptionPane.QUESTION_MESSAGE);

        int n1 = Integer.parseInt(nu1);
        int n2 = Integer.parseInt(nu2);

        // Sinal de (Maior) > usando para descobrir se é true or false

        int r1 = (n1>n2)?n1+n2:n1-n2;

        /**
         * Se a função for true n1 vai somar com n2.
         * Porém se a função for false n1 vai subtrair com n2. 
         */

        JOptionPane.showMessageDialog(null, "Essa função é " +r1, "Sinal de Maior", JOptionPane.INFORMATION_MESSAGE);

        // Sinal de (Menor) < usando para descobrir se é true or false
        
        int r2 = (n1<n2)?n1*n2:n1/n2;

        /**
         * Se a função for true n1 vai multiplicar com n2.
         * Porém se a função for false n1 vai subtrair com n2.
         */

        JOptionPane.showMessageDialog(null, "Essa função é " +r2, "Sinal de Menor", JOptionPane.INFORMATION_MESSAGE);
        
        // Sinal de (Maior ou igual) >= usando para descobrir se é true or false

        int r3 = (r1>=r2)?r1-2:r2+3;

        /**
         * Aqui vai mostrar qual a função maior ou igual.
         * 
         * Ex: se r1 = 1 e r2 = 2, o r1 vai subtrair -2 e 
         * será mostrado na tela "O Resultado é -1".
         */

        JOptionPane.showMessageDialog(null, "O Resultado é " +r3, "Maior ou igual", JOptionPane.INFORMATION_MESSAGE);
        
        // Sinal de (Menor ou igual) <= usando para descobrir se é true or false

        float r4 = (r1<=r2)?r1/3:r2*2;

        /**
         * Aqui vai mostrar qual a função menor ou igual.
         * 
         * Ex: se r1 = 4 e r2 = 2, o r2 vai multiplicar *2
         * e será mostrado na tela "O Resultado é 4".
         */

        JOptionPane.showMessageDialog(null, "O Resultado é " +r4, "Menor ou igual", JOptionPane.INFORMATION_MESSAGE);
        
        // Sinal de (Igual a) == usando para descobrir se é true or false

        float r5 = (r3==r4)?r3+3:r4-4;

        /**
         * Aqui o pragrama vai ver se r3 e r4 são iguais e
         * realizar ou soma ou subtração. É parecido com os
         * codigos anteriores.
         */

         JOptionPane.showMessageDialog(null, "O Resultado é " +r5, "Igual a", JOptionPane.INFORMATION_MESSAGE);
        
        // Sinal de (Diferente de) != usando para descobrir se é true or false

        float r6 = (r3!=r4)?r3+r4:r3-r4;

        /**
         * Aqui é a mesma coisa da primeira função.
         * Se for true vai somar r3+r4, 
         * Se for false vai subtarir r3-r4.
         */

        JOptionPane.showMessageDialog(null, "O Resultado é " +r6, "Diferente de", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
