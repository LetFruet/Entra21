//Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes. Trinta deles foram ouvidos 
//e para cada um perguntou-se o sexo (1=feminino 2=masculino), uma nota para o cinema (zero até dez, valor inteiro) e a idade.
//Baseado nisto faça um programa que informe:
//- qual a nota média recebida pelo cinema;
//- qual a nota média atribuída pelos homens;
//- qual a nota atribuída pela mulher mais jovem;
//- quantas das mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema.
package Lista03_Vetor;
import java.util.Scanner;
public class Exe14 {
    
    public class Uni6Exe09 {    
        
        public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
    
            int n = 50;
            int sexo[] = new int[n];
            int nota[] = new int[n];
            int idade[] = new int[n];
    
            for (int i = 0; i < n; i++) {
                System.out.println("Informe o sexo: \n1=feminino \n2=masculino");
                sexo[i] = kb.nextInt();
                    while (sexo[i] != 1 && sexo[i] != 2) {
                        System.out.println("O valor informado não existe. \nEntre com um valor aceito: ");
                        sexo[i] = kb.nextInt(); }
    
                System.out.println("Dê uma nota de 0 a 10 para o cinema: ");
                nota[i] = kb.nextInt();
                    while (nota[i] < 0 || nota[i] > 10) {
                        System.out.println("O valor informado não existe. \nEntre com uma nota aceita: ");
                        nota[i] = kb.nextInt(); }
    
                System.out.println("Informe a sua idade: ");
                idade[i] = kb.nextInt(); 
            }
                
            double mediaG = mediaGeral(nota);
            double mediaH = mediaHomens(sexo, nota);
            double notaMulherJ = mulherJovem(sexo, nota, idade);
            double mulher50 = mulheresAcima(sexo, nota, idade, mediaG);
    
            System.out.println("A média geral do cinema é: " + mediaG);
            System.out.println("A média geral do cinema dada pelos homens é: " + mediaH);
            System.out.println("A nota dada ao cinema pela mulher mais jovem é: " + notaMulherJ);
            System.out.println("Quantidade de mulheres com mais de 50 anos que deram nota superior a média geral recebida pelo cinema é: " + mulher50);
    
            kb.close();
        }
        
        public static double mediaGeral(int nota[]) {
            int soma = 0;
    
            for (int i = 0; i < nota.length; i++) {
                soma += nota[i];
            }
    
            double mediaG = soma / nota.length;
            
            return mediaG;
        }
    
        public static double mediaHomens(int sexo[], int nota[]) {
            int soma = 0, cont = 0;
            double mediaH = 0;
    
            for (int i = 0; i < sexo.length; i++) {
                if (sexo[i] == 2) {
                    soma += nota[i];
                    cont++;
                }
            }
    
            if (cont != 0) {
                mediaH = soma / cont;
                return mediaH;
            }
    
            return 0;  
        }
    
        public static int mulherJovem(int sexo[], int nota[], int idade[]) {
            int notaMulherJ = 0, idadeJovem = Integer.MAX_VALUE;
    
            for (int i = 0; i < idade.length; i++) {
                if (idade[i] < idadeJovem && sexo[i] == 1) {
                    idadeJovem = idade[i];
                    notaMulherJ = nota[i];
                }
            }
            return notaMulherJ;
        }
    
        public static int mulheresAcima(int sexo[], int nota[], int idade[], double mediaG) {
            int mulher50 = 0;
    
            for (int i = 0; i < idade.length; i++) {
                if (sexo[i] == 1 && idade[i] > 50 && nota[i] > mediaG) {
                    mulher50++;
                }
            }
    
            return mulher50;
        }
    }   
}
