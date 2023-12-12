//Faça um programa que receba um nome de uma fruta como entrada. Faça vários cases para as frutas que você conhece.
//Case "banana": Eu gosto dessa fruta
//Case "pera": Eu não gosto dessa fruta
//Caso o usuário entre um valor desconhecido, escreva: Eu não conheço essa fruta
package Lista02_For;
import java.util.Scanner;
public class ExemploSwitch2 {
    
    public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Informe o nome de uma fruta: ");
		String fruta = kb.next().toUpperCase();

        switch (fruta) {
		case "BANANA":
			System.out.println("Gosto dessa fruta");
            break;
		case "MORANGO":
            System.out.println("Gosto dessa fruta");
            break;
		case "MANGA":
			System.out.println("Não gosto dessa fruta");
            break;
		case "PERA":
			System.out.println("Não gosto dessa fruta");
            break;
        default:
        System.out.println("Fruta não cadastrada");
        }   
		
        kb.close();

	}
}