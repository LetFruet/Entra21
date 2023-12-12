//Faça uma calculadora.
//O usuário entra com dois números e depois com a operação desejada.
//Caso o número da operação seja 1: some os dois números.
//Caso seja 2: subtraia os dois números.
//Caso seja 3: multiplique os dois números.
//Caso seja 4: divida os dois números.
package Lista02_For;
import java.util.Scanner;
public class ExemploSwitch {
    
    public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Informe dois valores: ");
		float valor01 = kb.nextFloat();
		float valor02 = kb.nextFloat();
		
		System.out.println("Informe a operação desejada: \n1- Soma; \n2- Subtração; \n3- Multiplicação; \n4- Divisão.");
		int operacao = kb.nextInt();
		
        switch (operacao) {
		case 1:
			float soma = valor01 + valor02;
			System.out.println(soma);
            break;
		case 2:
			float subtracao = valor01 - valor02;
			System.out.println(subtracao);
            break;
		case 3:
			float multiplicacao = valor01 * valor02; 
			System.out.println(multiplicacao);
            break;
		case 4:
			float divisao = valor01 / valor02;
			System.out.println(divisao); 
		    break;
        }   
		
        kb.close();

	}
}