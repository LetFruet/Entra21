//Utilizando matrizes, imprima as seguintes figuras:
/*a) * * * *
     * * * *
     * * * *
     * * * *

b) * * * *
   *     *
   *     *
   * * * * 

c) *
   * *
   * * *
   * * * *     

A impressão e atribuição DEVEM ser feitos com for.*/
package Lista04_Matriz;
public class Exe07 {
    
    public static void main(String[] args) {
        
        char matriz01[][] = new char[4][4];
        char matriz02[][] = new char[4][4];
        char matriz03[][] = new char[4][4];

        System.out.println("\nFigura A: ");

        for (int i = 0; i < matriz01.length; i++) {
            for (int j = 0; j < matriz01[i].length; j++) {
                matriz01[i][j] = '*';
                System.out.print(matriz01[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("\nFigura B: ");

        for (int i = 0; i < matriz02.length; i++) {
            for (int j = 0; j < matriz02[i].length; j++) {
                matriz02[0][j] = '*';
                matriz02[i][0] = '*';
                matriz02[3][j] = '*';
                matriz02[i][3] = '*';
                System.out.print(matriz02[i][j] + "  ");
            }
            System.out.println();
        }
        
        System.out.println("\nFigura C: ");

        for (int i = 0; i < matriz03.length; i++) {
            for (int j = 0; j < matriz03[i].length; j++) {
                matriz03[j][0] = '*';
                matriz03[3][j] = '*';
                matriz03[1][1] = '*';
                matriz03[2][1] = '*';
                matriz03[2][2] = '*';
                System.out.print(matriz03[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
