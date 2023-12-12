/*Coloque 5 elementos em uma Array List e ordene-os*/
package Lista09_ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Exe01 {
    
    public static void main(String[] args) {
        
        List<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(4);
        listaNumeros.add(8);
        listaNumeros.add(3);
        listaNumeros.add(6);
        listaNumeros.add(1);

        listaNumeros.sort(null);

        System.out.println(listaNumeros);
    }
}