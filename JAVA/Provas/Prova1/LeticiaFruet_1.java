//Escreva um programa onde o usuário informa um valor e a opção desejada do que deve ser feito com o valor, sendo as opções 
//1-converter de dólar para real e 2-converter de real para dólar, qualquer outra opção é considerada entrada inválida. 
//Considere a cotação atual do dólar como 4,89. 
package Prova1;
import java.util.Scanner;
public class LeticiaFruet_1 {
 
    public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Informe o valor: ");
		float valor = kb.nextFloat();
		
		System.out.println("Informe a operação desejada: \n1-converter de dólar para real \n2-converter de real para dólar");
		int operacao = kb.nextInt();
		
		if (operacao == 1) {
			float dolarParaReal = valor * 4.89f;
			System.out.println("R$ = " + dolarParaReal);
		} else if (operacao == 2) {
            float realParaDolar = valor / 4.89f ;
			System.out.println("$ = " + realParaDolar);
        }
		
		kb.close(); 
	}
}