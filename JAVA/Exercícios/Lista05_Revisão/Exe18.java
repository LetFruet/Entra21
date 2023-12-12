/*Descreva um algoritmo que leia 12 valores decimais e os coloque em um vetor de 12 posições. Em seguida, modifique o vetor de modo 
que os valores das POSIÇÕES ímpares sejam aumentados em 5% e os das posições pares sejam aumentados em 2%. Imprima o vetor resultante */
package Lista05_Revisão;
import java.util.Scanner;
public class Exe18 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        double vetor[] = new double[12];

        System.out.println("Insira 12 valores reais: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = kb.nextDouble();
        }

        System.out.println("Vetor original:");
            for (int i = 0; i < vetor.length; i++) {
                System.out.print("\nÍndice [" + i + "] = " + (vetor[i]));
        }

        System.out.print("\n\nVetor modificado:");
        for (int i = 0; i < vetor.length; i++) {
			if (i % 2 == 0) {
				vetor[i] = vetor[i] + (vetor[i] * 0.02); 
            } else {
				vetor[i] = vetor[i] + (vetor[i] * 0.05);
			}
            System.out.print("\nÍndice [" + i + "] = " + (vetor[i]));
		}

        kb.close();
    }
}
