/*Faça um algoritmo que atribua valores à Array List de acordo com o quadrado do seu índice
[0] = 0
[1] = 1
[2] = 4
[3] = 9
[4] = 16; */
package Lista09_ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe04 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
    
        List<Integer> listaNumeros = new ArrayList<>();
        int quadrado = 0;

        for (int i = 0; i < 10; i++) {
            quadrado = i * i;
            listaNumeros.add(quadrado);

            System.out.println("índice: " + i + " = " + listaNumeros.get(i));
        }

        kb.close();
    }
}