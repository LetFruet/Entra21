/*Uma loja de departamentos oferece para seus clientes um determinado desconto de acordo com o valor da compra efetuada.
O desconto é de 20% caso o valor da compra seja maior que R$ 500,00 e de 15% caso seja menor ou igual.Descreva um algoritmo que leia 
o valor da compra e escreva o total a pagar a cada compra. Informe também o valor total recebido pela loja ao final do dia.
A leitura deve ser finalizada com a leitura 0 para o valor da compra. */
package Lista05_Revisão;

import java.util.Scanner;

public class Exe10 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double desconto = 0, valorFinal = 0, totalVenda = 0;
        System.out.print("Informe o valor da compra: ");
        double compra = kb.nextDouble();

        while (compra != 0) {
            if (compra > 500) {
                desconto = compra * 0.2;
                valorFinal = compra - desconto;
            } else {
                desconto = compra * 0.15;
                valorFinal = compra - desconto;
            }

            System.out.println("O desconto foi de R$ " + desconto + "\nO valor final da compra é R$ " + valorFinal);

            totalVenda += valorFinal;
                    
            System.out.print("Informe o valor da compra: ");
            compra = kb.nextDouble();
        }

        System.out.println("O valor total recebido pela loja foi: R$ " + totalVenda);
        kb.close();
    }
}
