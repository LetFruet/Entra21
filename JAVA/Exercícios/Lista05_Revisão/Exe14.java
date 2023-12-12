/*Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metros e cresce 3 centímetros por ano.
Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Zé seja maior que Chico. */
package Lista05_Revisão;
import java.util.Scanner;
public class Exe14 {

       public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double alturaZe = 110, alturaChico = 150;
        int ano = 0;

        while(alturaZe <= alturaChico) { 
            alturaChico += 2; 
            alturaZe += 3;  
            ano++; 
        }

        System.out.println("Serão necessários " + ano + " anos para que Zé seja maior que Chico."); 

        teclado.close();
    }
}