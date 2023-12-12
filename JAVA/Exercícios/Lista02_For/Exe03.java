//Escreva um algoritmo em que o usuário entre 5 valores de 0 a 1000 
// Começando com o laço (while ou for) em 0 Printe os números que o usuário entrou
package Lista02_For;
import java.util.Scanner;
public class Exe03 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        for (int i = 0; i <= 4; i++) {
            System.out.print("Entre com um valor inteiro: ");
            int num = kb.nextInt();

            if(num < 0 || num > 1000) {
                System.out.print("Número incorreto. Entre com um valor inteiro: ");
                num = kb.nextInt();
            }
                    
            System.out.println(num);

        }

        kb.close();
    }
}
