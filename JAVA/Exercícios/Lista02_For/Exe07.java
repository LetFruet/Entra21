//Escreva um algoritmo que leia o número de inscrição e a altura de um atleta e informe:  
//- o número de inscrição e a altura do atleta mais alto;  
//- o número de inscrição e a altura do atleta mais baixo;  
//- a altura média do grupo de atletas.  
//A leitura deve ser finalizada ao digitar 0 para o número de inscrição. 
package Lista02_For;
import java.util.Scanner;
public class Exe07 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int inscricaoAlto = 0, soma = 0, inscricaoBaixo = 0, totalAlturas = 0;
        float maiorAltura = Integer.MIN_VALUE, menorAltura = Integer.MAX_VALUE;

        System.out.print("Escreva o número de inscrição: ");
        int inscriçao = kb.nextInt();
        
        while(inscriçao != 0) { 
            System.out.print("Escreva a altura: ");
            float altura = kb.nextFloat(); 
            totalAlturas++;

            soma += altura;

            if(altura > maiorAltura) {
            	maiorAltura = altura;
            	inscricaoAlto = inscriçao; }

            if(altura < menorAltura) {
            	menorAltura = altura;
            	inscricaoBaixo = inscriçao; }
            
            System.out.print("Escreva o número de inscrição: ");
            inscriçao = kb.nextInt();
        }
     
        float mediaTotal = soma / totalAlturas;

        System.out.print("Número de inscrição do mais alto: " + inscricaoAlto + "\nAltura do mais alto: " + maiorAltura +
        				  "\nNúmero de inscrição do mais baixo: " + inscricaoBaixo + "\nAltura do mais baixo: " + menorAltura +
        				  "\nMédia das alturas dos atletas: " + mediaTotal);

        kb.close();
    }
}
