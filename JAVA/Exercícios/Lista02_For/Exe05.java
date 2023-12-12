//Descreva um algoritmo que leia a altura de 5 pessoas e calcule a média de altura das mesmas.
package Lista02_For;
import java.util.Scanner;
public class Exe05 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        float soma = 0, media = 0;

        for (int i = 0; i <= 4; i++) {
            System.out.print("Informe a altura em centímetro: ");
            float altura = kb.nextFloat();
            
            altura++;
            soma =+ altura;
            media = soma / altura++; 
        }

        System.out.println("A média das alturas é: " + media);

        kb.close();
    }
}
