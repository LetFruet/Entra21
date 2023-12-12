/*Faça um programa que exiba o número que o usuário entrou e os 20 números que vem depois dele 
(O parâmetro do método deve ser o número inserido pelo usuário) */
package Lista06_Métodos;
import java.util.Scanner;
public class Exe03 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); 

        System.out.println("Informe um número inteiro: ");
        int numero = kb.nextInt();

        imprimirNumeros(numero);
        
        kb.close();
    }

    public static void imprimirNumeros(int numero) {

        for (int i = numero; i < 20; i++) {
            numero++;
            System.out.println(numero);
        }
    }
}
