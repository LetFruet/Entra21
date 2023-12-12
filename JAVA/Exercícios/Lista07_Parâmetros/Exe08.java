/*Faça um programa que receba 2 números do usuário. Faça um método que descubra qual dos números é maior e retorne esse valor.
Se os dois números forem iguais, retorne: número iguais. */
package Lista07_Parâmetros;
import java.util.Scanner;
public class Exe08 {
 
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Informe dois valores a serem comparados: "); 
        double valor01 = kb.nextDouble();
        double valor02 = kb.nextDouble();

        System.out.println(compararValores(valor01, valor02));

        kb.close();
    }

    public static String compararValores(double valor01, double valor02) {

        if (valor01 > valor02) {
            return "O valor " + valor01 + " é o maior";
        } else if (valor02 > valor01) {
            return "O valor " + valor02 + " é o maior";
        } else {
            return "Os valores são iguais";
        }
    }
}