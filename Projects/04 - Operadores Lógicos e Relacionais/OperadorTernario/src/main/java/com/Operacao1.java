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
public class Operacao1 {
       
    public static void main(String args[]){
        
        int n1, n2, r;
        
        n1 = 3; // n1 = 3 o sistema é true e se o n1 = 13 o sistema é false
        
        n2 = 6;
        
        r = (n1>n2)?0:1;
        
        System.out.println("1 = true 0 = false");
        
        System.out.println("O sistema é " +r);
    }
    
}
