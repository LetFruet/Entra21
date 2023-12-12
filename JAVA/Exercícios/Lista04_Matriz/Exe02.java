//Calcule o determinante da matriz abaixo:
//4  12
//2  -3
package Lista04_Matriz;
import java.util.Scanner;
public class Exe02 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int matriz[][] = new int[2][2];

        matriz[0][0] = 4;
        matriz[0][1] = 12;
        matriz[1][0] = 2;
        matriz[1][1] = -3;

        double determinante = (matriz[0][1] * matriz[1][0]) - (matriz[0][0] * matriz[1][1]);

        System.out.println("O determinante da matriz é: " + determinante);
        
    kb.close();
    }   
}