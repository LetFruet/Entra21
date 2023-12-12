/*Dado um vetor de números inteiros, com capacidade limitada a 50 elementos, faça um programa que construa um menu com as seguintes opções:
“1 – Incluir valor”: nesta opção inclua o valor no fim do vetor, se houver espaço. Informe o usuário se o valor foi incluído no vetor ou não;
“2 – Pesquisar valor”: nesta opção leia um valor e informe se o mesmo está no vetor;
“3 – Alterar valor”: nesta opção informe um número a ser alterado e um novo número a ser colocado no lugar (só para a primeira ocorrência deste número). Caso o número a ser alterado exista no vetor, substitua-o pelo novo número. Caso contrário, informe “número não encontrado”;
“4 – Mostrar valores”: nesta opção mostre todos os valores armazenados no vetor;
“5 – Sair do sistema”: nesta opção deve ser finalizada a execução do programa.*/
package Lista05_Revisão;
import java.util.Scanner;
public class Exe15 {
  
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
    
        int vetor[] = new int [50];
        int i = 0, posicao = 0;
        boolean encontrado = false;

        System.out.print("Informe o número do menu desejado: \n1: Incluir valor \n2: Pesquisar valor \n3: Alterar valor " +
                            "\n4: Mostrar valores \n5: Sair do sistema ");
        System.out.print("\nSelecione a opção: ");
        int menu = kb.nextInt();

        while (menu < 1 || menu > 5) {
            System.out.println("Opção inexistente. Selecione uma das opções do menu: ");
            menu = kb.nextInt();
        }

        while (menu != 5) {
            switch (menu) {
                case 1:
                    System.out.print("Informe o valor que deseja incluir: ");
                    int incluir = kb.nextInt();
            
                    if (i < vetor.length) {
                        vetor[i] = incluir;
                        System.out.println("Valor " + incluir + " colocado no vetor na posição " + i);
                        i++;
                        break;
                    } else {
                        System.out.println("O vetor está sem espaços, o valor não foi adicionado");
                    }  
                    break;
                case 2:
                    System.out.print("Informe o valor que deseja pesquisar: ");
                    int pesquisar = kb.nextInt();

                    for (i = 0; i < vetor.length; i++) {
                        if (vetor[i] == pesquisar) {
                            encontrado = true;
                            System.out.println("Valor " + pesquisar + " encontrado na posição [" + i + "]");
                            break;
                        }
                    } 
                    if (!encontrado) {
                        System.out.println("Valor " + pesquisar + " não encontrado");                    
                    }
                    break;
                case 3:
                    System.out.print("Informe o valor a ser alterado: ");
                    int alterar = kb.nextInt();

                    for (i = 0; i < vetor.length; i++) {
                        if (vetor[i] == alterar) {
                            encontrado = true;
                            posicao = i;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Valor não encontrado");
                    }

                    System.out.print("Informe o novo valor a ser inserido: ");
                    int inserir = kb.nextInt();

                    vetor[posicao] = inserir;
                    System.out.println("Valor " + alterar + " substituido por "+ inserir);                    
                    break;
                case 4:
                    System.out.println("Vetor resultante:");
                    for (i = 0; i < vetor.length; i++) {
                        System.out.println("índice [" + i + "] = " + vetor[i]);
                    }
                    break;
            }

            System.out.print("\nInforme o número do menu desejado: \n1: Incluir valor \n2: Pesquisar valor \n3: Alterar valor " +
                             "\n4: Mostrar valores \n5: Sair do sistema ");            
            System.out.print("\nSelecione a opção: ");
            menu = kb.nextInt();

            while (menu < 1 || menu > 5) {
                System.out.println("Opção inexistente. Selecione uma das opções do menu: ");
                menu = kb.nextInt();
            }
        }
        kb.close();
    }
}