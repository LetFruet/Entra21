//Faça um algoritmo que inverta a ordem de uma array(o primeiro elemento vai se tornar o último elemento)
package Lista03_Vetor;
import java.util.Scanner;
public class Exe08 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int vetor[] = new int[100];     
        int vetorInvertido[] = new int[vetor.length];
            
        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i+1;
            System.out.print("\nPosição: [" + i + "]    Elemento: " + vetor[i]);
        }

        int cont = 0;

        System.out.print("\n\nVetor invertido: ");
        for (int i = vetor.length - 1; i >= 0; i--) {
            vetorInvertido[cont] = vetor[i];
            System.out.print("\nPosição: [" + i + "]   Elemento: " + vetorInvertido[cont]);
            cont++;
        }
 
        kb.close();
    }
}
