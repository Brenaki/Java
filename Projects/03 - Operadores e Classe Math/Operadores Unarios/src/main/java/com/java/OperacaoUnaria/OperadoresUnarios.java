/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.OperacaoUnaria;

/**
 *
 * @author victo
 */
public class OperadoresUnarios {
    
    public static void main(String[] args){
    
    int n1 = 5;
    n1++;
    System.out.println("Aqui usamos o a++: " +n1);
    
    int n2 = 5;
    n2--;
    System.out.println("Aqui usamos o a--: " +n2);
    
    int n3 = 6;
    int valor1 = 5 + n3++;
    System.out.println("Aqui usamos o a++, porém somamos com 5, mas o '++' está depois do número: " +valor1);
    
    int n5 = 6;
    int valor3 = 5 + ++n5;
    System.out.println("Aqui usamos o a++, porém somamos com 5, mas o '++' está antes do número: " +valor3);
    
    int n4 = 6;
    int valor2 = 5 + n4++;
    System.out.println("Aqui usamos o a++, porém somamos com 5, mas o '--' está depois do número: " +valor2);
    
    int n6 = 6;
    int valor4 = 5 + --n6;
    System.out.println("Aqui usamos o a++, porém somamos com 5, mas o '--' está antes do número: " +valor4);
    }
}
