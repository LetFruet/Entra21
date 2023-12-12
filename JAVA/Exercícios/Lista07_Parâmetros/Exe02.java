/*Faça um método booleano que retorne true se o número passado como parâmetro seja par. Retorno false caso seja impar. */
package Lista07_Parâmetros;
import java.util.Scanner;
public class Exe02 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Informe um número. Será retornado true caso o número for par e false caso for ímpar");
        double numero = kb.nextDouble();

        System.out.println(verificar(numero));
        kb.close();
    }

    public static boolean verificar(double numero) {
        
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
