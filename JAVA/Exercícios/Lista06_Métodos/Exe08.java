/*Faça um código que receba duas entradas do usuário. Imprima essas duas entradas ao cubo se:
Algum dos dois números for 5
A soma deles é 5
A diferença deles é 5
Se nenhuma dessas condições forem satisfeitas, imprima o quadrado dos números. */
package Lista06_Métodos;
import java.util.Scanner;
public class Exe08 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Entre com dois valores: ");
        double valor01 = kb.nextDouble();
        double valor02 = kb.nextDouble();

        verificarValores(valor01, valor02);

        kb.close();
    }

    public static void verificarValores(double valor01, double valor02) {

        if (valor01 == 5) {
            System.out.println("Valor 1 é 5 \nValores ao cubo: " + valor01*valor01*valor01 + " | " + valor02*valor02*valor02);
        } else if (valor02 == 5) {
            System.out.println("Valor 2 é 5");
        } else if (valor01 + valor02 == 5) {
            System.out.println("A soma dos valores é 5 \nValores ao cubo: " + valor01*valor01*valor01 + " | " + valor02*valor02*valor02);
        } else if (valor01 - valor02 == 5) {
            System.out.println("A diferença dos valores é 5 \nValores ao cubo: " + valor01*valor01*valor01 + " | " + valor02*valor02*valor02);
        } else {
            valor01 *= 2;
            valor02 *= 2;
            System.out.println("Os valores, a soma e o produto NÃO são 5 \nValores ao quadrado: " + valor01 + " | " + valor02);
        }

    }
}
