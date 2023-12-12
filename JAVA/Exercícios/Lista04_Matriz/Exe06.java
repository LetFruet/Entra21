//Crie uma matriz 3x5 de inteiros, preencha a matriz e depois:
//a) Informe se a matriz possui elementos repetidos, informe também o elemento;
//b) A quantidade de números pares;
//c) A quantidade de números ímpares maiores do que a média dos elementos da matriz.
package Lista04_Matriz;

import java.util.Scanner;

public class Exe06 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int matriz[][] = new int[3][5];
        int somaElementos = 0,  numeroPar = 0, numeroImpar = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Popule a matriz: ");
                matriz[i][j] = kb.nextInt();
                if (matriz[i][j] == matriz[i][j]) {
                    System.out.print("Elemento " + matriz[i][j] +" repetido, por favor, insira um novo número: ");
                    matriz[i][j] = kb.nextInt();
                }
                somaElementos += matriz[i][j];
            }
            
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    numeroPar++;
                } else if (matriz[i][j] % 2 != 0 && matriz[i][j] > (somaElementos / matriz.length)) {
                    numeroImpar++;
                }
            }
        }

        System.out.println("A quantidade de números pares é: " + numeroPar + 
                        "\nA quantidade de números ímpares maiores do que a média dos elementos da matriz é: " + numeroImpar);

        kb.close();
    }
}
