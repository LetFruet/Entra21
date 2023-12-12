/*Faça um programa que receba 3 notas do usuário e informe a média dessas notas. Retorne a média */
package Lista07_Parâmetros;

import java.util.Scanner;

public class Exe05 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double notas[] = new double[3];

        System.out.println("Informe as três notas do usuário: ");
        for (int i = 0; i < 3; i++) {
            notas[i] = kb.nextDouble();
        }

        System.out.println(media(notas));

        kb.close();
    }

    public static String media(double[] notas) {

        double somaNotas = 0;
        for (int i = 0; i < 3; i++) {
            somaNotas += notas[i]; 
        }

        double media = somaNotas / 3;

        return "A média das notas é: " + media;
    }
}
