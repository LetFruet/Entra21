//Crie uma matriz com 12 linhas e 2 colunas. A primeira coluna corresponde aos meses do ano.A segunda corresponde ao lucro que a 
//loja teve no mês. Imprima o seu resultado no formato: No mês 1 a loja teve 2000 de lucro. No mês 2 a loja teve 1500 de lucro...
package Lista04_Matriz;
import java.util.Scanner;
public class Exe01 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double matriz[][] = new double[12][2];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Informe o salário ganho no mês " + (i+1) + ":");
            double salario = kb.nextDouble();

            matriz[i][1] = salario;
            matriz[i][0] = i+1;

        }
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("No mês " + (i+1) + " a loja teve " + matriz[i][1] + " de lucro");
        }
        kb.close();
    }
}