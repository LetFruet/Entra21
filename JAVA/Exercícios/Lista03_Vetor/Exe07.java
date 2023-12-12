//Faça um algoritmo em que o usuário insere um número em um índice específico que ele mesmo informou
package Lista03_Vetor;
import java.util.Scanner;
public class Exe07 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int vetor [] = new int[100];

        //populando o vetor
        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("\nPosição: [" + i + "]    Elemento: " + (i+1));
        }

        System.out.print("\nInforme o indice a ser substituído: ");
        int indice = kb.nextInt();
        System.out.print("Informe o valor a ser inserido no indice: ");
        int valor = kb.nextInt();

        if (indice >= 0 && indice < vetor.length) {
            System.out.println("\nVetor modificado: ");
            System.out.print("Posição: [" + indice + "]    Elemento: " + valor);
        } else {
            System.out.println("Índice inválido!");
        }

        kb.close();
    }
}