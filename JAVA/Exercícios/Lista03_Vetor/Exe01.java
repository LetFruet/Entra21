//Crie uma array de 5 elementos e imprima os últimos elementos por primeiro
package Lista03_Vetor;
public class Exe01 {
    public static void main(String[] args) {
 
        int elementos [] = new int[5];

        elementos[0] = 1;
        elementos[1] = 2;
        elementos[2] = 3;
        elementos[3] = 4;
        elementos[4] = 5;

        for(int i = 0; i < elementos.length; i++) {
             System.out.println("Posição: " + i + "      Elemento: " + elementos[i]);
        }
    }
}
