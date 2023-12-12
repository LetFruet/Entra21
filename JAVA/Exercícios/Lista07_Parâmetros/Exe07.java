/*Faça um programa que diz se um número inserido está dentro de um limite imposto pelo usuário. Por exemplo:

Usuário inseriu o limite máximo como 100.
Usuário inseriu o limite mínimo como 70.

Depois ele inseriu o número 80.
O retorno deve ser: 80 está nos limites impostos. */
package Lista07_Parâmetros;
import java.util.Scanner;
public class Exe07 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Informe o limite máximo desejado: ");
        int limiteMaximo = kb.nextInt();

        System.out.println("Informe o limite mínimo desejado: ");
        int limiteMinimo = kb.nextInt();

        System.out.println("Informe um valor a ser comparado: ");
        double valor = kb.nextDouble();

        System.out.println(verificarLimite(limiteMaximo, limiteMinimo, valor));
        kb.close();
    }

    public static String verificarLimite(int limiteMaximo, int limiteMinimo, double valor) {

        if (valor <= limiteMaximo && valor >= limiteMinimo) {
            return valor + " está dentro dos limites impostos";
        } else {
            return valor + "não está dentro dos limites impostos";
        }
    }
}
