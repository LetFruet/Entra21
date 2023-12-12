/*Faça um algoritmo que descubra se uma array de 5 elementos possui o número que o usuário entrou. Printe também o seu índice. */
package Lista05_Revisão;
import java.util.Scanner;
public class Exe07 {
    
     public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int vetor[] = {1, 2, 3, 4, 5}, posicao = 0;
        boolean valorExiste = false;

        System.out.println("Informe um valor a ser buscado no vetor: ");
        int valor = kb.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (valor == vetor[i]) {
                posicao = i;
                valorExiste = true;
            }
        }
          
        while (!valorExiste) {
        System.out.println("Valor não encontrado no vetor. Por favor, insira um novo valor: ");
            valor = kb.nextInt();
            for (int i = 0; i < vetor.length; i++) {
                if (valor == vetor[i]) {
                    posicao = i;
                    valorExiste = true;
                }
            }
        }

        if (valorExiste) {
            System.out.println("O valor existe na posição: [" + posicao + "]");
        } 
        kb.close();
    }
}
