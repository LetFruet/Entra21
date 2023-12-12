/*Faça um programa que inverta os valores de duas variáveis
    Por exemplo:
    int a = 5;
    int b = 2;
    Deverá ser:
    a == 2;
    b == 5;
É permitido criar somente uma variável dentro do método
(Fazer esse método funcionar para qualquer valor inserido, além de qualquer tipo de variável inserido). */
package Lista06_Métodos;
import java.util.Scanner;
public class Exe04 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Informe o valor de A: ");
        double valorA = kb.nextDouble();

        System.out.println("Informe o valor de B:");
        double valorB = kb.nextDouble();

        System.out.println("VALORES INICIAIS: \nValor A: " + valorA + "\nValor B: " + valorB);
        inverterValores(valorA, valorB);

        kb.close();
    }

    public static void inverterValores(double valorA, double valorB) {

        double armazenarValor;
        armazenarValor = valorB;
        valorB = valorA;
        valorA = armazenarValor;

        System.out.println("VALORES INVERTIDOS: \nValor A: " + valorA + "\nValor B: " + valorB);
    }
}
