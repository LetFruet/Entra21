//Faça um algoritmo que coloque o número 0 no índice que o usuário escolheu
package Lista03_Vetor;
import java.util.Scanner;
public class Exe06 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int vetor [] = new int[100];

        //populando o vetor
        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("\nPosição: [" + i + "]    Elemento: " + (i+1));
        }

        System.out.println("\nInforme o indice a ser substituído por zero: ");
        int indice = kb.nextInt();

        if (indice >= 0 && indice < vetor.length) {
            vetor[indice] = 0;
            System.out.println("\nVetor modificado: ");
            System.out.print("Posição: [" + indice + "]    Elemento: " + vetor[indice]);
        } else {
            System.out.println("Índice inválido!");
        }

        kb.close();
    }
}
