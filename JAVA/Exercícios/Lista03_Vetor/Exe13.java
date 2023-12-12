//Com o objetivo de determinar o índice de afinidade entre um rapaz e uma moça cada um respondeu um questionário com 5 perguntas:
//- Gosta de música sertaneja?
//- Gosta de futebol?
//- Gosta de seriados?
//- Gosta de redes sociais?
//- Gosta da Oktoberfest?

//A resposta a cada pergunta pode ser: SIM, NÃO ou IND (indiferente). O índice de afinidade é medido da seguinte maneira:
//- se ambos deram a mesma resposta soma-se 3 pontos ao índice;
//- se um respondeu IND e o outro SIM ou NÃO soma-se 1;
//- se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice.
//Crie  um  vetor  para  armazenar  as  respostas  do  rapaz  e  outro  para  armazenar  as respostas da moça. 
//Crie um método que possa ler tanto as respostas do rapaz como da moça, e outro para calcular e retornar  a  afinidade.  
//Por  fim, escreva  a  afinidade  considerando  os  seguintes intervalos:
/*| Afinidade | Mensagem                          |
|-----------|-----------------------------------|
| 15        | “Casem!                           |
| 10 a 14   | “Vocês têm muita coisa em comum!” |
| 5 a 9     | “Talvez não dê certo :(”          |
| 0 a 4     | “Vale um encontro.”               |
| -1 a -9   | “Melhor não perder tempo”         |
| -10       | “Vocês se odeiam!”                |*/
package Lista03_Vetor;
import java.util.Scanner;
public class Exe13 {
  
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
      
        String Moca[] = new String[5];
        String Rapaz[] = new String[5];

        lerRespostas(Moca, Rapaz, kb);
        calcularTotal(Moca, Rapaz);

        int total = calcularTotal(Moca, Rapaz);
    
        if (total == 15) {
            System.out.println("Casem!"); }
        else if (total >= 10 && total <= 14) {
            System.out.println("Voces têm muita coisa em comum!"); }
        else if (total >= 5 && total <= 9) {
            System.out.println("Talvez não dê certo :("); }
        else if (total >= 0 && total <= 4) {
            System.out.println("Vale um encontro"); }
        else if (total <= -1 && total >= -9) {
            System.out.println("Melhor não perder tempo"); }
        else {
            System.out.println("Vocês se odeiam!"); }
   
            kb.close();
    }

    public static void lerRespostas(String Moca[], String Rapaz[], Scanner kb) {

        String perguntas[] = { "Gosta de música sertaneja? ", "Gosta de futebol? ", "Gosta de seriados? ", "Gosta de redes sociais? ", "Gosta da Oktoberfest? " };

        System.out.println("Perguntas para a moça!");
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            Moca[i] = kb.next().toUpperCase();
        }
        
        System.out.println();
        System.out.println("Perguntas para o rapaz!");
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            Rapaz[i] = kb.next().toUpperCase();
        }
    }

    public static int calcularTotal(String respostasMoca[], String respostasRapaz[]) {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            if ((respostasMoca[i].equals("SIM") && respostasRapaz[i].equals("SIM")) || (respostasMoca[i].equals("NAO") && respostasRapaz[i].equals("NAO")) || (respostasMoca[i].equals("IND") && respostasRapaz[i].equals("IND"))) {
                total += 3; }
            else if ((respostasMoca[i].equals("NAO") && respostasRapaz[i].equals("SIM")) || (respostasMoca[i].equals("SIM") && respostasRapaz[i].equals("NAO"))) {
                total -= 2; }
            else {
                total += 1; }
        }
        
        return total;
    }
}