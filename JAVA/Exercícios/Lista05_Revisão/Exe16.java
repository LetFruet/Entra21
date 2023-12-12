/*Faça um algoritmo em que o usuário insere um número em um índice específico que ele mesmo informou */
package Lista05_Revisão;

import java.util.Scanner;

public class Exe16 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Informe o valor do índice desejado para o vetor: ");
        int indiceVetor = kb.nextInt();

        double vetor[] = new double[indiceVetor];

        System.out.println("Popule o vetor com " + indiceVetor + " elementos: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = kb.nextDouble();
        }

        System.out.println("Vetor resultante:");
        for (int i = 0; i < vetor.length; i++) {
        System.out.println("índice [" + i + "] = " + vetor[i]);

        kb.close();
        }
    }
}
