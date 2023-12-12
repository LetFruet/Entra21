/*Crie um programa Java para encontrar a maior sequência de números seguidos em um vetor. 
Por exemplo, o vetor {6, 0, 1, 5, 4, 3, 4, 5, 6, 1, 6} tem a maior sequência sendo 
{3, 4, 5, 6}. 
Exiba essa sequência. 
Peça para o usuário inserir os valores do vetor de 8 posições.  */
package Prova2;
import java.util.Scanner;
public class LeticiaFruet_2 {
 
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
            
        int vetor[] = new int[8];
        int possivelInicio = 0, inicioSequencia = 0, tamanhoSequencia = 1, tamanhoFinal = 1;

        System.out.println("Entre com 8 valores para popular o vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = kb.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] - 1 == vetor[i-1]) {
                tamanhoSequencia++;
            } else {
                tamanhoSequencia = 1;
                possivelInicio = i;
            }

            if (tamanhoSequencia > tamanhoFinal) {
                tamanhoFinal = tamanhoSequencia;
                inicioSequencia = possivelInicio;
            }
        }

        for(int i = 0; i < tamanhoFinal; i++) {
            System.out.println(vetor[i + inicioSequencia]);
        }

        kb.close();
    }
}
