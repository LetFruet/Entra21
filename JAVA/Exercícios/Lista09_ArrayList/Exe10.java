/*Descreva um algoritmo que leia 6 valores reais e os coloque em uma Array List. 
Imprima quais valores desses informados são maiores que a média dos valores. */
package Lista09_ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe10 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double numero = 0, somaNumeros = 0;
        List<Double> listaNumeros = new ArrayList<>();

        System.out.println("Entre com valores reais: ");
        for (int i = 0; i < 6; i++) {
            numero = kb.nextDouble();
            
            listaNumeros.add(numero);

            somaNumeros += numero;
        }

        double mediaNumeros = somaNumeros / 6;

        System.out.println("A média dos valores é: " + mediaNumeros);
        System.out.print("Valores acima da média: ");

        boolean valorAcimaMedia = false;
        for (double valor : listaNumeros) {
            if (valor > mediaNumeros) {
                System.out.print(valor + ", ");
                valorAcimaMedia = true;
            }
        }

        if (!valorAcimaMedia) {
            System.out.println("Nenhum valor acima da média");
        }
        
        kb.close();
    }
}