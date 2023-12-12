/*Crie um vetor de 100 posições. O usuário vai colocando valores decimais até ele colocar o char n. Calcular:
a) Qual o menor número
b) Qual o maior número
c) Calcular a média */
package Lista05_Revisão;
import java.util.Scanner;
public class Exe17 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        double vetor[] = new double[100];
        int cont = 0; 
        double menorValor = Double.MAX_VALUE, maiorValor = Double.MIN_VALUE, soma = 0;

        System.out.println("Insira valores decimais no vetor (n para parar): ");
        String decimal = kb.nextLine();

        for (int i = 0; i < vetor.length; i++) {
            if(decimal.equalsIgnoreCase("n")) {
                break; 
            } 

            //convertendo char para double
            double armazenarValor = Double.parseDouble(decimal);

            vetor[i] = armazenarValor;
            soma += armazenarValor;
            cont++;
            
            if (armazenarValor > maiorValor) {
                maiorValor = armazenarValor;
            } 
            if (armazenarValor < menorValor) {
                menorValor = armazenarValor;
            }

            System.out.println("Insira valores decimais no vetor (n para parar): ");
                decimal = kb.nextLine();
        }

        double media = soma / cont;

        System.out.println("O menor valor inserido foi: " + menorValor + "\nO maior valor inserido foi: " + maiorValor + 
                           "\nA media dos valores inseridos foi: " + media);

        kb.close();
    }
}