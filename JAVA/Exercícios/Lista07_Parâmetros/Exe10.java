/*Faça um código que recebe uma palavra do usuário, se essa palavra tem tamanho par, retorne o primeiro caracter dessa palavra.
Caso ela tenha tamanho ímpar, retorne o segundo caracter dessa palavra. */
package Lista07_Parâmetros;
import java.util.Scanner;
public class Exe10 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Entre com uma palavra: ");
        String palavra = kb.next();

        System.out.println("O caractere resultante é: " + retornarCaracter(palavra));

        kb.close();
    }

    public static char retornarCaracter(String palavra) {

        if (palavra.length() % 2 == 0) {
            return palavra.charAt(0);
        } else {
            return palavra.charAt(1);
        }
    }
}