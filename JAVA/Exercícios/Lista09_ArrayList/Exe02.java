/*Crie uma Array List e imprima os últimos elementos por primeiro */
package Lista09_ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Exe02 {
    
    public static void main(String[] args) {
        
        List<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(4);
        listaNumeros.add(8);
        listaNumeros.add(3);
        listaNumeros.add(6);
        listaNumeros.add(1);

        listaNumeros.sort(Collections.reverseOrder());

        System.out.println(listaNumeros);

    }
}