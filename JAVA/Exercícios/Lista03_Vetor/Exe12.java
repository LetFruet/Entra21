//Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos.Crie um terceiro vetor em que 
//cada elemento é a soma dos valores contidos nas posições respectivas dos vetores originais.Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] 
//vetor3 = [2,7,9].Exiba, ao final, os três vetores na tela.
package Lista03_Vetor;
import java.util.Scanner;
public class Exe12 {
    
        public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int vetor1[] = lerVetor1(kb);
        int vetor2[] = lerVetor2(kb);
        int vetor3[] = somarVetor(vetor1, vetor2);
        imprimirValor(vetor1, vetor2, vetor3);

        kb.close();
    }
    
    public static int[] lerVetor1(Scanner kb) {
        
        int vetor1[] = new int[10];

        System.out.println("Entre com 10 valores inteiros para o vetor 1: ");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = kb.nextInt();
        }

        return vetor1;
    }
    
    public static int[] lerVetor2(Scanner kb) {

        int vetor2[] = new int[10];

        System.out.println("Entre com 10 valores inteiros para o vetor 2: ");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = kb.nextInt();
        }

        return vetor2;
    }

    public static int[] somarVetor(int vetor1[], int vetor2[]) {
        
        int somaVetor[] = new int[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            somaVetor[i] = vetor1[i] + vetor2[i];
        }
        
        return somaVetor;
    }
    
    public static void imprimirValor(int vetor1[], int vetor2[], int vetor3[]) {
           
        System.out.println();
        System.out.print("Vetor1  = [ ");
        for (int i = 0; i < vetor1.length; i++) {
            if (i < vetor1.length - 1) {
            System.out.print(vetor1[i] + ", "); }
            else {
                System.out.print(vetor1[i] + " ]"); }
        }

        System.out.println();
        System.out.print("Vetor2  = [ ");
        for (int i = 0; i < vetor2.length; i++) {
            if (i < vetor1.length - 1) {
            System.out.print(vetor2[i] + ", "); }
            else {
                System.out.print(vetor2[i] + " ]"); }
        }
         
        System.out.println();
        System.out.print("Vetor3  = [ ");
        for (int i = 0; i < vetor3.length; i++) {
            if (i < vetor1.length - 1) {
            System.out.print(vetor3[i] + ", "); }
            else {
                System.out.print(vetor3[i] + " ]"); }
        }
    }
}