/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiposPrimitivos;

/**
 *
 * @author victo
 */
public class Exercicio {
        /**
         * @param args the command line arguments 
         */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nome = "Victor";
        float nota = 8.5f;
        float nota1 = 2.5f;
        float nota2 = 4.5f;
        
        System.out.println("A nota é " +nota);
        
        System.out.printf("A nota de %s é %.2f \n", nome, nota1);
        
        System.out.format("A nota de %s é %.1f \n", nome, nota2);
    }
}
