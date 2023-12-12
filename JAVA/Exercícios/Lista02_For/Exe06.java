//Descreva um algoritmo que vá lendo a altura de pessoas até o usuário entrar com o número 0. Calcule a média de altura das mesmas.
package Lista02_For;
import java.util.Scanner;
public class Exe06 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        float media = 0, soma = 0, cont = 0;
        
        System.out.print("Informe a altura (0 - para parar): ");
        float altura = kb.nextFloat();
        
        while (altura != 0) {

            soma += altura;
            
            System.out.print("Informe a altura (0 - para parar): ");
            altura = kb.nextFloat();
            cont++; //pode estar em qualquer lugar do while
        }
        
        media = soma / cont; 
        
        System.out.println(media);

        kb.close();
    }
}