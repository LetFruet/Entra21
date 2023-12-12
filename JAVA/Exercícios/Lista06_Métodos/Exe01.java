/*Faça um programa em que o usuário entre com um número de 1 a 4. Com o número 1 sendo verão, 2 sendo outono... Faça um método para cada estação do ano
Dependendo de o que o usuário informa, imprima:
    É verão e o tempo está quente
    Ou
    É inverno e está frio */
package Lista06_Métodos;
import java.util.Scanner;
public class Exe01 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Informe um número: \n1- verão; \n2- outono; \n3- inverno; \n4- primavera");
        int estacao = kb.nextInt();

        if (estacao == 1) {
            imprimirVerao();
        } else if (estacao == 2) {
            imprimirOutono();
        } else if (estacao == 3) {
            imprimirInverno();
        } else if (estacao == 4) {
            imprimirPrimavera();
        }

        kb.close();
    }

    public static void imprimirVerao() {
            System.out.println("É verão e o tempo está quente");
    }

    public static void imprimirOutono() {
        System.out.println("É outono e as folhas estão caindo");
    }

    public static void imprimirInverno() {
        System.out.println("É inverno e está frio");
    }
        
    public static void imprimirPrimavera() {
        System.out.println("É primavera e as flores estão lindas");
    }

}
