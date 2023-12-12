/*Faça um programa que descubra:
a) O maior elemento de um vetor.
b) O menor elemento.
c) A média dos valores */
package Lista07_Parâmetros;
import java.util.Scanner;
public class Exe06 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double vetor[] = new double[10];

        System.out.println("Popule o vetor de " + vetor.length + " elementos: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = kb.nextDouble();
        }

        System.out.println(maiorValor(vetor) + "\n" + menorValor(vetor) + "\n" + mediaValores(vetor));
        kb.close();
    }

    public static String maiorValor(double[] vetor) {
        double maiorValor = Double.MIN_VALUE;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
            }
        }
        return "O maior valor é: " + maiorValor;
    }

    public static String menorValor(double[] vetor) {
        double menorValor = Double.MAX_VALUE;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
            }
        }
        return "O menor valor é: " +  menorValor;
    }

    public static String mediaValores(double[] vetor) {
        double somaValores = 0;

        for (int i = 0; i < vetor.length; i++) {
            somaValores += vetor[i];
        }

        double media = somaValores / vetor.length;
        return "A média é: " + media;
    }
}