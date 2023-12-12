/*O usuário vai colocando valores decimais até ele colocar o número 0.
a) Qual o menor número
b) Qual o maior número
c) Calcular a média */
package Lista09_ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Exe03 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double somaNumeros = 0;
        int cont = 0;
        List<Double> listaNumeros = new ArrayList<>();

        System.out.println("Entre com valores decimais (0 para parar): ");
            double numero = kb.nextDouble();

        while (numero != 0) {
            listaNumeros.add(numero);

            somaNumeros += numero;
            cont++;

            numero = kb.nextDouble(); //quando receber 0, não será adicionado a lista 
        }

        listaNumeros.sort(null);
        System.out.println("Menor número: " + listaNumeros.get(1));

        listaNumeros.sort(Collections.reverseOrder());
        System.out.println("Menor número: " + listaNumeros.get(0));

        double mediaNumeros = somaNumeros / cont;

        System.out.println("Média dos valores: " + mediaNumeros);

        kb.close();
    }
}