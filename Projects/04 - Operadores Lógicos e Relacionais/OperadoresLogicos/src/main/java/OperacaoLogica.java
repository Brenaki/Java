/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victo
 */
public class OperacaoLogica {
    
    public static void main(String[] args){
    
        int x, y, z;
        
        x = 4;
        y = 7;
        z = 12;
        
        boolean r, r2, r3, r4, r5;
        
        r = (x<y && y<z)?true:false;
        
        r2 = (x<y && y==z)?true:false;
        
        r3 = (x<y || y==z)?true:false;
        
        r4 = (x<y ^ y==z)?true:false;
        
        r5 = (x<y ^ y<z)?true:false;
        
        System.out.println("A solução 1 é " +r); //true
        
        System.out.println("A solução 2 é " +r2); //false
        
        System.out.println("A solução 3 é " +r3); // true
    
        System.out.println("A solução 4 é " +r4); // true
        
        System.out.println("A solução 5 é " +r5); // false
    }
}
