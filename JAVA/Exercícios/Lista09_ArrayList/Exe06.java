/*Faça um algoritmo em que o usuário insere um número em um índice específico que ele mesmo informou */
package Lista09_ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe06 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
    
        List<Integer> listaNumeros = new ArrayList<>();
    
        System.out.println("Entre com valores decimais (0 para parar): ");
            int numero = kb.nextInt();

        while (numero != 0) {
            listaNumeros.add(numero);

            numero = kb.nextInt(); 
        }

        System.out.println("Informe um índice a ser substituído: ");
        int indice = kb.nextInt();
        System.out.println("Informe um valor a ser inserido: ");
        int inserir = kb.nextInt();

        listaNumeros.add(indice, inserir);

        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println("Índice: " + i + " = " + listaNumeros.get(i));
        }

        kb.close();
    }
}