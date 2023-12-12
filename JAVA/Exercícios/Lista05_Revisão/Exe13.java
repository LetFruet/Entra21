/*Foi feita uma pesquisa de audiência de canal de TV em n casas de um determinado bairro de uma cidade Para cada casa visitada, foi 
fornecido o número do canal (4, 5, 9, 12) e o número de pessoas que estavam assistindo a TV naquele horário, considerando que em cada
casa só existia uma televisão. Em casas onde a televisão estava desligada, foi registrado zero para o número do canal e para o número 
de pessoas. Baseado nisto descreva um algoritmo que calcule e escreva, para cada emissora, o percentual de audiência.
A leitura deve ser finalizada quando for informado canal "fim". */
package Lista05_Revisão;
import java.util.Scanner;
public class Exe13 {
    
public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int soma4 = 0, soma5 = 0, soma9 = 0, soma12 = 0, teles4 = 0, teles5 = 0, teles9 = 0, teles12 = 0, somaTeles = 0;

        System.out.print("Informe o número do canal: ");
        String canalS = kb.next();
        
        while(!canalS.equalsIgnoreCase("fim")) { 

        System.out.print("Informe o número de telespectadores do canal: ");
        int telespectadores = kb.nextInt(); 

            int canal = Integer.parseInt(canalS);

            if(canal == 4) {
                soma4 += telespectadores;
                
            } else if(canal == 5) {
                soma5 += telespectadores;

            } else if(canal == 9) {
                soma9 += telespectadores;

            } else if(canal == 12) {
                soma12 += telespectadores;
            } else {
                System.out.println("Canal inexistente");
            }

            somaTeles += telespectadores; 

            teles4 = soma4 * 100 / somaTeles;
            teles5 = soma5 * 100 / somaTeles;
            teles9 = soma9 * 100 / somaTeles;
            teles12 = soma12 * 100 / somaTeles; 

            System.out.print("Informe o número do canal: ");
            canalS = kb.next();
            
            if (canalS.equalsIgnoreCase("fim")) {
                break;
            }
        }

        System.out.println("Percentual de audiência da emissora 4: " + teles4 + "%");
        System.out.println("Percentual de audiência da emissora 5: " + teles5 + "%");
        System.out.println("Percentual de audiência da emissora 9: " + teles9 + "%");
        System.out.println("Percentual de audiência da emissora 12: " + teles12 + "%");

        kb.close();
    }
}
