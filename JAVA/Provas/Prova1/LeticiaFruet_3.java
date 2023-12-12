//Escreva um programa onde o usuário leia altura de 10 pessoas diferentes e depois calcule a média.
package Prova1;
import java.util.Scanner;
public class LeticiaFruet_3 {
       public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
        float soma = 0;
        int cont = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe a altura em metros: ");
            float altura = kb.nextFloat();
            cont++;
            soma += altura;
        }
            float media = soma / cont; 

        System.out.println("A média das alturas é: " + media);

        kb.close();
    }
}
