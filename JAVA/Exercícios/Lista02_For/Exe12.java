//Descreva um algoritmo que leia n números inteiros e até o usuário entrar com a letra n
//a) escreva o menor valor 
//b) escreva o maior valor
package Lista02_For;
import java.util.Scanner;
public class Exe12 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        char num = kb.nextLine().charAt(0);

        char menorNum = num;
        char maiorNum = num;

        while(num != 'n'){
            if(num > maiorNum){
                maiorNum = num;
            }
            if(num < menorNum){
                menorNum = num; 
            }
            System.out.print("Informe um número inteiro: ");
            num = kb.nextLine().charAt(0);
        }

        System.out.println("O maior número é: " + maiorNum + "\nO menor número é: " + menorNum);
        
        kb.close();
    }
}

