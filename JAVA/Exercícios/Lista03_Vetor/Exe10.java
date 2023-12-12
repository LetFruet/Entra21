//Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. Em seguida, modifique o vetor de
//modo que os valores das posições ímpares sejam aumentados em 5% e os das posições pares sejam aumentados em 2%. Imprima o vetor resultante
package Lista03_Vetor;
import java.util.Scanner;
public class Exe10 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        double vetor[] = new double[12], entrada = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira 12 valores reais: ");
            entrada = kb.nextDouble();
            vetor[i] = entrada;
        }

        System.out.println("Vetor original:");
            for (int i = 0; i < vetor.length; i++) {
                System.out.print("\nPosição: [" + i + "]    Elemento: " + (vetor[i]));
        }

        System.out.print("\n\nVetor modificado:");
        for (int i = 0; i < vetor.length; i++) {
			if (i % 2 != 0) {
				vetor[i] = vetor[i] + (vetor[i] * 0.02); 
            } else {
				vetor[i] = vetor[i] + (vetor[i] * 0.05);
			}
            System.out.print("\nPosição: [" + i + "]    Elemento: " + (vetor[i]));
		}

        kb.close();
    }
}
