
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victo
 */
public class ProgramaMedia {
    
    public static void main(String[] args){
    
        // Para poder digitar
        
        Scanner teclado = new Scanner(System.in);
        
        // Coleta de dados
        
        System.out.println("Digite a primeira nota: ");
        float n1 = teclado.nextFloat();
        
        System.out.println("Digite a segunda nota: ");
        float n2 = teclado.nextFloat();
        
        // Calculo
        
        float m = (n1+n2)/2;
        System.out.println("Sua média foi " +m);
        
        // if and else
        
        if(m>=9) {
            
            System.out.println("Parabéns, você é muito esperto!");
            
        }
        
    }
}
