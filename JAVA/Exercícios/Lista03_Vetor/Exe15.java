//Dado um vetor de números inteiros, com capacidade limitada a 50 elementos, faça um programa que construa um menu com as seguintes opções:
//- “1 – Incluir valor”: nesta opção inclua o valor no fim do vetor, se houver espaço. Informe o usuário se o valor foi incluído no vetor ou não;
//- “2 – Pesquisar valor”: nesta opção leia um valor e informe se o mesmo está no vetor;
//- “3 – Alterar valor”: nesta opção informe um número a ser alterado e um novo número a ser colocado no lugar (só para a primeira ocorrência deste número). Caso o número a ser alterado exista no vetor, substitua-o pelo novo número. Caso contrário, informe “número não encontrado”;
//- “4 – Excluir valor”: nesta opção leia um valor e, caso ele esteja no vetor, exclua-o. Informe o usuário se o valor foi excluído do vetor ou não. A posição que foi excluída o valor deve ser preenchida pelo valor seguinte, sucessivamente até o final dos valores do vetor;
//- “5 – Mostrar valores”: nesta opção mostre todos os valores armazenados no vetor;
//- “0 – Sair do sistema”: nesta opção deve ser finalizada a execução do programa.
//O menu deve-se repetir até que o usuário escolha a opção 0.
package Lista03_Vetor;
import java.util.Scanner;
public class Exe15 {
     
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
    
        int vetor[] = new int [50];
        int menu = 0;

        while (menu != 8) {
            menu = menuDeSelecao(kb);
            switch (menu) {
                case 1:
                    incluirValor(kb, vetor);
                    break;
                case 2:
                    pesquisarValor(kb, vetor);
                    break;
                case 3:
                    alterarValor(kb, vetor);
                    break;
                case 4:
                    excluirValor(kb, vetor);
                    break;
                case 5:
                    mostrarValores(vetor);
                    break;
                case 6:
                    ordenarValores(vetor);
                    break;
                case 7:
                    inverterValores(vetor);
                    break;
            }
        }

        kb.close();
    }
    
    public static int menuDeSelecao(Scanner kb) { 
    
        System.out.println();
        System.out.println("Informe o número do menu desejado: \n1: Incluir valor \n2: Pesquisar valor \n3: Alterar valor " +
                            "\n4: Excluir valor \n5: Mostrar valores \n6: Ordenar valores \n7: Inverter valores \n8: Sair do sistema ");
        System.out.println();
        System.out.print("Selecione a opção: ");
        int menu = kb.nextInt();

        while (menu < 1 || menu > 8) {
            System.out.println("Opção inexistente. Selecione uma das opçõesdo menu: ");
            menu = kb.nextInt();
        }
        
        return menu;
    }

    public static void incluirValor(Scanner kb, int vetor[]) {
        System.out.print("Informe o valor que deseja incluir: ");
        int incluir = kb.nextInt();

        int i = 0;
        while (i < vetor.length) {
            if (vetor[i] == 0) {
                vetor[i] = incluir;
                System.out.println("Valor " + incluir + " colocado no vetor na posição " + i);
                return;
            }
            else i++;
        }
        System.out.println("O vetor está sem espaços, o valor não foi adicionado");
    }
    
    public static void pesquisarValor(Scanner kb, int vetor[]) {
        System.out.print("Informe o valor que deseja pesquisar: ");
        int pesquisar = kb.nextInt();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == pesquisar) {
                System.out.println("Valor " + pesquisar + " encontrado na posição [" + i + "]");
                return;
            }
        }

        System.out.println("Valor " + pesquisar + " não encontrado");
    }

    public static void alterarValor(Scanner kb, int vetor[]) {
        System.out.print("Informe o valor a ser alterado: ");
        int alterar = kb.nextInt();

        int posicao = 0;
        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == alterar) {
                encontrado = true;
                posicao = i;
            }
        }

        if (!encontrado) {
            System.out.println("Valor não encontrado");
            return;
        }
        System.out.print("Informe o novo valor a ser inserido: ");
        int inserir = kb.nextInt();

        vetor[posicao] = inserir;
        System.out.println("Valor " + alterar + " substituido por "+ inserir);
    }
    
    public static void excluirValor(Scanner kb, int vetor[]) {
       System.out.print("Informe o valor a ser excluído: ");
        int excluir = kb.nextInt();

        int posicao = 0;
        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == excluir) {
                encontrado = true;
                posicao = i;
            }
        }
        if (!encontrado) {
            System.out.println("O valor não foi encontrado");
            return;
        }

        vetor[posicao] = 0;
        System.out.println("O valor "+ excluir +" foi excluído");
    }

    public static void mostrarValores(int vetor[]) {
        System.out.print("Valores: [ ");
        for (int i = 0; i < vetor.length; i++) {
            if (i != vetor.length - 1) {
            System.out.print(vetor[i] + ", "); }
            else {
                System.out.println(vetor[i] + " ]"); }
        }
    }

    public static void ordenarValores(int vetor[]) {
     
        int armazenar = 0, i = 0;

        while (i < vetor.length - 1) {    
            if (vetor[i] > vetor[i+1]) {
                armazenar = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = armazenar;
                i = 0; }
            else {
                i += 1;
            }
        }

        System.out.println("O vetor foi ordenado");
    }

    public static void inverterValores(int vetor[]) {
        int armazenar = 0;
        int j = vetor.length-1;

        for (int i = 0; i < vetor.length/2; i++) {
            armazenar = vetor[j];
            vetor[j] = vetor[i];
            vetor[i] = armazenar;
            j--;
        }

        System.out.println("O vetor foi invertido");
    }

    public static void sairDoSistema(int menu) {
    }
}