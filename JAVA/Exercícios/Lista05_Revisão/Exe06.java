/*Crie uma array de 5 elementos e descubra:
a) Qual o maior elemento
b) Qual o menor elemento
c) A média dos elementos */
package Lista05_Revisão;
import java.util.Scanner;
public class Exe06 {
        
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int vetor[] = {1, 2, 3, 4, 5};

        int menorValor = Integer.MAX_VALUE, maiorValor = Integer.MIN_VALUE, somaValores = 0, cont = 0;


        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
            } 
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
            }

            somaValores += vetor[i];
            cont++;

        }

        int media = somaValores / cont;

        System.out.println("O menor valor é: " + menorValor + "\nO maior valor é: " + maiorValor + "\nA média dos valores é: " + media);

        kb.close();
    }
}
