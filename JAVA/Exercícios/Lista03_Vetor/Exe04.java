//Faça um algoritmo que descubra se uma array de 5 elementos possui o número que o usuário entrou. Imprima também o seu índice
package Lista03_Vetor;
import java.util.Scanner;
public class Exe04 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int elemento [] = new int[5];

        elemento[0] = 1;
        elemento[1] = 2;
        elemento[2] = 3;
        elemento[3] = 4;
        elemento[4] = 5;

        System.out.println("Informe o valor que deseja buscar no vetor: ");
        int valor = kb.nextInt();

        for(int i = 0; i < elemento.length; i++) {
            if (valor == elemento[i]) { 
                System.out.println("Valor encontrado na posição: " + i);
            }
        }
        
    kb.close();
    }
}