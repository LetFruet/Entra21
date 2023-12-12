/*Faça um algoritmo que coloque o número 0 no índice que o usuário escolheu */
package Lista09_ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe05 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
    
        List<Integer> listaNumeros = new ArrayList<>();
    
        System.out.println("Entre com valores decimais (0 para parar): ");
            int numero = kb.nextInt();

        while (numero != 0) {
            listaNumeros.add(numero);

            numero = kb.nextInt(); 
        }

        System.out.println("Informe um índice a ser substituído por 0: ");
        int indice = kb.nextInt();

        listaNumeros.add(indice, 0);

        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println("Índice: " + i + " = " + listaNumeros.get(i));
        }

        kb.close();
    }
}