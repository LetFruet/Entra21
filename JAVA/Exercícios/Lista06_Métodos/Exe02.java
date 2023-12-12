/*Faça um método para cada um dos seus seus colegas. O método deve imprimir:
O nome dele(a) é [nome]
Ele(a) tem [idade] anos
Ele(a) é estudante do Entra 21
(Em prints separados)
Faça com que o método tenha o nome do seu colega.
O usuário deve entrar com o nome da pessoa para escolher um dos métodos a ser executado. */
package Lista06_Métodos;
import java.util.Scanner;
public class Exe02 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Informe o nome desejado: ");
        String nome = kb.next();

        if (nome.equalsIgnoreCase("LETICIA")) {
            leticia();
        } else if (nome.equalsIgnoreCase("ALANA")) {
            alana();
        } else if (nome.equalsIgnoreCase("PEDRO")) {
            pedro();
        } else if (nome.equalsIgnoreCase("NICOLAS"))

        kb.close();
    }

    public static void leticia() {
        System.out.println("O nome dela é Letícia");
        System.out.println("Ela tem 18 anos");
        System.out.println("Ela é estudante do Entra21");
    }

    public static void alana() {
        System.out.println("O nome dela é Alana");
        System.out.println("Ela tem 19 anos");
        System.out.println("Ela é estudante do Entra21");
    }

    public static void pedro() {
        System.out.println("O nome dela é Pedro");
        System.out.println("Ela tem 18 anos");
        System.out.println("Ele é estudante do Entra21");
    }

    public static void nicolas() {
        System.out.println("O nome dela é Nicolas");
        System.out.println("Ela tem 21 anos");
        System.out.println("Ele é estudante do Entra21");
    }
}
