//Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes. Trinta deles foram ouvidos e para cada um 
//perguntou-se o sexo (1=feminino 2=masculino), uma nota para o cinema (zero até dez, valor inteiro) e a idade.faça umprograma que informe:
//- qual a nota média recebida pelo cinema;
//- qual a nota média atribuída pelos homens;
//- qual a nota atribuída pela mulher mais jovem;
//- quantas das mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema.
package Lista04_Matriz;
import java.util.Scanner;
public class Exe04 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int matriz[][] = new int[4][3];
        int cont = 0, contAcima50 = 0; 
        double somaNotaHomens = 0, somaNotaGeral  = 0, notaAtribuida = 0, mulherMaisJovem = Integer.MAX_VALUE;

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Informe seu sexo: (1 - feminino / 2 - masculino): ");
            matriz[i][0] = kb.nextInt();

            while (matriz[i][0] != 1 && matriz[i][0] != 2) {
                System.out.println("Entrada incorreta. Por favor informe seu sexo: (1 - feminino / 2 - masculino): ");
                matriz[i][0] = kb.nextInt();
            }
            System.out.println("Informe uma nota inteira (de zero a dez) para o cinema: ");
            matriz[i][1] = kb.nextInt();

            while (matriz[i][1] < 0 || matriz[i][1] > 10) {
                System.out.println("Entrada incorreta. Por favor informe uma nota inteira (de zero a dez) para o cinema: ");
                matriz[i][1] = kb.nextInt();  
            }

            System.out.println("Informe a sua idade: ");
            matriz[i][2] = kb.nextInt();
        }
        
        //média geral
        for (int i = 0; i < matriz.length; i++) {
                somaNotaGeral += matriz[i][1];

        }

        double mediaNotaGeral = somaNotaGeral / matriz.length;
        System.out.println("Nota média recebida pelo cinema: " + mediaNotaGeral);

        //média atribuída pelos homens
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] == 2) {
                somaNotaHomens += matriz[i][1];
                cont++;
            }
        }

        double mediaNotaHomens = somaNotaHomens / cont;
        System.out.println("Nota média atribuída pelos homens: " + mediaNotaHomens);

        //nota mulher mais jovem
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] == 1) {   
                if (matriz[i][0] == 1 && matriz[i][2] < mulherMaisJovem) {
                    mulherMaisJovem = matriz[i][2];
                    notaAtribuida = matriz[i][1];
                }
            }
        }
        System.out.println("Nota atribuída pela mulher mais jovem: " + notaAtribuida);

        //nota mulher 50
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] == 1 && matriz[i][1] > mediaNotaGeral && matriz[i][2] > 50) {   
                    contAcima50++;
            }
        }
        System.out.println("Mulheres com mais de 50 anos que deram nota superior a média recebida pelo cinema: " + contAcima50);
        
        kb.close();
    }
}