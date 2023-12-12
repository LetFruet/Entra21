//Escreva um programa onde o usuário informa os dados dos lados de um triangulo depois verifique e retorne se ele é isóscele, escaleno ou equilátero.
package Prova1;
import java.util.Scanner;
public class LeticiaFruet_2 {

    public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Informe os 3 lados de um triângulo: ");
		float lado1 = kb.nextFloat();
        float lado2 = kb.nextFloat();
		float lado3 = kb.nextFloat();

		if (lado1 != lado2 && lado2 != lado3) {
			System.out.println("Triângulo escaleno");
		} else if (lado1 == lado2 && lado2 != lado3) {
			System.out.println("Triângulo isóscele");
        } else {
			System.out.println("Triângulo equilátero");
        }
		
		kb.close(); 
	}
}