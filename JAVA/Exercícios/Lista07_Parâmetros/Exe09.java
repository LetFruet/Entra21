/*Faça um programa que receba um número, esse será o número "base". Depois faça o usuário entrar com mais dois números
Retorne qual dos dois últimos números está mais perto do primeiro número "base" */
package Lista07_Parâmetros;
import java.util.Scanner;
public class Exe09 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
    
        System.out.println("Informe o valor base: ");
        double valorBase = kb.nextDouble();

        System.out.println("Informe mais dois números a serem comparados com o valor base: ");
        double valor01 = kb.nextDouble();
        double valor02 = kb.nextDouble();

        System.out.println(verificarValores(valorBase, valor01, valor02));

        kb.close();
    }

    public static String verificarValores(double numeroBase, double valor01, double valor02) {

        if (Math.abs(numeroBase - valor01) > Math.abs(numeroBase - valor02)) {
            return "O número " + valor02 + " está mais próximo do número base";
        } else {
            return "O número " + valor01 + " está mais próximo do número base";
        }  
    }
}
