/*Descreva um algoritmo que leia 5 números inteiros e escreva, para cada número lido, se o mesmo é par ou ímpar. */
package Lista05_Revisão;
import java.util.Scanner;
public class Exe04 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um valor inteiro: ");
            int valor = kb.nextInt();

            if (valor % 2 == 0) {
                System.out.println("O número é par!");
            } else {
                System.out.println("O número é ímpar!");
            }
        }
        kb.close();
    }
}
