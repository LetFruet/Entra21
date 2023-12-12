//Descreva um algoritmo que leia 5 números inteiros e escreva, para cada número lido, se o mesmo é par ou ímpar.
package Lista02_For;
import java.util.Scanner;
public class Exe01 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        for (int i = 0; i <= 4; i++) {
            System.out.print("Entre com um valor inteiro: ");
            int num = kb.nextInt();

            if (num % 2 == 0) {
                System.out.println("Número par");
            } else {
                System.out.println("Número ímpar");
            }
        }
        kb.close();
    }
}
