//Um aluno se vê com necessidade de ajuda na aula e logo tem a ideia de um algoritmo, pensando nisso, ele descreve como deve funcionar: 
//o usuário seleciona a opção onde 
//1) Solicita 3 notas e calcula a média, 
//2) Retorna os dados do aluno em questão (informe seu nome e e-mail), 
//3) Solicita 5 valores, verifica e retorna qual é o maior e o menor. 
//A opção 0 encerra o programa e qualquer outra é declarada como inválida, além disso, informe quantas vezes o usuário escolheu opções 
//válidas antes de encerrar o programa e quantas inválidas. 
package Prova1;
import java.util.Scanner;
public class LeticiaFruet_4 {

      public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
        float maiorValor = Integer.MIN_VALUE, menorValor = Integer.MAX_VALUE;
        int cont = 0;

        System.out.println("Informe o nome e email do aluno: ");
        String nome = kb.next();
        String email = kb.next();
		
		System.out.println("Informe a operação desejada: \n1- Calcular a média, \n2- Retornar os dados do aluno \n3- Verificar qual é o maior e o menor valor \n0 - encerrar ");
		int escolha = kb.nextInt();
		
        while(escolha != 0) {
            cont++;
            if (escolha == 1) {
                System.out.println("Informe as 3 notas do aluno: ");
                float nota1 = kb.nextFloat();
                float nota2 = kb.nextFloat();
                float nota3 = kb.nextFloat();

                float media = (nota1 + nota2 + nota3) / 3;
                System.out.println("A média do aluno é: " + media);

            } else if (escolha == 2) {
                System.out.println("Dados do aluno: \nNome: " + nome + "\nEmail: " + email);
            } else if (escolha == 3) {
                for (int i = 0; i < 5; i++) {
                System.out.println("Informe 5 valores: ");
                float valor = kb.nextFloat();
                    if (valor > maiorValor) {
                        maiorValor = valor;
                    } 
                    if (valor < menorValor) {
                        menorValor = valor;
                    }
                }
                System.out.println("O menor valor é: " + menorValor + "\nO maior valor é: " + maiorValor);  
            } else {
                System.out.println("Entrada inválida");
            }
        	System.out.println("Informe a operação desejada: \n1- Calcular a média, \n2- Retornar os dados do aluno \n3- Verificar qual é o maior e o menor valor \n0 - encerrar ");
		    escolha = kb.nextInt();
        }
            System.out.println("O usuário entro com " + cont + " entradas válidas");

		kb.close(); 
	}
}