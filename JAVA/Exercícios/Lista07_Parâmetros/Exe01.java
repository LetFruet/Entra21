/*Faça um método que receba 4 números como parâmetros, some os 4 números. Retorne a soma */
package Lista07_Parâmetros;
import java.util.Scanner;;
public class Exe01 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double vetor[] = new double[4];

        System.out.println("Informe 4 números a serem somados: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = kb.nextDouble();
        }
        System.out.println(somaNumeros(vetor));
        kb.close();
    }

    public static double somaNumeros(double[] vetor) {

        double somaNumeros = 0;
        for (int i = 0; i < vetor.length; i++) {
            somaNumeros += vetor[i];
        }

        return somaNumeros;
    }
}