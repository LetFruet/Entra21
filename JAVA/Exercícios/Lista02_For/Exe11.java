//Escreva um programa para achar o fatorial de um número
package Lista02_For;
import java.util.Scanner;
public class Exe11 {
	 public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        int num = kb.nextInt();

        int fatorial = 1;

        for(int i = num; i > 0; i--){
            fatorial *= i;
        }

        System.out.println("O fatorial de " + num + " é: " + fatorial);
            
        kb.close();
	 }
}