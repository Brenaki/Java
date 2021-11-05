
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
public class ProgramaIdade {
    
    public static void main(String[] args){
    
    // Para poder digitar    
    Scanner teclado = new Scanner(System.in);
    
        // Coleta de dados
            
            System.out.println("Digite o ano do seu Nascimento: ");
                int nasc = teclado.nextInt();
                
        // Calculo
        
            int id = (2021-nasc);
            System.out.println("Você tem " +id +" anos.");
            
        // if and else
        
            if(id>=18) {
                System.out.println("Você é maior de idade");
            }
            else{
                System.out.println("Você é menor de idade");
            }
    
    }
}
