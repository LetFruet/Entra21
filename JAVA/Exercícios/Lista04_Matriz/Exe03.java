//Faça um código que some duas matrizes de inteiras de tamanhos iguais
package Lista04_Matriz;
import java.util.Scanner;
public class Exe03 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int matriz01[][] = new int[2][2];

        matriz01[0][0] = 4;
        matriz01[0][1] = 12;
        matriz01[1][0] = 2;
        matriz01[1][1] = -3;

        int matriz02[][] = new int[2][2];

        matriz02[0][0] = 8;
        matriz02[0][1] = 24;
        matriz02[1][0] = 4;
        matriz02[1][1] = -6;

        int matrizSoma[][] = new int[2][2];

        matrizSoma[0][0] = matriz01[0][0] + matriz02[0][0];
        matrizSoma[0][1] = matriz01[0][1] + matriz02[0][1];
        matrizSoma[1][0] = matriz01[1][0] + matriz02[1][0];
        matrizSoma[1][1] = matriz01[1][1] + matriz02[1][1];

        System.out.println("A matriz soma é: ");
        for (int i = 0; i < matrizSoma.length; i++) {
            for (int j = 0; j < matrizSoma[i].length; j++) {
                System.out.print(matrizSoma[i][j] + "  ");
            }
        System.out.println();
        }

    kb.close();
    }
}