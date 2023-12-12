/*Faça um algoritmo que remova o valor do meio da ArrayList. Caso a array list tenha tamanho par, remova o valor da segunda metade.
Por exemplo: Em uma ArrayList de tamanho 6, remova o valor no índice 4 */
package Lista09_ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe09 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
    
        List<Integer> listaNumeros = new ArrayList<>();
    
        System.out.println("Entre com valores decimais (0 para parar): ");
            int numero = kb.nextInt();

        while (numero != 0) {
            listaNumeros.add(numero);

            numero = kb.nextInt(); 
        }

        listaNumeros.sort(null);
        listaNumeros.remove(listaNumeros.size() / 2);

        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println("Índice: " + i + " = " + listaNumeros.get(i));
        }

        kb.close();
    }
}