//Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da altura e do sexo (sexo = 'M' ou 'm' para masculino 
//e sexo = 'F' ou 'f' para feminino) de cada pessoa informe a média da altura das mulheres e a média de altura do grupo.
package Lista02_For;
//A leitura deve ser finalizada ao digitar 0 para a altura.
import java.util.Scanner;
public class Exe09 {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int contFem = 0;
        float totalAlturas = 0, somaGeral = 0, mediaGeral = 0, mediaFem = 0, somaFem = 0, altura = -1;
        
        while (altura != 0) {
            System.out.print("Informe a altura: ");
            altura = kb.nextFloat();
            if (altura == 0) {
            	break;
            }
            
            System.out.println("Informe o sexo: \nM- Masculino \nF- Feminino");
            String sexo = kb.next().toUpperCase();
                      	
            totalAlturas++;
            somaGeral += altura;
	            
	            if (sexo.equals("F")) {
	            	contFem++;
	            	somaFem += altura;
	                mediaFem = somaFem / contFem; 
	            } else {
	            	mediaGeral = somaGeral / totalAlturas;
	            }
	        }
       
        System.out.println("A média da altura das mulheres é: " + mediaFem + "\nA média geral é: " + mediaGeral);
        
        kb.close();
    }
}