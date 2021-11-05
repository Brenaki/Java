/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victo
 */
public class Teste2 {
    
    public static void main(String[] args) {
     
        int r = 0;
        
        while (r<8){
            
            r++;
            if(r == 2 || r == 4) {
            
                continue;
            
            }
            System.out.println("To aqui no " +r);
            
        }
        
        System.out.println("Não tô mais lá no " +r);
    }
}
