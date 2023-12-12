/*Faça um código que some duas arrays e imprima tanto as duas arrays originais como a somada */
package Lista06_Métodos;
import java.util.Scanner;
public class Exe09 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double vetor01[] = new double[5];
        double vetor02[] = new double[5];

        System.out.println("Popule o primeiro vetor: ");
        for (int i = 0; i < vetor01.length; i++) {
            vetor01[i] = kb.nextDouble();
        }

        System.out.println("Popule o segundo vetor: ");
        for (int i = 0; i < vetor02.length; i++) {
            vetor02[i] = kb.nextDouble();
        }

        System.out.println("ARRAYS ORIGINAIS: \nVetor 01:");
        for (int i = 0; i < vetor01.length; i++) {
            System.out.print("\nPosição: [" + i + "]    Elemento: " + vetor01[i]);
        }

        System.out.println("\n\nVetor 02: ");
        for (int i = 0; i < vetor02.length; i++) {
            System.out.print("\nPosição: [" + i + "]    Elemento: " + vetor02[i]);
        }

        somaVetores(vetor01, vetor02);
        kb.close();
    }

    public static void somaVetores(double vetor01[], double vetor02[]) {
       
        double vetor03[] = new double[5];

        System.out.println("\n\nARRAY SOMADA: ");
        for (int i = 0; i < vetor03.length; i++) {
            vetor03[i] = vetor01[i] + vetor02[i];
            
            System.out.print("\nPosição: [" + i + "]    Elemento: " + vetor03[i]);

        }
    }  
}