/*Faça um programa que calcule o quadrado de um número caso esse número seja par E calcule o dobro desse número caso esse número seja ímpar. 
Retorne o resultado */
package Lista07_Parâmetros;
import java.util.Scanner;
public class Exe03 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        double numero = kb.nextDouble();

        if (numero % 2 == 0 ) {
        System.out.println("O quadrado do número é: " + verificar(numero));
        } else {
            System.out.println("O dobro do número é: " + verificar(numero));
        }
        kb.close();
    }

    public static double verificar(double numero) {

        if (numero % 2 == 0) {
            numero *= numero; 
        } else { 
            numero *= 2; 
        }

        return numero;
    }
} 
