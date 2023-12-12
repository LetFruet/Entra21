/*Faça um programa que descubra: (Criar um método para cada questão) 
a) O maior elemento de um vetor
b) O menor elemento de um vetor
c) A média dos valores */
package Lista06_Métodos;
import java.util.Scanner;
public class Exe05 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double vetor[] = new double[2];

        System.out.println("Popule o vetor: ");
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = kb.nextDouble();
        }

        maiorElemento(vetor);
        menorElemento(vetor);
        mediaElementos(vetor);

        kb.close();

    }

    public static void maiorElemento(double vetor[]) {

        double maiorValor = Double.MIN_VALUE;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
            }
        }
        System.out.println("O maior valor do vetor é: " + maiorValor);
    }

    public static void menorElemento(double vetor[]) {

        double menorValor = Double.MAX_VALUE;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
            }
        }
        System.out.println("O menor valor do vetor é: " + menorValor);
    }

    public static void mediaElementos(double vetor[]) {
        
        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.println("A média dos elementos do vetor é: " + (soma/vetor.length));
    }
}
