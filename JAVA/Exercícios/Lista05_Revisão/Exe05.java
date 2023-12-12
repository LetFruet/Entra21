/*Crie uma array de 5 elementos e imprima os últimos elementos por primeiro. */
package Lista05_Revisão;
public class Exe05 {
    
    public static void main(String[] args) {
        
        int vetor[] = new int[5];     
        int vetorInvertido[] = new int[vetor.length];
            
        System.out.print("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i+1;
            System.out.print("\nÍndice [" + i + "] = " + vetor[i]);
        }

        int cont = 0;

        System.out.print("\n\nVetor invertido: ");
        for (int i = vetor.length - 1; i >= 0; i--) {
            vetorInvertido[cont] = vetor[i];
            System.out.print("\nÍndice [" + i + "] = " + vetorInvertido[cont]);
            cont++;
        }
    }
}