/*Faça um programa para ler os valores de duas Array Lists. Crie uma terceira Array List em que cada 
elemento é a soma dos valores contidos nas posições respectivas das Array Lists originais. 
Array List1 = [1,2,3] Array List2 = [1,5,6] Array List3 = [2,7,9]. Exiba, ao final, as três Array Lists na tela. */
package Lista09_ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe11 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double numero = 0;
        List<Double> listaNumeros01 = new ArrayList<>();
        List<Double> listaNumeros02 = new ArrayList<>();
        List<Double> somaListas = new ArrayList<>();

        System.out.println("Entre com 6 valores reais para popular o primeiro ArrayList: ");
        for (int i = 0; i < 6; i++) {
            numero = kb.nextDouble();
            listaNumeros01.add(numero);
        }

        System.out.println("Entre com 6 valores reais para popular o segundo ArrayList: ");
        for (int i = 0; i < 6; i++) {
            numero = kb.nextDouble();          
            listaNumeros02.add(numero);
        }
 
        for (int i = 0; i < 6; i++) {
            double soma = listaNumeros01.get(i) + listaNumeros02.get(i);
            somaListas.add(soma);
        }
        System.out.println("Primeiro ArrayList: " + listaNumeros01);
        System.out.println("Segundo ArrayList: " + listaNumeros02);
        System.out.println("ArrayList soma: " + somaListas);

        kb.close();
    }
}