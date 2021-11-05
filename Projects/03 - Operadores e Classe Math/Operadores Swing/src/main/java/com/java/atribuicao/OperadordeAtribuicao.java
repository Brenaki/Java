/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.atribuicao;

/**
 *
 * @author victo
 */
public class OperadordeAtribuicao {
    
    public static void main(String[] args){
        
        int w = 4;
        w += 2; // w = w + 2
        System.out.println("Aqui usamos 4 += 2, e o resultado deu: " +w);
        
        int x = 4;
        x -= 2; // x = x - 2
        System.out.println("Aqui usamos 4 -= 2, e o resultado deu: " +x);
        
        int y = 4;
        y *= 2; // y = y * 2
        System.out.println("Aqui usamos 4 *= 2, e o resultado deu: " +y);
        
        int z = 4;
        z /= 2; // z = z / 2
        System.out.println("Aqui usamos 4 /= 2, e o resultado deu: " +z);
        
        int v = 4;
        v %= 2; // v = v % 2
        System.out.println("Aqui usamos 4 %= 2, e o resultado deu: " +v);
    }
}
