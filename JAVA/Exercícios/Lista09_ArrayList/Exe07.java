/*Descreva um algoritmo que leia 5 valores decimais e os coloque em uma Array List. Em seguida, modifique a Array List de modo que os 
valores das POSIÇÕES ímpares sejam aumentados em 5% e os das POSIÇÕES pares sejam aumentados em 2%. Imprima a Array List resultante */
package Lista09_ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe07 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
    
        List<Double> listaNumeros = new ArrayList<>();

        System.out.println("Entre com 5 valores decimais: ");

        for (int i = 0; i < 5; i++) {
            double numero = kb.nextDouble(); 

            if (i % 2 == 0) {
                double numeroPar = numero + (numero * 0.05);
                listaNumeros.add(numeroPar);
            } else {
                double numeroImpar = numero + (numero * 0.02);
                listaNumeros.add(numeroImpar);
            }                
        }

        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println("Índice: " + i + " = " + listaNumeros.get(i));
        }

        kb.close();
    }
}
