import java.*;

public class Jv {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int f = 1;

        System.out.println("Digite um valor: ");
        int n = teclado.nextInt();

        if(n>=0){

            for(int i = 1; i <= n; i++){

                f = f *i;

            }

            System.out.println("Fatorial é " +f);

        }

        else{

            System.out.println("Informe números a partir de zero!");

        }
    }

}