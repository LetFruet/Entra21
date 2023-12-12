/*Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Dada a sua massa inicial em Kg, descreva um algoritmo
 que determine o tempo necessário para que essa massa se torne menor que 0,5 gramas. Escreva a massa inicial, a massa final e o tempo. */
package Lista05_Revisão;
import java.util.Scanner;
public class Exe12 {
    
 public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Informe a massa inicial em Kg: ");
        double massaKg = kb.nextDouble(); 

        int segundos = 0; 
        double massaG = massaKg * 1000;

        while(massaG >= 0.5) { 
            massaG /= 2; 
            segundos += 50; 
        }
            
        System.out.print("Massa inicial em Kg: " + massaKg + "\n" + "Massa final em gramas: " + massaG + "\n" + "Tempo em segundos: " + segundos);

        kb.close();
    }
}