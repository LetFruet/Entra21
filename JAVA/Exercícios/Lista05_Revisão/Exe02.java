/*Escreva um algoritmo que imprima o número 2, 5, 8, 11, 14 ...  até o número 5 mil*/
package Lista05_Revisão;
public class Exe02 {
    
    public static void main(String[] args) {
        
       int vetor[] = new int[5003];

       for (int i = 2; i < vetor.length; i = i+3) {
        vetor[i] += i;
        System.out.println(vetor[i]);
       }
    }
}
