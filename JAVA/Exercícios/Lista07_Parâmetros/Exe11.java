/*Faça um programa em que o usuário entre com um número de 1 a 4. Com o número 1 sendo verão, 2 sendo outono... Faça um método para cada estação do ano
Dependendo de o que o usuário informa, imprima:
    É verão e o tempo está quente
    Ou
    É inverno e está frio */
package Lista07_Parâmetros;
import java.util.Scanner;
public class Exe11 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Informe um número: \n1- verão; \n2- outono; \n3- inverno; \n4- primavera");
        int estacao = kb.nextInt();

        if (estacao == 1) {
            System.out.println(imprimirVerao(estacao));
        } else if (estacao == 2) {
            System.out.println(imprimirOutono(estacao));
        } else if (estacao == 3) {
            System.out.println(imprimirInverno(estacao));
        } else if (estacao == 4) {
            System.out.println(imprimirPrimavera(estacao));
        }

        kb.close();
    }

    public static String imprimirVerao(int estacao) {
            return "É verão e o tempo está quente";
    }

    public static String imprimirOutono(int estacao) {
        return "É outono e as folhas estão caindo";
    }

    public static String imprimirInverno(int estacao) {
        return "É inverno e está frio";
    }
        
    public static String imprimirPrimavera(int estacao) {
        return "É primavera e as flores estão lindas";
    }

}
