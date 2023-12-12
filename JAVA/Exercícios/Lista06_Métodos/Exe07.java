/*Faça um programa que receba um número, esse será o número "base" Depois faça o usuário entrar com mais dois números
Imprima qual dos dois últimos números está mais perto do primeiro número "base" */
package Lista06_Métodos;
import java.util.Scanner;
public class Exe07 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Entre com o número base: ");
        double numeroBase = kb.nextDouble();

        System.out.println("Informe dois números a serem comparados com o número base: ");
        double valor01 = kb.nextDouble();
        double valor02 = kb.nextDouble();

        verificarValores(numeroBase, valor01, valor02);
        kb.close();
    }

    public static void verificarValores(double numeroBase, double valor01, double valor02) {

        if (Math.abs(numeroBase - valor01) > Math.abs(numeroBase - valor02)) {
            System.out.println("O número " + valor02 + " está mais próximo do número base");
        } else {
            System.out.println("O número " + valor01 + " está mais próximo do número base");
        }  
    }
}
