/*Descreva um algoritmo que vá lendo números inteiros até o usuário entrar com o número 0
a) Qual é o menor valor?
b) Qual é o maior valor?
c) Qual é a média dos valores? */
package Lista05_Revisão;
import java.util.Scanner;
public class Exe03 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int menorValor = Integer.MAX_VALUE, maiorValor = Integer.MIN_VALUE, somaValores = 0, cont = 0;

        System.out.println("Informe um número inteiro (0 para parar): ");
        int valor = kb.nextInt();

        while (valor != 0) {

            if (valor > maiorValor) {
                maiorValor = valor;
            } 
            if (valor < menorValor) {
                menorValor = valor;
            }

            somaValores += valor;
            cont++;

            System.out.println("Informe um número inteiro (0 para parar): ");
            valor = kb.nextInt(); 
        }

        int media = somaValores / cont;

        System.out.println("O menor valor é: " + menorValor + "\nO maior valor é: " + maiorValor + "\nA média dos valores é: " + media);

        kb.close();
    }
}
